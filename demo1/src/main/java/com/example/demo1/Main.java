package com.example.demo1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    static Stage primaryStage;
    static Scene1Controller scene1Controller;
    static Scene scene1;
    static Scene scene2;
    static Scene2Controller scene2Controller;


    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        scene1 = new Scene(loader.load());
        scene1Controller = loader.getController();

        loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        scene2 = new Scene(loader.load());
        scene2Controller = loader.getController();
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
