package com.example.finalsubmission.Admin_Controller;

import com.example.finalsubmission.AssigningVolunteersForEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MembershipforgymSwimmingpool {

    @FXML
    private ComboBox<String> DeptCM;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> DeptTC;

    @FXML
    private CheckBox GYMCB;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> IDTC;

    @FXML
    private TextField IDTF;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> InterestedTC;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> NameTC;

    @FXML
    private TextField Nametf;

    @FXML
    private CheckBox SwimmingCB;

    @FXML
    void HomeB(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {

    }


    @javafx.fxml.FXML
    public void initialize() {


        DeptCM.getItems().addAll("CSE", "EEE", "BBA", "Civil");

        IDTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("ID"));
        NameTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Name"));
        DeptTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Department"));
        InterestedTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Interested"));

    }






}
