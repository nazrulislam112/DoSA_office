package com.example.finalsubmission.Advisor_Model_Class;

public class ApprovingStudentClubModel {
    private int Session_Date;
    private String Session_Notes,Select_Mentors;

    public ApprovingStudentClubModel(int session_Date, String session_Notes, String select_Mentors) {
        Session_Date = session_Date;
        Session_Notes = session_Notes;
        Select_Mentors = select_Mentors;
    }

    public int getSession_Date() {
        return Session_Date;
    }

    public void setSession_Date(int session_Date) {
        Session_Date = session_Date;
    }

    public String getSession_Notes() {
        return Session_Notes;
    }

    public void setSession_Notes(String session_Notes) {
        Session_Notes = session_Notes;
    }

    public String getSelect_Mentors() {
        return Select_Mentors;
    }

    public void setSelect_Mentors(String select_Mentors) {
        Select_Mentors = select_Mentors;
    }

    @Override
    public String toString() {
        return "ApprovingStudentClubModel{" +
                "Session_Date=" + Session_Date +
                ", Session_Notes='" + Session_Notes + '\'' +
                ", Select_Mentors='" + Select_Mentors + '\'' +
                '}';
    }
}
