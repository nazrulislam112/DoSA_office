package com.example.finalsubmission.Advisor_Model_Class;

public class EvaluatingTheEffectivenessofCulturalModel {
    private int Success_Rate,No_of_student,No_of_Faculty,No_Of_Alumni;
    private String Impact_Analysis,Event_Name,Organizer;

    public EvaluatingTheEffectivenessofCulturalModel(int success_Rate, int no_of_student, int no_of_Faculty, int no_Of_Alumni, String impact_Analysis, String event_Name, String organizer) {
        Success_Rate = success_Rate;
        No_of_student = no_of_student;
        No_of_Faculty = no_of_Faculty;
        No_Of_Alumni = no_Of_Alumni;
        Impact_Analysis = impact_Analysis;
        Event_Name = event_Name;
        Organizer = organizer;
    }

    public int getSuccess_Rate() {
        return Success_Rate;
    }

    public void setSuccess_Rate(int success_Rate) {
        Success_Rate = success_Rate;
    }

    public int getNo_of_student() {
        return No_of_student;
    }

    public void setNo_of_student(int no_of_student) {
        No_of_student = no_of_student;
    }

    public int getNo_of_Faculty() {
        return No_of_Faculty;
    }

    public void setNo_of_Faculty(int no_of_Faculty) {
        No_of_Faculty = no_of_Faculty;
    }

    public int getNo_Of_Alumni() {
        return No_Of_Alumni;
    }

    public void setNo_Of_Alumni(int no_Of_Alumni) {
        No_Of_Alumni = no_Of_Alumni;
    }

    public String getImpact_Analysis() {
        return Impact_Analysis;
    }

    public void setImpact_Analysis(String impact_Analysis) {
        Impact_Analysis = impact_Analysis;
    }

    public String getEvent_Name() {
        return Event_Name;
    }

    public void setEvent_Name(String event_Name) {
        Event_Name = event_Name;
    }

    public String getOrganizer() {
        return Organizer;
    }

    public void setOrganizer(String organizer) {
        Organizer = organizer;
    }

    @Override
    public String toString() {
        return "EvaluatingTheEffectivenessofCulturalModel{" +
                "Success_Rate=" + Success_Rate +
                ", No_of_student=" + No_of_student +
                ", No_of_Faculty=" + No_of_Faculty +
                ", No_Of_Alumni=" + No_Of_Alumni +
                ", Impact_Analysis='" + Impact_Analysis + '\'' +
                ", Event_Name='" + Event_Name + '\'' +
                ", Organizer='" + Organizer + '\'' +
                '}';
    }
}
