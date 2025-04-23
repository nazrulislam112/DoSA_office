package com.example.finalsubmission.Admin_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentActivityRegistration {

    @FXML
    private ComboBox<String> ActivityCB;

    @FXML
    private TableColumn<StudentActivityRegistration, String> ActivityTC;

    @FXML
    private DatePicker DateP;

    @FXML
    private ComboBox<String> DeptCB;

    @FXML
    private TableColumn<StudentActivityRegistration, String> DeptTC;

    @FXML
    private TableColumn<StudentActivityRegistration, String> IDTC;

    @FXML
    private TextField IDTF;

    @FXML
    private TableColumn<StudentActivityRegistration, String> NameTC;

    @FXML
    private TextField Nametf;

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        IDTC.setCellValueFactory(new PropertyValueFactory<StudentActivityRegistration, String>("ID"));
        NameTC.setCellValueFactory(new PropertyValueFactory<StudentActivityRegistration, String>("Name"));
        DeptTC.setCellValueFactory(new PropertyValueFactory<StudentActivityRegistration, String>("Dept"));
        ActivityTC.setCellValueFactory(new PropertyValueFactory<StudentActivityRegistration, String>("Activity"));

    }

    }

