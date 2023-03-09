package testing.example;

import com.example.demo1.Scene2Controller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.event.ActionEvent;

import java.io.IOException;

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
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.PickupBH(new ActionEvent());
    }

    @Then("i should receive a message when it's ready")
    public void i_should_receive_a_message_when_it_s_ready() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.Readymessage();
    }

}
