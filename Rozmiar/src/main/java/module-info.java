module com.example.rozmiar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rozmiar to javafx.fxml;
    exports com.example.rozmiar;
}