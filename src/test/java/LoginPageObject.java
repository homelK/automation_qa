import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends ObjectInitialisation {

    @FindBy(id="username")
    private WebElement username;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(className = "radius")
    private WebElement submitButton;

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public LoggedPage submit() {
        submitButton.click();
        return new LoggedPage(driver);
    }


}


