import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlers extends TestBase {

    @Test
    public void windowsManager() {

        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement newWindowLink = driver.findElement(By.xpath("//a[@href = '/windows/new']"));

        newWindowLink.click();

        Set<String> windowHandles = driver.getWindowHandles();

        String[] arrayOfWindowsHanles = windowHandles.toArray(new String[0]);
        // данная функция конвертирует набор (Set) идентификаров окон (LinkedHashSet)
        // в упорядоченный массив в виде строк - в результате к ним проще обращаться по индексу

        String windowOne = arrayOfWindowsHanles[0];
        String windowTwo = arrayOfWindowsHanles[1];





    }

}
