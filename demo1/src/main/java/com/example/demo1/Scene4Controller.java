package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
public class Scene4Controller {


    @FXML
    private PasswordField passwordff;
    @FXML
    private TextField usernamefield;
    @FXML
    private TextField emailfield;
    @FXML
    private TextField phonefield;

//create a method that saves the data to a textfile
    public void saveData(ActionEvent event) throws IOException {
        String username = usernamefield.getText();
        String password = passwordff.getText();
        String email = emailfield.getText();
        String phone = phonefield.getText();

        try (FileWriter writer = new FileWriter("Customers.txt", true)) {
            writer.write(username + "," + password +  "," + email + "," + phone + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("Untitled.txt", true)) {
            writer.write(username + "," + password + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        switchScene1(event);
    }


    public void switchScene1(ActionEvent event) throws IOException {
        Platform.runLater(() -> {
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                //stage.setScene(new Scene(root));
                stage.setScene(Main.scene1);

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        //LoggedOutMsg();
    }
}
