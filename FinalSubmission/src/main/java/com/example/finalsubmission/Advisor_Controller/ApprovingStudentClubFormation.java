package com.example.finalsubmission.Advisor_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApprovingStudentClubFormation {

    @FXML
    private ComboBox<String> SelectMentorCB;

    @FXML
    private TableColumn<ApprovingStudentClubFormation, String> SelectMentorTC;

    @FXML
    private DatePicker SessionDateDP;

    @FXML
    private TextArea SessionNotesTA;

    @FXML
    private TableColumn<ApprovingStudentClubFormation, String> SessionNotesTC;

    @FXML
    void Scheduleb(ActionEvent event) {

    }

    @FXML
    void homeb(ActionEvent event) {

    }

    @FXML
    void savefeedbackb(ActionEvent event) {

    }

    @FXML
    void submitb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {



        SessionNotesTC.setCellValueFactory(new PropertyValueFactory<ApprovingStudentClubFormation, String>("Session Notes"));
        SelectMentorTC.setCellValueFactory(new PropertyValueFactory<ApprovingStudentClubFormation, String>("Select Mentors"));

    }

}

