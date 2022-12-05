module com.example.kilometer_converter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kilometer_converter to javafx.fxml;
    exports com.example.kilometer_converter;
}