import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedPage extends ObjectInitialisation {

     @FindBy(tagName = "h2")
     private WebElement title;

     public LoggedPage(WebDriver driver) {
         super(driver);
     }

     public String getTitle() {
         return title.getText();
     }

}
