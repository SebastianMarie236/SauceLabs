package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.driver = driver;
    }

    private final By checkoutBtn = By.id("checkout");

    public void goToCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutBtn));
        driver.findElement(checkoutBtn).click();
    }

}
