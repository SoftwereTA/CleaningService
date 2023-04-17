package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class WorkersceneCont {

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textID;

    private String status;
    @FXML
    public void Reloading (ActionEvent event) throws FileNotFoundException {


        File file = new File("C:\\Users\\MsI\\Desktop\\ProjectSoft\\demo1\\Reports.txt");
        Scanner scanner = new Scanner(file);
        String fileContent = "";
        while (scanner.hasNextLine()) {
            fileContent += scanner.nextLine() + "\n";
        }
        scanner.close();

        textArea.setText(fileContent);

    }
    public void Orders() throws IOException {
        String filename = "Order.txt";
        String id = textID.getText();
        // Read the contents of the original file
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
        writer.write(id + "\t" + status + "\n");
        writer.close();
        System.out.println("Order saved to file: " + filename);
    }
    @FXML
    public void Waiting (ActionEvent event) throws IOException {
        status = "Waiting";
        Orders();

    }
    @FXML
    public void In_Treatment (ActionEvent event) throws IOException {
        status = "In Treatment";
        Orders();
    }
    @FXML
    public void Complete (ActionEvent event) throws IOException {
        status = "Complete";
        Orders();
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
