package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/firstTest.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class Run  extends AbstractTestNGCucumberTests {
}
