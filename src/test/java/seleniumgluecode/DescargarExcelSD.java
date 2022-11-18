package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DescargarExcelSD extends TestBase {



    @Given("The user access the page SD Web")
    public void the_user_access_the_page_sd_web()  throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("Choose the store, with particular date and download")
    public void choose_the_store_with_particular_date_and_download() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        pageObjectExcel pageObjectExcel = new pageObjectExcel(driver);
        pageObjectExcel.ClickSelectStore("020");

        Thread.sleep(2000);
        pageObjectExcel.ClickSearchDate("2022-08-01 ~ 2022-08-15");

        Thread.sleep(2000);
        pageObjectExcel.ClickOk();

    }
    @Then("Every file is downloaded")
    public void the_file_is_downloaded() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(4000);
        pageObjectExcel pageObjectExcel = new pageObjectExcel(driver);
        pageObjectExcel.ClickDownload();


    }
}
