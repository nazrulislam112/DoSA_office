package com.example.finalsubmission.Advisor_Model_Class;

public class MonitoringStudentWellnessModel {

    private String Feedback,Activity_Type;

    public MonitoringStudentWellnessModel(String feedback, String activity_Type) {
        Feedback = feedback;
        Activity_Type = activity_Type;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public String getActivity_Type() {
        return Activity_Type;
    }

    public void setActivity_Type(String activity_Type) {
        Activity_Type = activity_Type;
    }

    @Override
    public String toString() {
        return "MonitoringStudentWellnessModel{" +
                "Feedback='" + Feedback + '\'' +
                ", Activity_Type='" + Activity_Type + '\'' +
                '}';
    }
}
