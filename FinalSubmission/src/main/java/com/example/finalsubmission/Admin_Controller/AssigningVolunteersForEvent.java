package com.example.finalsubmission;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Arrays;

public class AssigningVolunteersForEvent {

    @FXML
    private RadioButton BadRdB;

    @FXML
    private ComboBox<String> DeptCB;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> DeptTC;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> EventTC;

    @FXML
    private TextField EventTF;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> Experiencetc;

    @FXML
    private RadioButton GoodRDb;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> IDTC;

    @FXML
    private TextField IDTF;

    @FXML
    private TableColumn<AssigningVolunteersForEvent, String> NameTC;

    @FXML
    private TextField Nametf;

    @FXML
    void HomeB(ActionEvent event) {

    }

    @FXML
    void Submitb(ActionEvent event) {



    }
    ToggleGroup tg;

    @FXML
    void initialize() {

        tg = new ToggleGroup();
        GoodRDb.setToggleGroup(tg);
        BadRdB.setToggleGroup(tg);

        DeptCB.getItems().addAll("CSE","EEE", "BBA", "Civil");

        IDTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("ID"));
        NameTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Name"));
        EventTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Event"));
        Experiencetc.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Experience"));
        DeptTC.setCellValueFactory(new PropertyValueFactory<AssigningVolunteersForEvent, String>("Department"));

    }

    }

