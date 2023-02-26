module com.example.countryflag {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.countryflag to javafx.fxml;
    exports com.example.countryflag;
}