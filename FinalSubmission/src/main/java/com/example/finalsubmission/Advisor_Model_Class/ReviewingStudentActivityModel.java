package com.example.finalsubmission.Advisor_Model_Class;

public class ReviewingStudentActivityModel {
    private int id;
    private String name, Feedback;

    public ReviewingStudentActivityModel(int id, String name, String feedback) {
        this.id = id;
        this.name = name;
        Feedback = feedback;
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

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    @Override
    public String toString() {
        return "ReviewingStudentActivityModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Feedback='" + Feedback + '\'' +
                '}';
    }
}
