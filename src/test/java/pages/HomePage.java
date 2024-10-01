package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class  HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/a")
    public WebElement logo;

    @FindBy(id="filter_job_type")
    public WebElement contrat;
    @FindBy(id="filter_job_localisation")
    public WebElement localisation;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement rechercher;

    @FindBy(xpath = "//html/body/main/section[1]/div/h2")
    public WebElement textHomePage;

    @FindBy(xpath = "//*[@id=\"menu-item-2374\"]/a")
    public  WebElement nosOffres;
    @FindBy(xpath = "(//a[@title='Carrière'])[1]")
    public WebElement carriere;

}
