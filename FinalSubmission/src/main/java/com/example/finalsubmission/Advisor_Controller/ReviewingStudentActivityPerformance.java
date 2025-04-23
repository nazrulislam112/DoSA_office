package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReviewingStudentActivityPerformance {

    @FXML
    private TableColumn<ReviewingStudentActivityPerformance, String> FeedBackTC;

    @FXML
    private TextArea FeedbackTA;

    @FXML
    private TableColumn<ReviewingStudentActivityPerformance, String> IDTC;

    @FXML
    private TextField IDTF;

    @FXML
    private TableColumn<ReviewingStudentActivityPerformance, String> Nametc;

    @FXML
    private TextField nametf;

    @FXML
    void AddRecordB(ActionEvent event) {

    }

    @FXML
    void GenerateReportB(ActionEvent event) {

    }

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void Submitb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        IDTC.setCellValueFactory(new PropertyValueFactory<ReviewingStudentActivityPerformance, String>("ID"));
        Nametc.setCellValueFactory(new PropertyValueFactory<ReviewingStudentActivityPerformance, String>("Name"));
        FeedBackTC.setCellValueFactory(new PropertyValueFactory<ReviewingStudentActivityPerformance, String>("FeedBack"));

    }

}

