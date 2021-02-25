package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = ".//Features/Login.features",
                glue = "stepDefinitions",
                dryRun = true,
                monochrome=true,
                plugin = {"pretty","html:test-output"}
)


public class TestRun {


}
