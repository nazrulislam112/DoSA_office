package com.example.finalsubmission.Advisor_Model_Class;

public class MonitoringStudentsForLeadershipModel {
    private int Session_Date;
    private String Description,Select_Mentors,Session_Purpose_Notes;

    public MonitoringStudentsForLeadershipModel(int session_Date, String description, String select_Mentors, String session_Purpose_Notes) {
        Session_Date = session_Date;
        Description = description;
        Select_Mentors = select_Mentors;
        Session_Purpose_Notes = session_Purpose_Notes;
    }

    public int getSession_Date() {
        return Session_Date;
    }

    public void setSession_Date(int session_Date) {
        Session_Date = session_Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSelect_Mentors() {
        return Select_Mentors;
    }

    public void setSelect_Mentors(String select_Mentors) {
        Select_Mentors = select_Mentors;
    }

    public String getSession_Purpose_Notes() {
        return Session_Purpose_Notes;
    }

    public void setSession_Purpose_Notes(String session_Purpose_Notes) {
        Session_Purpose_Notes = session_Purpose_Notes;
    }

    @Override
    public String toString() {
        return "MonitoringStudentsForLeadershipModel{" +
                "Session_Date=" + Session_Date +
                ", Description='" + Description + '\'' +
                ", Select_Mentors='" + Select_Mentors + '\'' +
                ", Session_Purpose_Notes='" + Session_Purpose_Notes + '\'' +
                '}';
    }
}
