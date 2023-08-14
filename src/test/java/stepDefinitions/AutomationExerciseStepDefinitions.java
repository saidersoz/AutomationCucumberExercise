package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AutomationExcercisePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExerciseStepDefinitions {

    AutomationExcercisePages automationExcercise = new AutomationExcercisePages();
    Faker faker = new Faker();

    @Given("Kullanici {string} sayfasinda")
    public void kullanici_sayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanci Anasayfanin basariyla goruntulendigini test eder")
    public void kullanci_anasayfanin_basariyla_goruntulendigini_test_eder() {
        automationExcercise.ustMenu.isDisplayed();
    }

    @When("Kullanici Signup \\/ Login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() throws InterruptedException {
        automationExcercise.SignupLoginButton.click();
        ReusableMethods.bekle(1);
    }

    @When("Kullanici New User Signup yazisinin goruntulendigini test eder")
    public void kullanici_new_user_signup_yazisinin_goruntulendigini_test_eder() {
        Assert.assertTrue(automationExcercise.NewUserSignupText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @When("Kullanici name ve email address girer")
    public void kullanici_name_ve_email_address_girer() {
        automationExcercise.NewUserSignupNameBox.sendKeys(faker.name().firstName() +
                Keys.TAB + faker.name().firstName() + "123@gmail.com");
        ReusableMethods.bekle(1);
    }

    @When("Kullanici Signup butonuna tiklar")
    public void kullanici_signup_butonuna_tiklar() {
        automationExcercise.NewUserSignupButton.click();
        ReusableMethods.bekle(1);
    }

    @When("kullanici ENTER ACCOUNT INFORMATION yazisinin goruntulendigini test eder")
    public void kullanici_enter_account_ınformatıon_yazisinin_goruntulendigini_test_eder() {
        Assert.assertTrue(automationExcercise.EnterAccountInformationText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @When("kullanici Title, Name, Email, Password, Date of birth alanlarini doldurur")
    public void kullanici_title_name_email_password_date_of_birth_alanlarini_doldurur() {
        automationExcercise.idGenderMR.click();
        automationExcercise.EnterAccountInformationPasswordBox.sendKeys("farukicardi123");
        ReusableMethods.ddmValue(automationExcercise.EnterAccountInformationDayDDM, "31");
        ReusableMethods.ddmValue(automationExcercise.EnterAccountInformationMonthsDDM, "5");
        ReusableMethods.ddmValue(automationExcercise.EnterAccountInformationYearDDM, "2000");
        ReusableMethods.bekle(2);
    }

    @When("Kullanici Sign up for our newsletter! butonuna tiklar")
    public void kullanici_sign_up_for_our_newsletter_butonuna_tiklar() {
        automationExcercise.NewletterBox.click();
    }

    @When("Kullanici Receive special offers from our partners! butonuna tiklar")
    public void kullanici_receive_special_offers_from_our_partners_butonuna_tiklar() {
        automationExcercise.ReceiveSpecialOffersFromOurPartnersBox.click();
        ReusableMethods.bekle(1);
    }

    @When("Kullanici First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number alanlarini doldurur")
    public void kullanici_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number_alanlarini_doldurur() {
        automationExcercise.AdressInformationFirstNameBox.sendKeys(faker.name().firstName() +
                Keys.TAB + faker.name().lastName() + Keys.TAB + faker.company().name() + Keys.TAB +
                faker.address().firstName() + Keys.TAB + faker.address().streetAddress());
        ReusableMethods.bekle(1);
        ReusableMethods.ddmValue(automationExcercise.AdressInformationCountryBox, "United States" + Keys.TAB +
                faker.address().cityName() + Keys.TAB + faker.address().city() + Keys.TAB +
                faker.address().zipCode() + Keys.TAB + faker.number().randomNumber());
        ReusableMethods.bekle(2);
    }

    @When("Kullanici Create Account button butonuna tiklar")
    public void kullanici_create_account_button_butonuna_tiklar() {
        automationExcercise.AdressInformationCreateButton.click();
        ReusableMethods.bekle(1);
    }

    @When("Kullanici ACCOUNT CREATED! yazisinin goruntulendigini test eder")
    public void kullanici_account_created_yazisinin_goruntulendigini_test_eder() {
        Assert.assertTrue(automationExcercise.AccountCreatedText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @When("Kullanici Continue butonuna tiklar")
    public void kullanici_continue_butonuna_tiklar() {
        automationExcercise.AccountCreatedCountinue.click();
        ReusableMethods.bekle(1);
    }

    @When("Kullanici Logged in as username yazisinin goruntulendigini test eder")
    public void kullanici_logged_in_as_username_yazisinin_goruntulendigini_test_eder() {
        Assert.assertTrue(automationExcercise.LoggedInAsText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @When("Kullanici Delete Account butonuna tiklar")
    public void kullanici_delete_account_butonuna_tiklar() {
        automationExcercise.deleteAccount.click();
        ReusableMethods.bekle(1);
    }

    @When("Kullanici ACCOUNT DELETED! yazisinin goruntulendigini test eder")
    public void kullanici_account_deleted_yazisinin_goruntulendigini_test_eder() {
        Assert.assertTrue(automationExcercise.AccountDeletedText.isDisplayed());
        ReusableMethods.bekle(1);
    }

}
