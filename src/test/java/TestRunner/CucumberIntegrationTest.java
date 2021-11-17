package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/PatternsReport.html"}, //Path of the report
        monochrome = true
)
public class CucumberIntegrationTest extends AbstractTestNGCucumberTests {

}