import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;


public class LogInTestWithPOP extends TestBase{

    @DataProvider (name="testdataset")
       public Object[][] getData() {
        // Create object with two paraments
        // first parameter is row and second one is column

        String[][] data = new String[2][2];
        data[0][0] = "tomsmith";
        data[0][1] = "SuperSecretPassword!";
        data[1][0] = "tomsmith";
        data[1][1] = "SuperSecretPassword!";

        return data;
    }

    @Test(dataProvider="testdataset")
    public void logIn(String name, String password) {

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPageObject loginPage = new LoginPageObject(driver);

        loginPage.setUserName(name);
        loginPage.setPassword(password);

        LoggedPage loggedPage = loginPage.submit();

        Assert.assertEquals("Secure Area", loggedPage.getTitle());


    }

}
