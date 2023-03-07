package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class Scene1Controller {

    @FXML
    Parent root;
    private PasswordField fieldPass;

    @FXML
    private TextField fieldUser;


    public Parent getRoot() {
        return root;
    }

    private TextField usernameField;

    @FXML
    private TextField passwordField;

    public void login(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (TextFieldsComparator.compareTextFieldsToTextFile(username, password, "path/to/textfile.txt")) {
            switchScene2(event);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("The username and/or password you entered is incorrect.");
            alert.showAndWait();
        }
    }

    private void switchScene2(ActionEvent event) throws IOException {
        Main.primaryStage.setScene(Main.scene2);
    }
}
//    public void switchScene2(ActionEvent event) throws IOException {
//
//        Main.primaryStage.setScene(Main.scene2);
//    }

    public void exit(ActionEvent event) throws IOException{

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Are you sure you want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
                System.out.println("Exit has been done successfully");
                Platform.exit();
        } else {
                System.out.println("Error: ScenePane is null");
        }

    }
}

