module com.example.finalsubmission {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.finalsubmission to javafx.fxml;
    exports com.example.finalsubmission;
    exports com.example.finalsubmission.Advisor_Controller;
    opens com.example.finalsubmission.Advisor_Controller to javafx.fxml;
}