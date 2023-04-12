import org.junit.Assert;
import org.junit.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void AddToCartProduct() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addToCartProduct("Add to cart");
        inventoryPage.goToCart();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");

    }
}

