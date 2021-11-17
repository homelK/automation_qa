import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void testSearchChrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");


        String nameValue = "q";
        WebElement textInput = driver.findElement(By.name(nameValue));
        textInput.sendKeys("Researchgate");
        textInput.submit();

        WebElement resultSearch = driver.findElement(By.id("result-stats")); // we've found the element by id

        String textFromElement = resultSearch.getText().replace(" ", ""); // text  is "При"
        int resultValue = findNumericalSequence(textFromElement);
        System.out.println(resultValue);

    }

    public int findNumericalSequence(String text) {

        StringBuilder sb = new StringBuilder();
        char[] arr = text.toCharArray();
        int length = text.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(arr[i])) {
                sb.append(String.valueOf(arr[i]));
                continue;
            }

            if (sb.toString() != "") {
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }


}
