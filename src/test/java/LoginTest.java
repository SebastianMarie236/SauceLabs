import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void TestLoginSuccess_StandardUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void TestLoginFailed_StandardUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "xyz");
        Assert.assertEquals(
                "Epic sadface: Username and password do not match any user in this service",
                loginPage.getErrorMessage());
    }

    @Test
    public void TestLogin_LockedOutUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce");
        Assert.assertEquals(
                "Epic sadface: Sorry, this user has been locked out.",
                loginPage.getError_message_testLogin_lockedOutUser());
    }

}
