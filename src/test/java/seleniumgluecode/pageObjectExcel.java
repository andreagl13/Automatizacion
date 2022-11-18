package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pageObjectExcel {
    private ChromeDriver driver;

    public pageObjectExcel(ChromeDriver driver){
        this.driver = driver;
    }

    private By selecStore = By.cssSelector(".select");


    private By searchDate = By.name("date");

    private By buttonOk = By.xpath("//*[@id=\"app\"]/div/div[2]/div/section/fieldset/div[1]/div/div[2]/div[3]/button");

    private By buttonDownload = By.cssSelector(".button");

    public void ClickSelectStore(String shop){
        new Select(this.driver.findElement(this.selecStore)).selectByValue(shop);
    }
    public void ClickSearchDate(String date){
        this.driver.findElement(this.searchDate).sendKeys(Keys.chord(Keys.CONTROL, "a"),date);
    }
    public void ClickOk(){
        this.driver.findElement(buttonOk).click();
    }
    public void ClickDownload() {

        this.driver.findElement(this.buttonDownload).click();
    }
}
