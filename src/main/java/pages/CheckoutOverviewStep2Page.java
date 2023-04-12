package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewStep2Page {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutOverviewStep2Page(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.driver = driver;
    }
    private final By finishBtn = By.id("finish");

    public void finishCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishBtn));
        driver.findElement(finishBtn).click();
    }

}
