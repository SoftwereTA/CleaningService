package testing.example;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.testfx.api.FxRobot;
import org.testfx.util.WaitForAsyncUtils;

import java.io.IOException;

public class LoginTest extends FxRobot {

    String username;
    PasswordField password;
    String filePath;
    Scene1Controller scene1Controller = new Scene1Controller();
  @BeforeAll
        public static void before_all() {
            Application.launch(Main.class);
        }

    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //Try achieving this with JavaFX
        username="Admin";
        password=;
        filePath="Untitled.txt";
        scene1Controller.setFieldPass(password);
        scene1Controller.getFieldPass();
        scene1Controller.setFieldUser(new TextField());



    }

    @When("I Choose the login button It should check if the credentials are valid")
    public void i_choose_the_login_button_it_should_check_if_the_credentials_are_valid() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        scene1Controller.handleLoginButton(new ActionEvent());
        scene1Controller.CheckCredentials(username, password, filePath);


    }

    @Then("if invalid I should see an error message")
    public void if_invalid_i_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        scene1Controller.ShowErrorMessage();
    }

    @When("The username and the password fields are blank when I choose the login button")
    public void the_username_and_the_password_fields_are_blank_when_i_choose_the_login_button() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        scene1Controller.CheckCredentials(username, password, filePath);
    }

    @Then("I should not be logged in to the application, I should see an error message")
    public void i_should_not_be_logged_in_to_the_application_i_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        scene1Controller.ShowErrorMessage();
    }
}
