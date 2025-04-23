package com.example.finalsubmission.Admin_Model_Class;

public class ManagingComplaintsAndFeedbackModel {

    private String Complain,Feedback,Dept;

    public ManagingComplaintsAndFeedbackModel(String complain, String feedback, String dept) {
        Complain = complain;
        Feedback = feedback;
        Dept = dept;
    }

    public String getComplain() {
        return Complain;
    }

    public void setComplain(String complain) {
        Complain = complain;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String
    toString() {
        return "ManagingComplaintsAndFeedbackModel{" +
                "Complain='" + Complain + '\'' +
                ", Feedback='" + Feedback + '\'' +
                ", Dept='" + Dept + '\'' +
                '}';
    }


}
