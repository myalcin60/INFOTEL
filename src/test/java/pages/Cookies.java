package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Cookies {
    public Cookies() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="axeptio_btn_dismiss")
    public WebElement cookieFerme;
    @FindBy(id = "axeptio_btn_acceptAll")
    public WebElement cookieAccept;
    @FindBy(xpath = "//*[@id=\"axeptio_main_button\"]/span/span/span")
    public  WebElement iconFerme;
}
