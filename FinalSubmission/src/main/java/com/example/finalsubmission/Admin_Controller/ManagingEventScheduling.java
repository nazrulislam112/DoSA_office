package com.example.finalsubmission.Admin_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ManagingEventScheduling {

    @FXML
    private DatePicker DateP;

    @FXML
    private TableColumn<ManagingEventScheduling, String> EventTC;

    @FXML
    private TextField EventTF;

    @FXML
    private ComboBox<String> OrganizerCB;

    @FXML
    private TableColumn<ManagingEventScheduling, String> OrganizerTC;

    @FXML
    private TableColumn<ManagingEventScheduling, String> TimeTC;

    @FXML
    private TextField TimeTF;

    @FXML
    private TableColumn<ManagingEventScheduling, String> VAnueTC;

    @FXML
    private TextField VanueTF;

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void Submitb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {

        OrganizerCB .getItems().addAll("Jukti","Music club", "Dance Club");
        DateP.setValue(LocalDate.now());

        TimeTC.setCellValueFactory(new PropertyValueFactory<ManagingEventScheduling, String>("time"));
        EventTC.setCellValueFactory(new PropertyValueFactory<ManagingEventScheduling, String>("event"));
        OrganizerTC.setCellValueFactory(new PropertyValueFactory<ManagingEventScheduling, String>("organizer"));
        VAnueTC.setCellValueFactory(new PropertyValueFactory<ManagingEventScheduling, String>("vanue"));
    }

}

