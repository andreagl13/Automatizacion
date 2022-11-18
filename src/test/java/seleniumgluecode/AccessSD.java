package seleniumgluecode;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.AssertionError;

public class AccessSD extends TestBase {

    @Given("^User is on the PingID access$")
    public void userIsOnThePingIDAccess()  {

    }

    @When("^Write User and password and push on the button connect$")
    public void writeUserAndPasswordAndPushOnTheButtonConnect() throws Throwable {
        PingServices pingIdPageObject = new PingServices(driver);
        pingIdPageObject.writeUser("30095945");
        pingIdPageObject.writePassword("ler123");
        pingIdPageObject.clickOnSubmit();
        WebDriverWait ewait = new WebDriverWait(driver, 10 );
        ewait.until(ExpectedConditions.titleContains("store-delivery-web"));
        Assert.assertEquals("store-delivery-web",driver.getTitle());
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/span"));
        menu.click();
        ewait.until(ExpectedConditions.titleContains("store-delivery-web"));
        WebElement CloseSD = driver.findElement(By.xpath("//*[@id=\"navMenu\"]/label[8]"));
        CloseSD.click();
        Thread.sleep(3000);

    }

    @Then("^Access to SD Web$")
    public void accessToSDWeb()  {

    }
}
