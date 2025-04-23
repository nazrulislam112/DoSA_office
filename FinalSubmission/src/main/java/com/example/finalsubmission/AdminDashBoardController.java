package com.example.finalsubmission;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminDashBoardController {

    @javafx.fxml.FXML
    public void initialize() {
    }


    @FXML
    void AnnualReports(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GeneratingAnnualStudentEngagementReport.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage refToCurrentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("Annual report");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        } catch (Exception e) {
            //
        }

    }

    @javafx.fxml.FXML
    void ComplaintsAndFeedBackModule(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagingComplaints&Feedback.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            //kaan tanle matha ashbe
            Stage refToCurrentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("Dummy Scene");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        } catch (Exception e) {
            //
        }


    }

    @FXML
    void EventScheduling(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagingEventScheduling.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            //stage.setScene(nextScene);
            nextStage.setTitle("Dummy Scene");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            //
        }


    }

    @FXML
    void EventVolunteersModule(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AssigningVolunteersForEvent.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage refToCurrentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("Annual report");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        } catch (Exception e) {
            //
        }

    }

    @FXML
    void GYMandSwimmingMemberShip(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Membershipforgym&swimmingpool.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage refToCurrentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("Annual report");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        } catch (Exception e) {
            //
        }


    }

    @FXML
    void Logout(ActionEvent event) {

    }

    @FXML
    void SportsEquipmentRequests(ActionEvent event) {

    }

    @FXML
    void StudentActivityBudget(ActionEvent event) {

    }

    @FXML
    void StudentActivityRegistration(ActionEvent event) {

    }

}

