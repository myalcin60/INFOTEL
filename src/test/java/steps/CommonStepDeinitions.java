package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Cookies;
import utilities.ConfigReader;
import utilities.Driver;

public class CommonStepDeinitions {


    @Given("Go to url")
    public void go_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));



    }

    @Then("Close browser")
    public void close_browser() {
        Driver.getDriver().close();
    }

}
