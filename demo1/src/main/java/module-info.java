module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
       requires java.sql;
    requires javafx.graphics;
    //requires javax.mail.api;
    requires java.mail;
    requires java.desktop;


    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
}