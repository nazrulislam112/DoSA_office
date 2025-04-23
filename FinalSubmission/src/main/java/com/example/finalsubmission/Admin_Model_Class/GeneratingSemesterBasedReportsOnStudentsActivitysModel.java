package com.example.finalsubmission.Admin_Model_Class;

public class GeneratingSemesterBasedReportsOnStudentsActivitysModel {
    private int Total_Budget,No_of_extra_curricular_Activity,No_Of_Seminer,No_of_Volunteers;
    private String Name_OF_Event;


    public GeneratingSemesterBasedReportsOnStudentsActivitysModel(int total_Budget, int no_of_extra_curricular_Activity, int no_Of_Seminer, int no_of_Volunteers, String name_OF_Event) {
        Total_Budget = total_Budget;
        No_of_extra_curricular_Activity = no_of_extra_curricular_Activity;
        No_Of_Seminer = no_Of_Seminer;
        No_of_Volunteers = no_of_Volunteers;
        Name_OF_Event = name_OF_Event;
    }

    public int getTotal_Budget() {
        return Total_Budget;
    }

    public void setTotal_Budget(int total_Budget) {
        Total_Budget = total_Budget;
    }

    public int getNo_of_extra_curricular_Activity() {
        return No_of_extra_curricular_Activity;
    }

    public void setNo_of_extra_curricular_Activity(int no_of_extra_curricular_Activity) {
        No_of_extra_curricular_Activity = no_of_extra_curricular_Activity;
    }

    public int getNo_Of_Seminer() {
        return No_Of_Seminer;
    }

    public void setNo_Of_Seminer(int no_Of_Seminer) {
        No_Of_Seminer = no_Of_Seminer;
    }

    public int getNo_of_Volunteers() {
        return No_of_Volunteers;
    }

    public void setNo_of_Volunteers(int no_of_Volunteers) {
        No_of_Volunteers = no_of_Volunteers;
    }

    public String getName_OF_Event() {
        return Name_OF_Event;
    }

    public void setName_OF_Event(String name_OF_Event) {
        Name_OF_Event = name_OF_Event;
    }

    @Override
    public String toString() {
        return "GeneratingSemesterBasedReportsOnStudentsActivitysModel{" +
                "Total_Budget=" + Total_Budget +
                ", No_of_extra_curricular_Activity=" + No_of_extra_curricular_Activity +
                ", No_Of_Seminer=" + No_Of_Seminer +
                ", No_of_Volunteers=" + No_of_Volunteers +
                ", Name_OF_Event='" + Name_OF_Event + '\'' +
                '}';
    }
}
