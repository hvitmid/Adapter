module com.example.adaptor_task10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.adaptor_task10 to javafx.fxml;
    exports com.example.adaptor_task10;
}