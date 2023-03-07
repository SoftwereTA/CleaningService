package testing.example;

import com.example.demo1.Scene1Controller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class ExitTest {

    Scene1Controller scene1Controller = new Scene1Controller();
    @When("I click the exit option")
    public void i_click_the_exit_option() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        scene1Controller.exit(new ActionEvent());
    }

    @Then("the application should exit")
    public void the_application_should_exit() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("I press ALT+F4 or X")
    public void i_press_alt_f4_or_x() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        scene1Controller.confirmExit(new Stage());
    }


}
