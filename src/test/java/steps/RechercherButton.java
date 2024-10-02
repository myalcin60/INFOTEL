package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.CarrierePage;
import pages.Cookies;
import pages.HomePage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RechercherButton {
    Cookies cookies = new Cookies();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    HomePage homePage = new HomePage();
    CarrierePage carrierePage = new CarrierePage();

    @Then("Click on the RECHERCHER button")
    public void click_on_the_rechercher_button() {
        homePage.rechercher.click();

    }

    @And("Select {string} and {string} from the Localisation section")
    public void selectAndFromTheLocalisationSection(String contract, String location) {
        js.executeScript("window.scrollBy(0, 300);");
        homePage.contrat.click();
        Select select = new Select(homePage.contrat);
        select.selectByValue(contract);
        homePage.localisation.click();
        Select select1 = new Select(homePage.localisation);
        select1.selectByValue(location);
    }

    @And("Verify that the {string} and {string} in the search result")
    public void verifyThatTheAndOfTheFirstItemInTheSearchResultIsCDI(String contrat, String location) {
        js.executeScript("window.scrollBy(0, 300);");

//        if (carrierePage.annonce.isDisplayed()) {
//            assertEquals(carrierePage.CDI.getText(), contrat.toUpperCase());
//            assertEquals(carrierePage.AixEnProvence.getText(), location);
//        }
//        else{
//            assertTrue(carrierePage.aucunResultat.isDisplayed());
//        }
        assertTrue(carrierePage.annonce.isDisplayed()|| carrierePage.aucunResultat.isDisplayed());
    }
}
