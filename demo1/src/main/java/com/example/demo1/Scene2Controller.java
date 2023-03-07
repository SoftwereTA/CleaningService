package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;


import java.io.IOException;

public class Scene2Controller {

    @FXML
    Parent root;

    public void switchScene1(ActionEvent event) throws IOException {
       Main.primaryStage.setScene(Main.scene1);
    }

    public Parent getRoot() {
        return root;
    }


}
