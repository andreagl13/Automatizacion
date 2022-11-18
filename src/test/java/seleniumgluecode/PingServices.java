package seleniumgluecode;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PingServices {
    private ChromeDriver driver;
    private PingIdPageObject pingIdPageObject;
    public PingServices(ChromeDriver driver){
        this.driver = driver;
        pingIdPageObject = new PingIdPageObject(driver);
    }

    public void writeUser(String username){
        this.pingIdPageObject.getUser().sendKeys(username);
    }

    public void writePassword(String password){
        this.pingIdPageObject.getPassword().sendKeys(password);
    }

    public void clickOnSubmit(){
        this.pingIdPageObject.getSubmit().click();
    }
}
