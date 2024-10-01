package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.CarrierePage;
import pages.HomePage;
import utilities.Driver;

import javax.swing.*;

import static org.junit.Assert.assertTrue;


public class Logo {
    HomePage homePage = new HomePage();
    Actions action = new Actions(Driver.getDriver());
    CarrierePage carrierePage = new CarrierePage();
    @Then("Hover your mouse over CARRIRE and click on nos offres in the drop-down menu")
    public void hover_your_mouse_over_carrire_and_click_on_os_offres_in_the_drop_down_menu() {
        action.moveToElement(homePage.carriere).perform();

        action.moveToElement(homePage.nosOffres).click().perform();

    }
    @Then("On the page that opens, click on the site Logo")
    public void on_the_page_that_opens_click_on_the_site_logo() {
    assertTrue(carrierePage.textCarrierePage.isDisplayed());
    homePage.logo.click();
    }
    @Then("Verify that you are back on the home page")
    public void verify_that_you_are_back_on_the_home_page() {
    assertTrue(homePage.textHomePage.isDisplayed());
    }

}
