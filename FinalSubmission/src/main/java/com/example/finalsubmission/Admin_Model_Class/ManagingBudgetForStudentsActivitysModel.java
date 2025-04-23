package com.example.finalsubmission.Admin_Model_Class;

public class ManagingBudgetForStudentsActivitysModel {
    private int iDate_Of_Event,Budget;
    private String Event,Organizer,Location;

    public ManagingBudgetForStudentsActivitysModel(int iDate_Of_Event, int budget, String event, String organizer, String location) {
        this.iDate_Of_Event = iDate_Of_Event;
        Budget = budget;
        Event = event;
        Organizer = organizer;
        Location = location;
    }

    public int getiDate_Of_Event() {
        return iDate_Of_Event;
    }

    public void setiDate_Of_Event(int iDate_Of_Event) {
        this.iDate_Of_Event = iDate_Of_Event;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
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

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "ManagingBudgetForStudentsActivitysModel{" +
                "iDate_Of_Event=" + iDate_Of_Event +
                ", Budget=" + Budget +
                ", Event='" + Event + '\'' +
                ", Organizer='" + Organizer + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
