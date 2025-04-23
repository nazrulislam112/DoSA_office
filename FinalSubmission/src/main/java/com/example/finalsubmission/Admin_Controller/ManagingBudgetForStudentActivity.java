package com.example.finalsubmission.Admin_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ManagingBudgetForStudentActivity {

    @FXML
    private TableColumn<ManagingBudgetForStudentActivity, String> BudgetTC;

    @FXML
    private TextField BudgetTF;

    @FXML
    private DatePicker DateofEventTF;

    @FXML
    private TableColumn<ManagingBudgetForStudentActivity, String> EventTC;

    @FXML
    private TextField EventTF;

    @FXML
    private TableColumn<ManagingBudgetForStudentActivity, String> LocationTC;

    @FXML
    private TextField LocationTF;

    @FXML
    private TableColumn<ManagingBudgetForStudentActivity, String> OrganizerTC;

    @FXML
    private TextField OrganizerTF;

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void Submitb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        DateofEventTF.setValue(LocalDate.now());


    EventTC.setCellValueFactory(new PropertyValueFactory<ManagingBudgetForStudentActivity, String>("Date of Event"));
    BudgetTC.setCellValueFactory(new PropertyValueFactory<ManagingBudgetForStudentActivity, String>("Budget"));
    EventTC.setCellValueFactory(new PropertyValueFactory<ManagingBudgetForStudentActivity, String>("Event"));
    OrganizerTC.setCellValueFactory(new PropertyValueFactory<ManagingBudgetForStudentActivity, String>("Organizer"));
    LocationTC.setCellValueFactory(new PropertyValueFactory<ManagingBudgetForStudentActivity, String>("Location"));}

}

