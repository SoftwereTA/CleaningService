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

    private static String  MsgText;
    @FXML
    public void Reloading (ActionEvent event) throws FileNotFoundException {


        File file = new File("C:\\Users\\Msys\\OneDrive\\Desktop\\CleaningSrv\\Reports.txt");
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
        status = "Added";
        MsgText = "Your order has been added to the system and is waiting for a worker to accept it.\n Your order ID is: " + textID.getText() + "\n Thank you for using our service.\n";
        getName(textID.getText());
        Orders();

    }
    @FXML
    public void In_Treatment (ActionEvent event) throws IOException {
        status = "InTreatment";
        MsgText = "Your order has been accepted by a worker and is being treated.\n Your order ID is: " + textID.getText() + "\n Thank you for using our service.\n";
        getName(textID.getText());
        Orders();
    }
    @FXML
    public void Complete (ActionEvent event) throws IOException {
        status = "Complete";
        MsgText = "Your order has been completed.\n Your order ID is: " + textID.getText() + "\n Thank you for using our service.\n";
        getName(textID.getText());
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

    public static String getName(String id) {
        String name = "";
        try (Scanner scanner = new Scanner(new File("Reports.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split("\t");
                if (fields.length >= 3 && fields[0].equals(id)) {
                    name = fields[1];
                    Scene1Controller s1 = new Scene1Controller();
                    String email12 = s1.getEmailAddress(name);
                    String subject = "OrderUpdate";
                    String messageBody = MsgText;
                    sendEmail x = new sendEmail(email12, subject, messageBody);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

}
