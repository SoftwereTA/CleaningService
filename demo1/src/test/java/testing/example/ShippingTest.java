package testing.example;

import com.example.demo1.Scene2Controller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ShippingTest {

    Scene2Controller obj = new Scene2Controller();


    @When("i choose delivery method")
    public void i_choose_delivery_method() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.DeliveryBH(new ActionEvent());
    }

    @Then("i should be asked for my location")
    public void i_should_be_asked_for_my_location() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.LocatioHandle(new ActionEvent());
    }

    @When("i choose pickup method")
    public void i_choose_pickup_method() throws IOException {
        Platform.runLater(() -> {
            try {
                obj.PickupBH(new ActionEvent());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            assertEquals("Pickup",obj.ShippingType.getText());

        });

//        obj.PickupBH(new ActionEvent());
//        assertEquals("Pickup",obj.ShippingType.getText());
    }

    @Then("i should receive a message when it's ready")
    public void i_should_receive_a_message_when_it_s_ready() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
//        obj.Readymessage();
        Platform.runLater(() -> {
            obj.Readymessage();
            Alert alert = obj.alert;
            assertEquals("Notification...", alert.getTitle());
            assertEquals(null, alert.getHeaderText());
            assertEquals("You will Receive A Message When It's Ready", alert.getContentText());

            //assertEquals("The Price: 65", alert.getContentText());
        });
    }

}
