package Testing.example;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Main;
import org.example.Users;

public class LoginTest {
//    @BeforeAll
//    public static void Start(){
//    Main.main(new String[]{
//           "1 Zen 123"
//    });
//}

    Users obj = new Users();
    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

    }


    @When("I Choose the login button It should check if the credentials are valid")
    public void i_choose_the_login_button_it_should_check_if_the_credentials_are_valid() {
        //Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("if invalid I should see an error message")
    public void if_invalid_i_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
