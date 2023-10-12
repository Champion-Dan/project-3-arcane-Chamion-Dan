package com.arcane.util;

public class Event {
    private String eventType;
    private String eventDetails;

    public Event(String eventType, String eventDetails) {
        this.eventType = eventType;
        this.eventDetails = eventDetails;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEventDetails() {
        return eventDetails;
    }
}
