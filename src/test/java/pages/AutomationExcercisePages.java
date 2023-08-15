package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExcercisePages {

    public AutomationExcercisePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Ana sayfa ust menuler
    @FindBy(xpath = "//div[@class='shop-menu pull-right']")
    public WebElement ustMenu;

    //SignUp / Login butonu
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement SignupLoginButton;

    //New User Signup text
    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement NewUserSignupText;

    //New User Signup Name box
    @FindBy(xpath = "//input[@name='name']")
    public WebElement NewUserSignupNameBox;

    //New User Signup signup button
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement NewUserSignupButton;

    //Enter Account Information Text
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement EnterAccountInformationText;


    //Enter Account Information Title gender mr.
    @FindBy(xpath = "//label[@for='id_gender1']")
    public WebElement idGenderMR;

    //Enter Account Information Password
    @FindBy(id = "password")
    public WebElement EnterAccountInformationPasswordBox;


    //Enter Account Information Day DDM
    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement EnterAccountInformationDayDDM;

    //Enter Account Information Months DDM
    @FindBy(id = "months")
    public WebElement EnterAccountInformationMonthsDDM;

    //Enter Account Information Year DDM
    @FindBy(id = "years")
    public WebElement EnterAccountInformationYearDDM;

    //Newletter box
    @FindBy(id = "newsletter")
    public WebElement NewletterBox;

    //Receive special offers from our partners! box
    @FindBy(id = "optin")
    public WebElement ReceiveSpecialOffersFromOurPartnersBox;

    //Adress Information First Name
    @FindBy(id = "first_name")
    public WebElement AdressInformationFirstNameBox;

    //Adress Information Country
    @FindBy(id = "country")
    public WebElement AdressInformationCountryBox;

    //Adress Information Country
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement AdressInformationCreateButton;

    //Adress Information State
    @FindBy(id = "state")
    public WebElement AdressInformationStateBox;

    //Account Created! Text
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement AccountCreatedText;

    //AccountCreatedText Countinue button
    @FindBy(xpath = "//div[@class='pull-right']")
    public WebElement AccountCreatedCountinue;

    //Logged in as Text
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement LoggedInAsText;

    //DeleteACCOUNT
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    //AccountDeleteACCOUNT text
    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement AccountDeletedText;

    //Looged in as dan önce reklam close
    @FindBy()
    public WebElement LoggedInAsTextReklam;

}
