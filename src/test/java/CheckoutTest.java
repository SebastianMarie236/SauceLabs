import org.junit.Assert;
import org.junit.Test;
import pages.*;

public class CheckoutTest extends BaseTest {
    @Test
    public void CompleteCheckout() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addToCartProduct("Add to cart");
        inventoryPage.goToCart("Cart Button");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.goToCheckout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        CheckoutOverviewStep1Page checkoutOverviewStep1Page = new CheckoutOverviewStep1Page(driver);
        checkoutOverviewStep1Page.fillInCheckoutForm("Sebastian","Marie","40451");
        checkoutOverviewStep1Page.clickContinue();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
        CheckoutOverviewStep2Page checkoutOverviewStep2Page = new CheckoutOverviewStep2Page(driver);
        checkoutOverviewStep2Page.finishCheckout();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
        CheckoutCompletePage checkoutCompletePage =new CheckoutCompletePage(driver);
        checkoutCompletePage.goBackToProducts();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }
}
