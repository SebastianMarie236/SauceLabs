package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    WebDriver driver;
    WebDriverWait wait;

    public InventoryPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.driver = driver;
    }

    private final By productName = By.id("item_4_title_link");

    private final By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");

    private final By cartBtn = By.className("shopping_cart_badge");


    public void selectProduct(String productname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        driver.findElement(productName).click();
    }

    public void addToCartProduct(String addtocartbtn) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartBtn));
        driver.findElement(addToCartBtn).click();
    }

    public void goToCart(String cartbtn) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartBtn));
        driver.findElement(cartBtn).click();
    }

}
