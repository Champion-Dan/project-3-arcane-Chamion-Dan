package com.arcane.Treasure;
import java.util.ArrayList;
import java.util.List;

// TreasureBag class representing a bag of treasures using the Decorator Pattern
public class TreasureBag extends Treasure {
    // List to store treasures in the bag
    private List<Treasure> treasures = new ArrayList<>();

    // Constructor to initialize the TreasureBag with default values
    public TreasureBag() {
        // The TreasureBag itself has no intrinsic value and is labeled as "Treasure Bag"
        super(0, "Treasure Bag");
    }

    // Method to add a treasure to the bag
    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

    // Overridden method to calculate the total value of treasures in the bag
    @Override
    public int getValue() {
        int totalValue = 0;
        // Summing up the values of individual treasures in the bag
        for (Treasure treasure : treasures) {
            totalValue += treasure.getValue();
        }
        return totalValue;
    }

    // Method to get a string representation of the types of treasures in the bag
    public String getTreasureTypes() {
        StringBuilder types = new StringBuilder();
        // Concatenating the types of individual treasures in the bag
        for (Treasure treasure : treasures) {
            types.append(treasure.getType()).append(", ");
        }
        // Removing the trailing comma and space if there are treasures
        return types.toString().isEmpty() ? "No treasures" : types.substring(0, types.length() - 2);
    }
}
