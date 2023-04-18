package testing.example;

import com.example.demo1.Main;
import com.example.demo1.Scene1Controller;
import com.example.demo1.Scene4Controller;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static com.example.demo1.Main.scene4;
import static org.junit.jupiter.api.Assertions.*;

public class NewCustomerTest {
    private String username;
    private String password;
    public  String expectedData;
    public  String actualData;
    private Scene1Controller scene1Controller;

    public NewCustomerTest(Scene1Controller scene1Controller) {
        this.scene1Controller = scene1Controller;
    }

    @When("the user clicks on the New Customer button")
    public void the_user_clicks_on_the_new_customer_button() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        scene1Controller.switchScene4(new ActionEvent());
    }

    @Then("the user should see the New Customer page")
    public void the_user_should_see_the_new_customer_page() {
        // Write code here that turns the phrase above into concrete actions
       //throw new io.cucumber.java.PendingException();
        Main main = new Main();
        assertEquals(true, Scene1Controller.Scene4IsOpen);
    }

//    @Ignore("the user is on the New Customer page")
//    public void the_user_is_on_the_new_customer_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @When("the user enters valid data")
    public void the_user_enters_valid_data() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Platform.runLater(() -> {
            Scene4Controller scene4Controller = new Scene4Controller();
            try {
                username = scene4Controller.getUsername();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            password = scene4Controller.getPassword();
            String email = scene4Controller.getEmail();
            String number = scene4Controller.getPhone();
            expectedData = username + "," + password + "," + email + "," + number;

            List<String> lines = null;
            try {
                lines = Files.readAllLines(Paths.get("Customers.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            actualData = String.join(",", lines);
        });
        assertTrue(Scene4Controller.validInputUser);
    }

    @When("the user clicks on the Sign up button")
    public void the_user_clicks_on_the_sign_up_button() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("the user data should be saved in the database")
    public void the_user_data_should_be_saved_in_the_database() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
            assertEquals(expectedData, actualData);
    }

    @When("the user enters invalid data")
    public void the_user_enters_invalid_data() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Platform.runLater(() -> {
            Scene4Controller scene4Controller = new Scene4Controller();
            try {
                username = scene4Controller.getUsername();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            password = scene4Controller.getPassword();
            String email = scene4Controller.getEmail();
            String number = scene4Controller.getPhone();
            expectedData = username + "," + password + "," + email + "," + number;

            List<String> lines = null;
            try {
                lines = Files.readAllLines(Paths.get("Customers.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            actualData = String.join(",", lines);
        });
        assertEquals(actualData,expectedData);
    }

    @Then("the user should see a warning message")
    public void the_user_should_see_a_warning_message() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertEquals(true,Scene4Controller.validInputUser);
}
    }
