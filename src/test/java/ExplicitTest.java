import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class ExplicitTest extends TestBase {

    @Test
    public void waitTestCommands() {
        navigateToMainPage();
        findlEmenetSubmit();
        waitFluentSet();
        String resultText = findResultElement();
        Assert.assertEquals(resultText, "Hello World!");

    }

    private void navigateToMainPage() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    private void findlEmenetSubmit() {
        WebElement link = driver.findElement(By.xpath("//a[@href='/dynamic_loading']"));
        link.click();
        WebElement exampleFirstLink = driver.findElement(By.xpath("//*[text()='Example 1: Element on page that is hidden']"));
        exampleFirstLink.click();
        driver.findElement(By.tagName("button")).click();
    }

    private void waitFluentSet() {
        FluentWait wait = new FluentWait(driver);;
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
    }

    private String findResultElement() {
        WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
        return result.getText();
    }


}

