package com.example.finalsubmission;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class AdminDashBoardController1 {

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    private BorderPane AdminBorderPane;

    @FXML
    void AnnualRreportButoon(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Option1View.fxml"));
            AdminBorderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }


    }

    @FXML
    void ComplainandFeedbackButton(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagingComplaints&Feedback.fxml"));
            AdminBorderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void EventSchedulingBt(ActionEvent event) {

    }

    @FXML
    void GymandSwim(ActionEvent event) {

    }

    @FXML
    void SportsEquipmentRequest(ActionEvent event) {

    }

    @FXML
    void StudentAcgtivityBudget(ActionEvent event) {

    }

    @FXML
    void selectStudentactivitryBT(ActionEvent event) {

    }

}
