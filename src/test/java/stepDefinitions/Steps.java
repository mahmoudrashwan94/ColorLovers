package stepDefinitions;

import Helpers.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import org.json.JSONException;
import org.testng.Assert;


import static io.restassured.RestAssured.given;
import static io.restassured.path.xml.XmlPath.CompatibilityMode.HTML;

public class Steps {

    private String URL;
    private XmlPath path;

    @Given("Color Patterns Endpoint")
    public void readTestData() {
        PropertiesReader.readProperties(Constants.testDataPath + "testData.properties");
        URL = PropertiesReader.getPropertyValue("Url");
    }

    @When("Calling the Endpoint")
    public void doAGetRequest() throws JSONException {
        Response response = given().header("User-Agent", "PostmanRuntime/PostmanRuntime/7.26.8")
                .when().get(URL)
                .then()
                .extract().response();
        path = new XmlPath(HTML, response.asString());
    }


    @Then("Check that number of views is greater than {int}")
    public void checkThatNumberOfViewsIsGreaterThanNumViews(int numViews) {
        for (int i = 0; i < path.getList("patterns.pattern").size(); i++) {
            Assert.assertTrue(ApiHelper.compareTwoIntegers(path.getInt("patterns.pattern[" + i + "].numViews"), numViews), path.getInt("patterns.pattern[" + i + "].numViews") + " is less than " + numViews);
            System.out.println("Element "+i + " is  " + path.getInt("patterns.pattern[" + i + "].numViews"));
        }
    }
}
