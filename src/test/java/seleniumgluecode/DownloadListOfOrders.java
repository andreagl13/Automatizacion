package seleniumgluecode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class DownloadListOfOrders extends TestBase {
    @Given("Access to SD Web on page list of orders")
    public void access_to_sd_web_on_page_list_of_orders() throws Exception {
    }
    @When("Choose the particular store, date and download")
    public void choose_the_particular_store_date_and_download() throws Exception {
        String[] store = {"002",
                "003",
                "004",
                "005",
                "006",
                "007",
                "008",
                "009",
                "010",
                "011",
                "012",
                "013",
                "014",
                "015",
                "016",
                "017",
                "018",
                "019",
                "020",
                "021",
                "022",
                "024",
                "025",
                "027",
                "029",
                "033",
                "034",
                "035",
                "036",
                "037",
                "038",
                "039",
                "040",
                "041",
                "042",
                "043",
                "044",
                "045",
                "046",
                "047",
                "048",
                "049",
                "050",
                "051",
                "052",
                "053",
                "054",
                "056",
                "057",
                "058",
                "059",
                "060",
                "061",
                "062",
                "063",
                "064",
                "067",
                "068",
                "069",
                "070",
                "071",
                "073",
                "074",
                "079",
                "081",
                "083",
                "085",
                "086",
                "089",
                "097",
                "101",
                "102",
                "105",
                "106",
                "107",
                "108",
                "109",
                "110",
                "111",
                "112",
                "113",
                "114",
                "115",
                "116",
                "257",
                "258",
                "259",
                "260",
                "261",
                "263",
                "265",
                "266",
                "268",
                "269",
                "271",
                "272",
                "275",
                "276",
                "277",
                "278",
                "279",
                "280",
                "282",
                "283",
                "284",
                "285",
                "286",
                "287",
                "288",
                "289",
                "290",
                "291",
                "292",
                "293",
                "294",
                "295",
                "296",
                "297",
                "298",
                "299",
                "301",
                "302",
                "304",
                "305",
                "308",
                "309",
                "311",
                "312",
                "313",
                "316",
                "318"
        };
        Thread.sleep(2000);

        for(int i = 0; i < store.length; i++) {
            try {
                pageObjectExcel pageObjectExcel = new pageObjectExcel(driver);
                pageObjectExcel.ClickSelectStore(store[i]);
                Thread.sleep(2000);
                pageObjectExcel.ClickSearchDate("2022-08-01 ~ 2022-08-15");
                Thread.sleep(2000);
                pageObjectExcel.ClickOk();
                Thread.sleep(3000);
                pageObjectExcel.ClickDownload();
            }catch (NoSuchElementException e){
                System.out.println("The store " + (store[i]) + " not exist");
            }
        }
    }

    @Then("The file is downloaded")
    public void every_file_is_downloaded() throws Exception {

    }
}
