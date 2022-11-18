package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.*;

public class Hooks {
    private static ChromeDriver driver;
    private static int numberOfCase = 0;
    @Before("@PingID")
    public void log(){
        numberOfCase ++;
        System.out.println("It's executing the stage Number: " + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().window().maximize();


    }

    @Before("@DownloadOneStore")
    public void stageDownload() throws Exception{
        numberOfCase ++;
        System.out.println("It's executing the stage Number: " + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().window().maximize();
        PingServices pingIdPageObject = new PingServices(driver);
        pingIdPageObject.writeUser("30095945");
        pingIdPageObject.writePassword("ler123");
        pingIdPageObject.clickOnSubmit();
    }

    @Before("@DownloadAllStore")
    public void stageAllDownload() throws Exception{
        numberOfCase ++;
        System.out.println("It's executing the stage Number: " + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.manage().window().maximize();
        PingServices pingIdPageObject = new PingServices(driver);
        pingIdPageObject.writeUser("30095945");
        pingIdPageObject.writePassword("ler123");
        pingIdPageObject.clickOnSubmit();
    }

    @After("@Stage")
    public void closeStage(){
        System.out.println("The stage number: " + numberOfCase + " was executing correctly.");
        driver.quit();
    }
    @After
    public void AllStages(){
        System.out.println("The stage number: " + numberOfCase + " was executing correctly.");
    }
    public static ChromeDriver getDriver(){
        return driver;
    }
}
