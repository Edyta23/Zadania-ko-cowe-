package pl.coderslab.seleniumcourse.Task1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class Task1Steps {
    private WebDriver driver;

    @Given("^Browser with open page at address (.*)$")
    public void BrowserNavigate(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @When("Clicked SingIn")
    public void SingIn() {
        WebElement SingIn = driver.findElement(By.cssSelector("#_desktop_user_info"));
        SingIn.click();
    }
    @And("^Entered email (.*) password (.*)$")
    public void InputBoxeMailPassword (String email, String password) {
        WebElement inputemail = driver.findElement(By.cssSelector("#login-form > section > div:nth-child(2) > div.col-md-6 > input"));
        inputemail.sendKeys(email);
        WebElement inputpassword = driver.findElement(By.cssSelector("#login-form > section > div:nth-child(3) > div.col-md-6 > div > input"));
        inputpassword.sendKeys(password);
        WebElement SingInUse = driver.findElement(By.cssSelector("#submit-login"));
        SingInUse.click();
        }

    @And("Clicked ADD FIRST ADDRESS")
    public void ClicedAddFirstAddress () {
        WebElement AddFirstAddress = driver.findElement(By.cssSelector("#address-link"));
        AddFirstAddress.click();
        }

   @And("^Entered (.*) in the search input box Alias$")
   public void InputBoxAlias (String alias) {
        WebElement inputalias = driver.findElement(By.cssSelector("#content > div > div > form > section > div:nth-child(5) > div.col-md-6 > input"));
        inputalias.sendKeys(alias);
        }

   @And("^Entered (.*) in the search input box Address$")
   public void InputBoxAddress (String address) {
       WebElement inputaddress = driver.findElement(By.cssSelector("#content > div > div > form > section > div:nth-child(10) > div.col-md-6 > input"));
       inputaddress.sendKeys(address);
        }
   @And("^Entered (.*) in the search input box City$")
   public void InputBoxCity (String city) {
      WebElement inputCity = driver.findElement(By.name("city"));
      inputCity.sendKeys(city);
        }
   @And("^Entered (.*)in the search input box Zip Postal Code$")
   public void InputBoxZipPostal (String ZipPostal) {
       WebElement inputZipPostal = driver.findElement(By.cssSelector("#content > div > div > form > section > div:nth-child(12) > div.col-md-6 > input"));
       inputZipPostal.sendKeys(ZipPostal);
        }
   @And("^Entered (.*) in the search input box Country$")
   public void InputBoxCountry (String country) {
       WebElement inputCountry = driver.findElement(By.cssSelector("#content > div > div > form > section > div:nth-child(14) > div.col-md-6 > select"));
       inputCountry.sendKeys(country);
        }
   @And("^Entered (.*) in the search input box phone$")
   public void InputBoxPhone(String phone) {
        WebElement inputPhone = driver.findElement(By.cssSelector("#content > div > div > form > section > div:nth-child(15) > div.col-md-6 > input"));
        inputPhone.sendKeys(phone);
        }
   @And("Clicked Save")
   public void ClickedSave() {
        WebElement ClickedSave = driver.findElement(By.cssSelector("#content > div > div > form > footer > button"));
        ClickedSave.click();
        }
    @And("Check in the date address")
    public void CheckDateAddress() {
    WebElement checkAddress = driver.findElement(By.cssSelector("#notifications > div > article.alert-success"));

    }
    @Then ("Delete address")
    public void DeleteAddressUse(){
        WebElement deleteAddress = driver.findElement(By.cssSelector("article.address > div.address-footer > a:nth-child(2)"));//artic.findElement(By.cssSelector("div.address-footer > a:nth-child(2)"));
        deleteAddress.click();


   }}

