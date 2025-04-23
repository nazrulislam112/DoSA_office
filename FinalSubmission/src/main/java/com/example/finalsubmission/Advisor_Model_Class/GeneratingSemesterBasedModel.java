package com.example.finalsubmission.Advisor_Model_Class;

public class GeneratingSemesterBasedModel {
    private int  Student_id,Participate_in_Events;
    private String Suggestions,Student_Name,Dept;

    public GeneratingSemesterBasedModel(int student_id, int participate_in_Events, String suggestions, String student_Name, String dept) {
        Student_id = student_id;
        Participate_in_Events = participate_in_Events;
        Suggestions = suggestions;
        Student_Name = student_Name;
        Dept = dept;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public int getParticipate_in_Events() {
        return Participate_in_Events;
    }

    public void setParticipate_in_Events(int participate_in_Events) {
        Participate_in_Events = participate_in_Events;
    }

    public String getSuggestions() {
        return Suggestions;
    }

    public void setSuggestions(String suggestions) {
        Suggestions = suggestions;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "GeneratingSemesterBasedModel{" +
                "Student_id=" + Student_id +
                ", Participate_in_Events=" + Participate_in_Events +
                ", Suggestions='" + Suggestions + '\'' +
                ", Student_Name='" + Student_Name + '\'' +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
