
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstExampleTest {

   @Test
   public void testRR() {
       System.setProperty("webdriver.gecko.driver","C:\\opt\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
//
//       System.setProperty("webdriver.chrome.driver","C:\\opt\\chromedriver.exe");
//       WebDriver driver = new ChromeDriver();

       driver.get("http://demo.guru99.com/test/newtours/");

       String actualTitle = driver.getTitle();

       assertEquals(5, 5);
       assertEquals(actualTitle, "Welcome: Mercury Tours");

       driver.close();
   }




}






