package com.example.finalsubmission.Admin_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class ManagingComplaintsFeedback {

    @FXML
    private RadioButton ComplainRB;

    @FXML
    private ComboBox<String> DeptCB;

    @FXML
    private TextArea DescriptionTA;

    @FXML
    private RadioButton FeedBackRB;

    @FXML
    void HomeB(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {

    }

    ToggleGroup tg;
    @javafx.fxml.FXML
    public void initialize() {


        tg = new ToggleGroup();
        FeedBackRB.setToggleGroup(tg);
        ComplainRB.setToggleGroup(tg);

        DeptCB.getItems().addAll("CSE","EEE", "BBA", "Civil");

    }

}

