module com.example.javafxexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxexample to javafx.fxml;
    exports com.example.javafxexample;
}