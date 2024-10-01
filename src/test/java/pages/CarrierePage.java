package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CarrierePage {
    public CarrierePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"contentload\"]/div[1]/div[1]/div/ul/li[1]/span")
    public WebElement CDI;
    @FindBy(xpath = "//*[@id=\"contentload\"]/div[1]/div[1]/div/ul/li[2]/span")
    public WebElement AixEnProvence;
    @FindBy(xpath = "/html/body/main/section[2]/div/h1")
    public WebElement textCarrierePage;
    @FindBy(id = "total_found")
    public WebElement annonce;
    @FindBy(id = "contentload")
    public WebElement aucunResultat;
}
