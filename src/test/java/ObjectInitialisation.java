import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ObjectInitialisation {
    protected WebDriver driver;

    public ObjectInitialisation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
