package com.example.finalsubmission.Admin_Model_Class;

public class ManagingEventSchedulingModel {
    private int Date,Time;
    private String Event,Organizer,Vanue;

    public ManagingEventSchedulingModel(int date, int time, String event, String organizer, String vanue) {
        Date = date;
        Time = time;
        Event = event;
        Organizer = organizer;
        Vanue = vanue;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getOrganizer() {
        return Organizer;
    }

    public void setOrganizer(String organizer) {
        Organizer = organizer;
    }

    public String getVanue() {
        return Vanue;
    }

    public void setVanue(String vanue) {
        Vanue = vanue;
    }

    @Override
    public String toString() {
        return "ManagingEventSchedulingModel{" +
                "Date=" + Date +
                ", Time=" + Time +
                ", Event='" + Event + '\'' +
                ", Organizer='" + Organizer + '\'' +
                ", Vanue='" + Vanue + '\'' +
                '}';
    }
}
