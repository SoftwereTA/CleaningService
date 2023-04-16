package com.example.demo1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Application {


    //Added late
    public static Node stage;
    static Stage primaryStage;
    static Scene1Controller scene1Controller;
    public static Scene scene1;
   public static Scene scene2;
    static Scene2Controller scene2Controller;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        AnchorPane pane1 = loader.load();
        scene1 = new Scene(pane1);
        scene1Controller = loader.getController();

        loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        AnchorPane pane2 = loader.load();
        scene2 =new Scene(pane2);
        scene2Controller = loader.getController();
        stage.setScene(scene1);
        stage.show();


        primaryStage.setOnCloseRequest(event -> {
            // Call the confirmExit method in the controller
            Scene1Controller.closeApplicationIfConfirmed(primaryStage);

            // Consume the event to prevent the default close behavior
            event.consume();
        });
    }

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    public static Scene getCurrentScene() {
        if (primaryStage.getScene() == scene1) {
            return scene1;
        } else if (primaryStage.getScene() == scene2) {
            return scene2;
        } else {
            return null;
        }
    }

    public static boolean isApplicationClosed(String applicationName) {
        Process process;
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                process = Runtime.getRuntime().exec("tasklist");
            } else {
                process = Runtime.getRuntime().exec("ps aux");
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(applicationName)) {
                        return false;
                    }
                }
            }
        } catch (IOException e) {
            // handle exception
        }
        return true;
    }
}
