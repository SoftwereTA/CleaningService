package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;


public class Scene1Controller {

    @FXML
    Parent root;

    // @FXML
    // private Stage stage;
    //
    // Stage stage1;
    // @FXML
    // private Button ExitButton;
    // @FXML
    // private AnchorPane ScenePane;
    //
    // private Scene scene;
    // @FXML
    // private Parent root;
    @FXML
    private PasswordField fieldPass;

    @FXML
    private TextField fieldUser;


    public Parent getRoot() {
        return root;
    }


    public void switchScene2(ActionEvent event) throws IOException {
        Main.primaryStage.setScene(Main.scene2);
    }

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

