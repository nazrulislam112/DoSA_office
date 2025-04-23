package com.example.finalsubmission.Admin_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class GeneratingSemesterBasedReportsONStudentsActivity {

    @FXML
    private TextField NumberOFEventTF;

    @FXML
    private TextField NumberOFSeminerTf;

    @FXML
    private TextField NumberOFextraCurricularActivitiestf;

    @FXML
    private TableColumn<GeneratingSemesterBasedReportsONStudentsActivity, String> Numberofeventtc;

    @FXML
    private TextField Numberofvolunteerstf;

    @FXML
    private TextField TotalBudgetTF;

    @FXML
    private TableColumn<GeneratingSemesterBasedReportsONStudentsActivity, String> numberofextracurricularactivitytc;

    @FXML
    private TableColumn<GeneratingSemesterBasedReportsONStudentsActivity, String> numberofseminertc;

    @FXML
    private TableColumn<GeneratingSemesterBasedReportsONStudentsActivity, String> numberofvolunteerstc;

    @FXML
    private TableColumn<GeneratingSemesterBasedReportsONStudentsActivity, String> totalbudgettc;

    @FXML
    void homeb(ActionEvent event) {

    }

    @FXML
    void submitb(ActionEvent event) {

    }
    @javafx.fxml.FXML
    public void initialize() {


        totalbudgettc.setCellValueFactory(new PropertyValueFactory<GeneratingSemesterBasedReportsONStudentsActivity, String>("Total Budget"));
        numberofextracurricularactivitytc.setCellValueFactory(new PropertyValueFactory<GeneratingSemesterBasedReportsONStudentsActivity, String>("No of Extra Curricular Activities"));
        numberofseminertc.setCellValueFactory(new PropertyValueFactory<GeneratingSemesterBasedReportsONStudentsActivity, String>("No of Seminar"));
        numberofvolunteerstc.setCellValueFactory(new PropertyValueFactory<GeneratingSemesterBasedReportsONStudentsActivity, String>("No odf Volunteers"));
        Numberofeventtc.setCellValueFactory(new PropertyValueFactory<GeneratingSemesterBasedReportsONStudentsActivity, String>("No of Events"));

    }

}

