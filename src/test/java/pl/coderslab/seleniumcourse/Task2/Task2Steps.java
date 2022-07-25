package pl.coderslab.seleniumcourse.Task2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.PendingException;
import org.openqa.selenium.devtools.v85.input.Input;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Task2Steps {
    private WebDriver driver;

    @Given("^Open page at address (.*)$")
    public void OpenPage(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @When("Click SingIn")
    public void SingIn() {
        WebElement SingIn = driver.findElement(By.cssSelector("#_desktop_user_info"));
        SingIn.click();
    }

    @And("^Login email (.*) password (.*)$")
    public void LoginMailPassword(String email, String password) {
        WebElement inputemail = driver.findElement(By.cssSelector("#login-form > section > div:nth-child(2) > div.col-md-6 > input"));
        inputemail.sendKeys(email);
        WebElement inputpassword = driver.findElement(By.cssSelector("#login-form > section > div:nth-child(3) > div.col-md-6 > div > input"));
        inputpassword.sendKeys(password);
        WebElement SingInUse = driver.findElement(By.cssSelector("#submit-login"));
        SingInUse.click();
    }

    @And("Clicked CLOTHES")
    public void ClickedClothes() {
        WebElement ClothesButton = driver.findElement(By.id("category-3"));
        ClothesButton.click();
    }

    @And("Choose Hummingbird Printed Sweater")
    public void ChooseHummingbirdPrintedSweater() {
        WebElement ChooseHummingbirdPrintedSweater = driver.findElement(By.cssSelector("#js-product-list > div.products.row > article:nth-child(2)"));
        ChooseHummingbirdPrintedSweater.click();
    }

    @And("Choose size M")
    public void SizeM() {
        WebElement SizeM = driver.findElement(By.id("group_1"));
        SizeM.sendKeys("M");
    }

    @And("Choose 5 pieces")
    public void Pieces() {
        WebElement Pieces = driver.findElement(By.cssSelector("#quantity_wanted"));
        Pieces.clear();
        Pieces.sendKeys("5");
    }

    @And("Add to cart")
    public void AddToCart() {
        WebElement AddToCart = driver.findElement(By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add"));
        AddToCart.click();
    }

    @And("Click proceed to checkout")
    public void ProceedToCheckout() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        WebElement find = driver.findElement(By.id("footer"));
        WebElement ProceedToCheckout = driver.findElement(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"));
        ProceedToCheckout.click();
    }

    @And("Click proceed to checkout again")
    public void ProceedToCheckoutAgain() {
        WebElement section = driver.findElement(By.id("main"));
        WebElement ProceedToCheckout = driver.findElement(By.cssSelector("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.card-block > div > a"));
        ProceedToCheckout.click();
    }

    @And("^User (.*) in the search input box Address$")
    public void InputBoxAddress(String Address) {
        WebElement InputAddress = driver.findElement(By.cssSelector("#delivery-address > div > section > div:nth-child(9) > div.col-md-6 > input"));
        InputAddress.sendKeys(Address);
    }

    @And("^User (.*) in the search input box Zip Postal Code$")
    public void InputBoxZipPostalCode(String PostalCode) {
        WebElement InputZipPostalCode = driver.findElement(By.cssSelector("#delivery-address > div > section > div:nth-child(11) > div.col-md-6 > input"));
        InputZipPostalCode.sendKeys(PostalCode);
    }

    @And("^User (.*) in the search input box City$")
    public void InputCity(String city) {
        WebElement inputCity = driver.findElement(By.cssSelector("#delivery-address > div > section > div:nth-child(12) > div.col-md-6 > input"));
        inputCity.sendKeys(city);
    }

    @And("^User (.*) in the search input box Country$")
    public void InputCountry(String country) {
        WebElement inputCountry = driver.findElement(By.cssSelector("#delivery-address > div > section > div:nth-child(13) > div.col-md-6 > select"));
        inputCountry.sendKeys(country);
    }

    @And("^User (.*) in the search input box phone$")
    public void InputPhone(String phone) {
        WebElement inputPhone = driver.findElement(By.cssSelector("#checkout-addresses-step > div > div > form > section > div:nth-child(14) > div.col-md-6 > input"));
        inputPhone.sendKeys(phone);
    }

    @And("Clicked shopping method")
    public void ShoppingMethod() {
        WebElement ShoppingMethod = driver.findElement(By.name("confirm-addresses"));
        ShoppingMethod.click();
    }

    @And("Clicked Continue")
    public void Coutinue() {
        WebElement Coutinue = driver.findElement(By.name("confirmDeliveryOption"));
        Coutinue.click();
    }
    @And("Choose  Pay by Check")
    public void PayByCheck () {
        WebElement PayByCheck = driver.findElement(By.id("payment-option-1"));
        PayByCheck.click();
        }
    @And("Check the checkbox I agree to the terms of service and will adhere to them unconditionally")
    public void CheckTheCheckBox () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        WebElement CheckTheCheckBox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        CheckTheCheckBox.click();
        }
    @And("Clicked order with an obligation to pay")
    public void OrderWithAnObligationToPay() {
         WebElement OrderWithAnObligationToPay = driver.findElement(By.xpath("//button[contains(text(),'Order with an obligation to pay')]"));
         OrderWithAnObligationToPay.click();
        }
    @Then("Save screenshot")
        public void saveScreenshot() throws IOException {
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:/SeleniumCourseOnlTeaW21", "ddg-search-"+currentDateTime+".png"));
    }
}

