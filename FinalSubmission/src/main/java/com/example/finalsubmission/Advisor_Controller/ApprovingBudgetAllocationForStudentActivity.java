package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApprovingBudgetAllocationForStudentActivity {

    @FXML
    private TableColumn<ApprovingBudgetAllocationForStudentActivity, String> AmountInputTC;

    @FXML
    private TextField AmountInputTf;

    @FXML
    private TableColumn<ApprovingBudgetAllocationForStudentActivity, String> DateTC;

    @FXML
    private DatePicker Datepicker;

    @FXML
    private TableColumn<ApprovingBudgetAllocationForStudentActivity, String> EventTC;

    @FXML
    private TextField EventTf;

    @FXML
    private TableColumn<ApprovingBudgetAllocationForStudentActivity, String> LocationTC;

    @FXML
    private TextField LocationTf;

    @FXML
    void HomeB(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {



    }
    @FXML
    void initialize(){
        AmountInputTC.setCellValueFactory(new PropertyValueFactory<ApprovingBudgetAllocationForStudentActivity, String>("Amount Input"));
        DateTC.setCellValueFactory(new PropertyValueFactory<ApprovingBudgetAllocationForStudentActivity, String>("Date"));
        EventTC.setCellValueFactory(new PropertyValueFactory<ApprovingBudgetAllocationForStudentActivity, String>("Event"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<ApprovingBudgetAllocationForStudentActivity, String>("Location"));

    }

}

