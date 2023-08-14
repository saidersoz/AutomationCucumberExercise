package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPages {

    public AmazonPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Search Box Locate
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    //Result Text Locate
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement resultText;


}
