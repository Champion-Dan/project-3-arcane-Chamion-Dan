import java.io.FileWriter;
import java.io.IOException;

public class Logger implements EventObserver {
    private FileWriter fileWriter;

    public Logger(int turnNumber) {
        try {
            fileWriter = new FileWriter("Logger-" + turnNumber + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Event event) {
        try {
            fileWriter.write(event.getEventType() + ": " + event.getEventDetails() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
