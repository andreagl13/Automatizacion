package seleniumgluecode;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class PingIdPageObject {
    public PingIdPageObject(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="username")
    private WebElement user;
    @FindBy(id = "my_password")
    private WebElement password;
    @FindBy(id = "my_sign_on_button")
    private WebElement submit;
}

