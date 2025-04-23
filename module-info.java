module com.example.dosa_office {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dosa_office to javafx.fxml;
    exports com.example.dosa_office;
}