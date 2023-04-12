package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewStep1Page {

    WebDriver driver;
    WebDriverWait wait;
    private CharSequence FirstName;
    private CharSequence LastName;
    private CharSequence PostalCode;

    public CheckoutOverviewStep1Page(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.driver = driver;
    }

    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By postalCodeInput = By.id("postal-code");
    private final By continueBtn = By.id("continue");

    public void fillInCheckoutForm(String FirstName,String LastName,String PostalCode) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
        driver.findElement(firstNameInput).sendKeys(FirstName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput));
        driver.findElement(lastNameInput).sendKeys(LastName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalCodeInput));
        driver.findElement(postalCodeInput).sendKeys(PostalCode);

    }
    public void clickContinue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn));
        driver.findElement(continueBtn).click();
    }


}
