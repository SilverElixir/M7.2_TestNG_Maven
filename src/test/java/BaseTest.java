import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest(alwaysRun = true)
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void decodeValue(String valueToDecode, String expectedResult) {
        driver.get("https://www.base64decode.org/");
        // 1. Enter given value into Decode form
        driver.findElement(By.id("input")).sendKeys(valueToDecode);
        // 2. Click on "Decode" button
        driver.findElement(By.id("submit_text")).click();
        // 3. Get decoded result and compare it with expected value
        String actualResult = driver.findElement(By.id("output")).getText();
        Assert.assertEquals(actualResult, expectedResult,
                "OOPS! Looks like value differ: \n");
    }
}
