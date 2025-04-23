package com.example.finalsubmission.Advisor_Model_Class;

public class ApprovingEventModel {

    String eventName;
    int date;
    String description;

    public ApprovingEventModel(int date, String eventName, String description) {
        this.date = date;
        this.eventName = eventName;
        this.description = description;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ApprovingEvent{" +
                "eventName='" + eventName + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }





}
