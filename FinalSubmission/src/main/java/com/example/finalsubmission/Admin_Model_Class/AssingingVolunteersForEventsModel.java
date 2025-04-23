package com.example.finalsubmission.Admin_Model_Class;

public class AssingingVolunteersForEventsModel {
    private int id;
    private String name;
    public String Event,Experience;

    private String Dept;

    public AssingingVolunteersForEventsModel(int id, String name, String event, String experience, String dept) {
        this.id = id;
        this.name = name;
        Event = event;
        Experience = experience;
        Dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "AssingingVolunteersForEventsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Event='" + Event + '\'' +
                ", Experience='" + Experience + '\'' +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
