package com.example.finalsubmission.Admin_Model_Class;

public class ManagingStudentActivityModel {
    private int id,Date;
    private String name, Dept,Activity;

    public ManagingStudentActivityModel(int id, int date, String name, String dept, String activity) {
        this.id = id;
        Date = date;
        this.name = name;
        Dept = dept;
        Activity = activity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
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

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    @Override
    public String toString() {
        return "ManagingStudentActivityModel{" +
                "id=" + id +
                ", Date=" + Date +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", Activity='" + Activity + '\'' +
                '}';
    }
}
