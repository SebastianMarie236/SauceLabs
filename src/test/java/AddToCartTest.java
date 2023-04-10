import org.junit.Assert;
import org.junit.Test;
import pages.InventoryItemPage;
import pages.InventoryPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {


    @Test
    public void AddToCartProduct() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.selectProduct("Sauce Labs Onesie");
        InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
        inventoryItemPage.addToCartProduct("Add to cart");
        inventoryItemPage.goToCart("Cart Button");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
    }
}
