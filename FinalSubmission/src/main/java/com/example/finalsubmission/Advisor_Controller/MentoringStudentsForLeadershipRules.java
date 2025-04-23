package com.example.finalsubmission.Advisor_Controller;

import com.example.finalsubmission.Advisor_Model_Class.MonitoringStudentsForLeadershipModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class MentoringStudentsForLeadershipRules {

    @FXML
    private TextArea DescriptionTA;

    @FXML
    private TableColumn<MentoringStudentsForLeadershipRules, String> DescriptionTC;

    @FXML
    private TableColumn<MonitoringStudentsForLeadershipModel, String> SelectMentorTC;

    @FXML
    private ComboBox<String> SelectMentorsCB;

    @FXML
    private DatePicker SessionDateDP;

    @FXML
    private TextArea SessionPurposeNoteTA;

    @FXML
    private TableColumn<String, MentoringStudentsForLeadershipRules> SessionPurposeNotesTC;

    @FXML
    void AssignMentorB(ActionEvent event) {

    }

    @FXML
    void HomeB(ActionEvent event) {

    }

    @FXML
    void SubmitB(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        DescriptionTC.setCellValueFactory(new PropertyValueFactory<MentoringStudentsForLeadershipRules, String>("Description"));
        SelectMentorTC.setCellValueFactory(new PropertyValueFactory<MonitoringStudentsForLeadershipModel, String>("Select Mentors"));

    }

}

