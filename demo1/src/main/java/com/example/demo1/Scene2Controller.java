package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;


//import javax.awt.Label;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Scene2Controller {

    //public Alert alert;
    public Alert alert ;
    //public Label sizetxt;
    @FXML
    Parent root;
    @FXML
    public TextField sizetxt;
    @FXML
    TextField DelText;
    @FXML
    public TextField ShippingType;
//@FXML
//public TextField ShippingType;
//
//    public void initialize() {
//        ShippingType = new TextField();
//    }
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

    String itemname ;
    String itemsize;
    String cleaningtype;
    int Price;

    @FXML
    void initialize(ActionEvent event) {
        saveToTextFile();
        if (tabPane != null) {
            tabPane.getSelectionModel().select(1);
        }
    }

    private ActionEvent event;

    public void CheckCredentials() {



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

    public Parent getRoot() {
        return root;
    }



    public void LoggedOutMsg() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logged Out");
        alert.setHeaderText("You are now Logged Out");
        alert.showAndWait();
    }

    boolean isCarpetSelected = false;

    public void carpet() {
        itemname = "capet";
        //System.out.println(itemname);
        //return true;
    }

    public void cover() {
        itemname = "cover";
        //System.out.println(itemname);
        //return true;
    }

    public void SizeHandle1(ActionEvent event) throws IOException {
        if (sizetxt != null) {
            sizetxt.setText("you chose 200x100");
            itemsize = "200x100";
        } else {
            // sizetxt is null, handle the error
            //Log.e("TAG", "sizetxt is null");
        }
        int i = 10;
        Scene2Controller.setprice(i);
    }
    static int price;
    private static void setprice(int i) {
        price = i;
    }

    public void SizeHandle2(ActionEvent event) {
        if (sizetxt != null) {
            sizetxt.setText("you chose 200x200");
            itemsize = "200x200";
        } else {
            // sizetxt is null, handle the error
            //Log.e("TAG", "sizetxt is null");
        }
        int i = 20;
        Scene2Controller.setprice(i);
    }

    public void SizeHandle3(ActionEvent event) {
//        sizetxt.setText("you chose 300x200");
        if (sizetxt != null) {
            sizetxt.setText("you chose 300x200");
            itemsize = "300x200";
        } else {
            // sizetxt is null, handle the error
            //Log.e("TAG", "sizetxt is null");
        }
        int i = 30;
        Scene2Controller.setprice(i);
    }

    public void SpeedBH(ActionEvent event) {

        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Speed Cleaning");
            alert.setHeaderText(null);
            int res = getprice() + 15;
            alert.setContentText("The Price: " + res);
            alert.showAndWait();
            this.alert = alert;
        });
        cleaningtype = "Speed Cleaning";
        Price = getprice() + 15;
    }

    public int getprice() {
        return price;
    }

    public void DryBH(ActionEvent event) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Dry Cleaning");
            alert.setHeaderText(null);
            int res = getprice() + 35;
            alert.setContentText("The Price: " + res);
            alert.showAndWait();
        });
        cleaningtype = "Dry Cleaning";
        Price = getprice() + 35;
    }

    public void DeepBH(ActionEvent event) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Deep Cleaning");
            alert.setHeaderText(null);
            int res = getprice() + 19;
            alert.setContentText("The Price: " + res);
            alert.showAndWait();

        });
        cleaningtype = "Deep Cleaning";
        Price = getprice() + 19;
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
//        ShippingType.setText("Pickup");
        if (ShippingType != null) {
            ShippingType.setText("Pickup");
        }
        if (DelText != null) {
            DelText.setVisible(false);
        }
        if (Location != null) {
            Location.setVisible(false);
        }
        Readymessage();
    }

    public void DeliveryBH(ActionEvent event) throws IOException {
//        ShippingType.setText("Delivery");
        if (ShippingType != null) {
            ShippingType.setText("Delivery");
        }
        LocatioHandle(new ActionEvent());
    }


    public void Readymessage() {

        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notification...");
            alert.setHeaderText(null);
            alert.setContentText("You will Receive A Message When It's Ready");
            alert.showAndWait();

        });

    }

    public void saveToTextFile() {
        String filename = "soso1.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)); // change here
            writer.write(itemname + "\t" + itemsize + "\t" + cleaningtype + "\n");
            writer.close();
            //System.out.println("Order saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
