package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;


import java.io.IOException;

public class Scene2Controller {

    @FXML
    Parent root;
    public void CheckCredentials() {



    }
    public void switchScene1(ActionEvent event) throws IOException {
       Main.primaryStage.setScene(Main.scene1);
        LoggedOutMsg();
    }

    public Parent getRoot() {
        return root;
    }



    public void LoggedOutMsg() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logged Out");
        alert.setHeaderText("You are now Logged Out");
        alert.showAndWait();
    }
}
