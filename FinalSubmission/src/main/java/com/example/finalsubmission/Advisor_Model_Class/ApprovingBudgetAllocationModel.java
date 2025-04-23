package com.example.finalsubmission.Advisor_Model_Class;

public class ApprovingBudgetAllocationModel {
    private int Amount_input,Date;
    private String Location,Event;

    public ApprovingBudgetAllocationModel(int amount_input, int date, String location, String event) {
        Amount_input = amount_input;
        Date = date;
        Location = location;
        Event = event;
    }

    public int getAmount_input() {
        return Amount_input;
    }

    public void setAmount_input(int amount_input) {
        Amount_input = amount_input;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    @Override
    public String toString() {
        return "ApprovingBudgetAllocationModel{" +
                "Amount_input=" + Amount_input +
                ", Date=" + Date +
                ", Location='" + Location + '\'' +
                ", Event='" + Event + '\'' +
                '}';
    }
}
