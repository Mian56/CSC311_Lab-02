module com.example.loancalculator_csc311 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loancalculator_csc311 to javafx.fxml;
    exports com.example.loancalculator_csc311;
}