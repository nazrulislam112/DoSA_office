package com.example.finalsubmission.Admin_Model_Class;

public class HandlingMemberForGYMandSwimmingPoolModel {
    private int ID;
    private String name, Dept,Interested;

    public HandlingMemberForGYMandSwimmingPoolModel(int ID, String name, String dept, String interested) {
        this.ID = ID;
        this.name = name;
        Dept = dept;
        Interested = interested;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getInterested() {
        return Interested;
    }

    public void setInterested(String interested) {
        Interested = interested;
    }

    @Override
    public String toString() {
        return "HandlingMemberForGYMandSwimmingPoolModel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", Interested='" + Interested + '\'' +
                '}';
    }
}
