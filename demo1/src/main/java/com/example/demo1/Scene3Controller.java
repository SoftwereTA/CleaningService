package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Scene3Controller {


    //get

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
