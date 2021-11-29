import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testGoogleSearch() {
        navigateToMainPage();
        typeQueryAndSubmit();
        int resultValue = getNumberOfrsults();
        Assert.assertTrue(resultValue > 1000);

        System.out.println(resultValue);

    }

    private int getNumberOfrsults() {
        WebElement resultSearch = driver.findElement(By.id("result-stats")); // we've found the element by id
        String textFromElement = resultSearch.getText().replace(" ", "");
        return CommonTools.findNumericalSequence(textFromElement);

    }


    private void navigateToMainPage() {
        driver.get("https://google.com/");
    }

    private void typeQueryAndSubmit() {
        String nameValue = "q";
        WebElement textInput = driver.findElement(By.name(nameValue));
        textInput.sendKeys("Researchgate");
        textInput.submit();
    }




}
