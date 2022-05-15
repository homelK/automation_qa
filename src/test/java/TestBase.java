import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.time.Duration;


public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeClass
    public void suiteSetup (@Optional("FireFox") String browser){

        /* String os = System.getProperty("os.name");

        if(os.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }

        if(os.contains("Mac")) {
            System.out.println("You are lucky");
        } */


        if(browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        if(browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    @AfterSuite
    public void afterSuitBrowserQuit() {
        // driver.quit();
    }
}
