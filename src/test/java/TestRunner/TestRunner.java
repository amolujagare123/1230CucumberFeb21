package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
        glue="Stepdefinition",
        tags = "@realScenario",
        plugin={ "pretty","html:target/cucumber.html"}

)

public class TestRunner {
}
