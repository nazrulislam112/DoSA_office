package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitoringStudentWellnessActivitys {

    @FXML
    private TableColumn<MonitoringStudentWellnessActivitys, String> ActivityTypeTC;

    @FXML
    private CheckBox CounselingCB;

    @FXML
    private TextArea FeedBackTA;

    @FXML
    private TableColumn<MonitoringStudentWellnessActivitys, String> FeedbackTC;

    @FXML
    private CheckBox GYMCB;

    @FXML
    private CheckBox YogaCB;

    @FXML
    void GenerateReportB(ActionEvent event) {

    }

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void Submitb(ActionEvent event) {

    }

    @FXML
    void ViewParticipationb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        FeedbackTC.setCellValueFactory(new PropertyValueFactory<MonitoringStudentWellnessActivitys, String>("Feedback"));
        ActivityTypeTC.setCellValueFactory(new PropertyValueFactory<MonitoringStudentWellnessActivitys, String>("Activity Type"));

    }

}

