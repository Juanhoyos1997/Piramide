module com.example.torredehanoi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.torredehanoi to javafx.fxml;
    exports com.example.torredehanoi;
}