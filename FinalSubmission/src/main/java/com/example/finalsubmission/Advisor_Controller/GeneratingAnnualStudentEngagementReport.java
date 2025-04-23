package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class GeneratingAnnualStudentEngagementReport {

    @FXML
    private TableColumn<GeneratingAnnualStudentEngagementReport, String> DeptTC;

    @FXML
    private TableColumn<GeneratingAnnualStudentEngagementReport, String> IDTC;

    @FXML
    private TableColumn<GeneratingAnnualStudentEngagementReport, String> NametC;

    @FXML
    private TableColumn<String, GeneratingAnnualStudentEngagementReport> NoOFEventsTF;

    @FXML
    private TextField ParticipatesINEventsTF;

    @FXML
    private TextField StudentIDTF;

    @FXML
    private TextField StudentNameTf;

    @FXML
    private TextArea Suggestion;

    @FXML
    private ComboBox<String> deptComboB;

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void Submitb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        IDTC.setCellValueFactory(new PropertyValueFactory<GeneratingAnnualStudentEngagementReport, String>("Student ID"));
        NametC.setCellValueFactory(new PropertyValueFactory<GeneratingAnnualStudentEngagementReport, String>("Student Name"));
        DeptTC.setCellValueFactory(new PropertyValueFactory<GeneratingAnnualStudentEngagementReport, String>("Department"));
    }

}

