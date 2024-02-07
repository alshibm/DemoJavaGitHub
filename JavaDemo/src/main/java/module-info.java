module com.example.javademo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javademo to javafx.fxml;
    exports com.example.javademo;
}