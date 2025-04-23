package com.example.finalsubmission.Admin_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SportsEquipmentRequest {

    @FXML
    private TableColumn<SportsEquipmentRequest, String> ClubTC;

    @FXML
    private TextField ClubTF;

    @FXML
    private TableColumn<SportsEquipmentRequest, String> EquipmentTc;

    @FXML
    private ComboBox<String> EuipmentCB;

    @FXML
    private TableColumn<SportsEquipmentRequest, String> QuantityTC;

    @FXML
    private TextField QuantityTF;

    @FXML
    void Homeb(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        EuipmentCB.getItems().addAll("Football Accessories", "Cricket Accessories", "Badminton Accessories", "Basketball Accessories");

        QuantityTC.setCellValueFactory(new PropertyValueFactory<SportsEquipmentRequest, String>("Quantity"));
        ClubTC.setCellValueFactory(new PropertyValueFactory<SportsEquipmentRequest, String>("Club"));
        EquipmentTc.setCellValueFactory(new PropertyValueFactory<SportsEquipmentRequest, String>("Equipment"));

    }

}

