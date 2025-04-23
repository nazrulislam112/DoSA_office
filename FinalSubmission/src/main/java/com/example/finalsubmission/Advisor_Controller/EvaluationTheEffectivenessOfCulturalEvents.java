package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EvaluationTheEffectivenessOfCulturalEvents {

    @FXML
    private TextField EventNAmeTF;

    @FXML
    private TextArea ImpactAnalysisTA;

    @FXML
    private TextField NumofAlumniTF;

    @FXML
    private TextField NumofFacultyTF;

    @FXML
    private TextField NumofStudentTF;

    @FXML
    private TextField OrganizerTF;

    @FXML
    private TableColumn<EvaluationTheEffectivenessOfCulturalEvents, String> eventnametc;

    @FXML
    private TableColumn<EvaluationTheEffectivenessOfCulturalEvents, String> impactanalysistc;

    @FXML
    private TableColumn<EvaluationTheEffectivenessOfCulturalEvents, String> numofalumnitc;

    @FXML
    private TableColumn<EvaluationTheEffectivenessOfCulturalEvents, String> numoffacultytc;

    @FXML
    private TableColumn<String, EvaluationTheEffectivenessOfCulturalEvents> numofstudenttc;

    @FXML
    private TableColumn<EvaluationTheEffectivenessOfCulturalEvents, String> organizertc;

    @FXML
    private ComboBox<String> successRateCB;

    @FXML
    private TableColumn<EvaluationTheEffectivenessOfCulturalEvents, String> successrateTC;

    @FXML
    void generateimpactreportb(ActionEvent event) {

    }

    @FXML
    void homeb(ActionEvent event) {

    }

    @FXML
    void submitb(ActionEvent event) {

    }

    @FXML
    void initialize() {

        successRateCB.getItems().addAll("Select Course Type","high", "Low", "Medium", "Core", "Optional");


        successrateTC.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("Success Rate"));
        numoffacultytc.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("No Of Student"));
        numoffacultytc.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("No Of Faculty"));
        numofalumnitc.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("No Of Alumni"));
        impactanalysistc.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("Impact Analysis"));
        eventnametc.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("Event Name"));
        organizertc.setCellValueFactory(new PropertyValueFactory<EvaluationTheEffectivenessOfCulturalEvents, String>("Organizer"));

    }

}

