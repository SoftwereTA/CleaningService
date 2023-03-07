package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Scene1Controller {

    @FXML
    Parent root;
    @FXML
    private PasswordField fieldPass;
    @FXML
    private TextField fieldUser;
    public Parent getRoot() {
        return root;
    }
    @FXML
    public void setFieldPass(String Password ) {
        this.fieldPass.setText("123");
    }
    @FXML
    public PasswordField getFieldPass() {
        return fieldPass;
    }
    public void setFieldUser(String username) {
        this.fieldUser.setText(username);
    }
    public TextField getFieldUser() {
        return fieldUser;
    }


    

    @FXML
    public void login(ActionEvent event) throws IOException {
        String username = fieldUser.getText();
        String password = fieldPass.getText();
        boolean match = CheckCredentials(username, password, "Untitled.txt");
        if (match) {
            switchScene2(event);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("The username and/or password you entered is incorrect.");
            alert.showAndWait();
        }

    }

    @FXML
    public void switchScene2(ActionEvent event) throws IOException {
        String username = fieldUser.getText();
        String password = fieldPass.getText();
        boolean match = CheckCredentials(username, password, "Untitled.txt");
        if (match) {
            Main.primaryStage.setScene(Main.scene2);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("The username and/or password you entered is incorrect.");
            alert.showAndWait();
        }
    }
    @FXML
    public boolean CheckCredentials(String username, String password, String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                reader.close();
                return true;
            }
            else{
                ShowErrorMessage();
            }
        }
        reader.close();
        return false;
    }
    public void ShowErrorMessage() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Failed");
        alert.setHeaderText(null);
        alert.setContentText("The username and/or password you entered is incorrect.");
        alert.showAndWait();
    }
    @FXML
    public void handleLoginButton(ActionEvent event) throws IOException {
        login(event);
    }

    @FXML
    public void exit(ActionEvent event) throws IOException{

        closeApplicationIfConfirmed((Stage) ((Node) event.getSource()).getScene().getWindow());

    }

    public static void closeApplicationIfConfirmed(Window window) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Exit");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("Click OK to exit, or Cancel to continue.");
        alert.initOwner(window);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            closeWindow(window);
        }
    }

    private static void closeWindow(Window window) {
        Stage stage = (Stage) window;
        stage.close();
    }

    public Node getRootNode() {
        return root;
    }
}



