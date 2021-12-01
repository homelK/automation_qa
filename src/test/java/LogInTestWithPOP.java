import org.testng.Assert;
import org.testng.annotations.Test;


public class LogInTestWithPOP extends TestBase{

    @Test
    public void logIn() {
        driver.get("https://the-internet.herokuapp.com/login");

        LoginPageObject loginPage = new LoginPageObject(driver);
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");

        LoggedPage loggedPage = loginPage.submit();

        Assert.assertEquals("Secure Area", loggedPage.getTitle());


    }
}
