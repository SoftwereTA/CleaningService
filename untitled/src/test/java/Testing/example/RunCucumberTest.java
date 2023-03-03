package Testing.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue = "Testing.example",
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/cucumber/wikipedia.html"})

public class RunCucumberTest {

}