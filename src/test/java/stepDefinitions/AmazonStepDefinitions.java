package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPages amazonPages = new AmazonPages();

    @Given("Kullanici Amazon sayfasinda")
    public void kullanici_amazon_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
    }

    @When("Kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @When("Sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        Assert.assertTrue(amazonPages.resultText.getText().contains("Nutella"));
    }

    @When("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("Kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @When("Sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPages.resultText.getText().contains("Java"));
    }


}
