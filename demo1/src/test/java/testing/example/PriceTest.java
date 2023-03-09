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

public class PriceTest {

    Scene2Controller obj = new Scene2Controller();

    @When("i choose 200x100 size")
    public void i_choose_200x100_size() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SizeHandle1(new ActionEvent());


    }

    @When("i choose speed cleaning")
    public void i_choose_speed_cleaning() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SpeedBH(new ActionEvent());
    }

    @Then("the price will be {int}")
    public void the_price_will_be(Integer int1) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.getprice();

    }

    @When("i choose 200x200 size")
    public void i_choose_200x200_size() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SizeHandle2(new ActionEvent());
    }

    @When("i choose deep cleaning")
    public void i_choose_deep_cleaning() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.DeepBH(new ActionEvent());
    }

    @When("i choose 300x200 size")
    public void i_choose_300x200_size() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.SizeHandle3(new ActionEvent());
    }

    @When("i choose dry cleaning")
    public void i_choose_dry_cleaning() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        obj.DryBH(new ActionEvent());

    }
}
