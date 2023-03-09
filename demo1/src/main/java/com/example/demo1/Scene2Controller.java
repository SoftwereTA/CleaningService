package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;


import java.io.IOException;

public class Scene2Controller {

    @FXML
    Parent root;
    @FXML
    TextField sizetxt;
    @FXML
    TextField DelText;
    @FXML
    TextField ShippingType;
    @FXML
    Label Location;
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab Maintab;

    @FXML
    private Tab Shippingtab;

    @FXML
    private Button NEXTbutton;

    @FXML
    void initialize(ActionEvent event) {
        if (tabPane != null) {
            tabPane.getSelectionModel().select(1);
        }
    }

    public void CheckCredentials() {



    }
    public void switchScene1(ActionEvent event) throws IOException {
       Main.primaryStage.setScene(Main.scene1);
        LoggedOutMsg();
    }

    public Parent getRoot() {
        return root;
    }



    public void LoggedOutMsg() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logged Out");
        alert.setHeaderText("You are now Logged Out");
        alert.showAndWait();
    }


    public void SizeHandle1(ActionEvent event) throws IOException {
        sizetxt.setText("you chose 200x100");
        int i = 10;
        Scene2Controller.setprice(i);
    }
    static int price;
    private static void setprice(int i) {
        price = i;
    }

    public void SizeHandle2(ActionEvent event) {
        sizetxt.setText("you chose 200x200");
        int i = 20;
        Scene2Controller.setprice(i);
    }

    public void SizeHandle3(ActionEvent event) {
        sizetxt.setText("you chose 300x200");
        int i = 30;
        Scene2Controller.setprice(i);
    }

    public void SpeedBH(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Speed Cleaning");
        alert.setHeaderText(null);
        int res = getprice()+15;
        alert.setContentText("The Price: "+ res);
        alert.showAndWait();
    }

    public int getprice() {
        return price;
    }

    public void DryBH(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Dry Cleaning");
        alert.setHeaderText(null);
        int res = getprice()+35;
        alert.setContentText("The Price: "+ res);
        alert.showAndWait();
    }

    public void DeepBH(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Deep Cleaning");
        alert.setHeaderText(null);
        int res = getprice()+19;
        alert.setContentText("The Price: "+ res);
        alert.showAndWait();
    }

    public void LocatioHandle(ActionEvent event) throws IOException{
        if (DelText != null) {
            DelText.setVisible(true);
        }
        if (Location != null) {
            Location.setVisible(true);
        }
    }

    public void PickupBH(ActionEvent event) throws  IOException {
        ShippingType.setText("Pickup");

        if (DelText != null) {
            DelText.setVisible(false);
        }
        if (Location != null) {
            Location.setVisible(false);
        }
        Readymessage();
    }

    public void DeliveryBH(ActionEvent event) throws IOException {
        ShippingType.setText("Delivery");
        LocatioHandle(new ActionEvent());
    }

    public void Readymessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification...");
        alert.setHeaderText(null);
        alert.setContentText("You will Receive A Message When It's Ready");
        alert.showAndWait();
    }
}
