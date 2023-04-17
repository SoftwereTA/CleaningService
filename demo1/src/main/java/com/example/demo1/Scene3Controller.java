package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Scene3Controller {

    @FXML
    private TextField cashfield;
    @FXML
    private TextField salesfield;
    @FXML
    private Tab workertab;
    private int totalCash = 0;
    private int numOrders = 0;

    @FXML
    private TextField firstname;

    @FXML
     private TextField lastname;

    @FXML
     private TextField userfield;

    @FXML
     private TextField emailfield;

    @FXML
     private TextField phonefield;

    @FXML
     private DatePicker datepicker;

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

  public void calculateCash(ActionEvent event) throws IOException {

   try (BufferedReader reader = new BufferedReader(new FileReader("Reports.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
     String[] tokens = line.split("\t");
     totalCash += Integer.parseInt(tokens[tokens.length - 1]);
    }
   } catch (IOException e) {
    e.printStackTrace();
   }
   cashfield.setText(String.valueOf(totalCash));
  }

 public void countOrders(ActionEvent event) throws IOException {
  try (BufferedReader reader = new BufferedReader(new FileReader("Reports.txt"))) {
   while (reader.readLine() != null) {
    numOrders++;
   }
  } catch (IOException e) {
   e.printStackTrace();
  }

  salesfield.setText(String.valueOf(numOrders));
 }

 public void saveUserData(ActionEvent event) throws IOException {
  String fname = "";
  String lname = "";
  String username = "";
  String email = "";
  String phone = "";
  String birthday = "";
  try {
   fname = firstname.getText();
   lname = lastname.getText();
   username = userfield.getText();
   email = emailfield.getText();
   phone = phonefield.getText();
   if (datepicker.getValue() != null) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    birthday = datepicker.getValue().format(formatter);
   }
  } catch (NullPointerException e) {
   e.printStackTrace();
  }

  try (FileWriter writer = new FileWriter("Wrokers.txt", true)) {
   writer.write(fname + "," + lname + "," + username + "," + email + "," + phone + "," + birthday + "\n");
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}




