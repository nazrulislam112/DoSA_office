package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApprovingEventProposal {

    @FXML
    private DatePicker DateP;

    @FXML
    private TableColumn<ApprovingEventProposal, String> DescriptionTC;

    @FXML
    private TextField DescriptionTF;

    @FXML
    private TableColumn<ApprovingEventProposal, String> EventNameTC;

    @FXML
    private TextField EventNameTf;

    @FXML
    void HomeB(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        EventNameTC.setCellValueFactory(new PropertyValueFactory<ApprovingEventProposal, String>("Event Name"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<ApprovingEventProposal, String>("Description"));

    }

}
