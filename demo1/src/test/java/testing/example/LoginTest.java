package testing.example;

import com.example.demo1.Main;
import com.example.demo1.Scene2Controller;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.testfx.api.FxRobot;
import org.testfx.util.WaitForAsyncUtils;

import java.io.IOException;

public class LoginTest extends FxRobot {

    Scene2Controller scene2Controller = new Scene2Controller();
  @BeforeAll
        public static void before_all() {
            Application.launch(Main.class);
        }

    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //Try achieving this with JavaFX
        clickOn("#fieldUser");
        write("admin");
        clickOn("#fieldPass");
        write("123");
    }

    @When("I Choose the login button It should check if the credentials are valid")
    public void i_choose_the_login_button_it_should_check_if_the_credentials_are_valid() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        clickOn("#loginButton");
        scene2Controller.CheckCredentials();

    }

    @Then("if invalid I should see an error message")
    public void if_invalid_i_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("The username and the password fields are blank when I choose the login button")
    public void the_username_and_the_password_fields_are_blank_when_i_choose_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should not be logged in to the application, I should see an error message")
    public void i_should_not_be_logged_in_to_the_application_i_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
