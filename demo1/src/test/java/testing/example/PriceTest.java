package testing.example;
import javafx.scene.control.Alert;
import com.example.demo1.Main;
import com.example.demo1.Scene1Controller;
import com.example.demo1.Scene2Controller;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.testfx.api.FxRobot;
import org.testfx.util.WaitForAsyncUtils;

import java.io.IOException;

import static org.junit.Assert.*;

public class PriceTest {

    Scene2Controller obj = new Scene2Controller();

//    @FXML
//    TextField sizetxt;
    @When("i choose 200x100 size")
    public void i_choose_200x100_size() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SizeHandle1(new ActionEvent());
        TextField sizetxt = new TextField();
        sizetxt.setText("you chose 200x100");

// Assign sizetxt to obj.sizetxt
        obj.sizetxt = sizetxt;
        assertNotNull(obj.sizetxt);
        assertEquals("you chose 200x100",sizetxt.getText());
    }

    @When("i choose speed cleaning")
    public void i_choose_speed_cleaning() {
        Platform.runLater(() -> {
            obj.SpeedBH(new ActionEvent());
            Alert alert = obj.alert;
            assertEquals("Speed Cleaning", alert.getTitle());
            assertEquals(null, alert.getHeaderText());
            //assertEquals("The Price: 65", alert.getContentText());
        });
    }

    @Then("the price will be {int}")
    public void the_price_will_be(Integer int1) throws IOException {
        Platform.runLater(() -> {
            Alert alert = obj.alert;
            assertNotNull(alert);
            assertEquals("The Price: "+ obj.getprice(), alert.getContentText());
        });

//        Alert alert = obj.alert;
//        assertNotNull(alert);
//        assertEquals("The Price: "+ obj.getprice(), alert.getContentText());
    }

    @When("i choose 200x200 size")
    public void i_choose_200x200_size() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SizeHandle2(new ActionEvent());
        TextField sizetxt = new TextField();
        sizetxt.setText("you chose 200x200");

// Assign sizetxt to obj.sizetxt
        obj.sizetxt = sizetxt;
        assertNotNull(obj.sizetxt);
        assertEquals("you chose 200x200",sizetxt.getText());
    }

    @When("i choose deep cleaning")
    public void i_choose_deep_cleaning() {
        Platform.runLater(() -> {
            obj.SpeedBH(new ActionEvent());
            Alert alert = obj.alert;
            assertEquals("Deep Cleaning", alert.getTitle());
            assertEquals(null, alert.getHeaderText());
            //assertEquals("The Price: 65", alert.getContentText());
        });
    }

    @When("i choose 300x200 size")
    public void i_choose_300x200_size() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SizeHandle3(new ActionEvent());
        TextField sizetxt = new TextField();
        sizetxt.setText("you chose 300x200");

// Assign sizetxt to obj.sizetxt
        obj.sizetxt = sizetxt;
        assertNotNull(obj.sizetxt);
        assertEquals("you chose 300x200",sizetxt.getText());

    }

    @When("i choose dry cleaning")
    public void i_choose_dry_cleaning() throws InterruptedException {
        Platform.runLater(() -> {
            obj.SpeedBH(new ActionEvent());
            Alert alert = obj.alert;
            assertEquals("Dry Cleaning", alert.getTitle());
            assertEquals(null, alert.getHeaderText());
            //assertEquals("The Price: 65", alert.getContentText());
        });
    }
}
