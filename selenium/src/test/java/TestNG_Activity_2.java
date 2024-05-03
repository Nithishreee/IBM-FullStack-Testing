import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG_Activity_2 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void exampleTestCase1() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
    }
    @Test
    public void exampleTestCase2() {
        //Find the clickable link on the page and click it
        WebElement black = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]"));

        Assert.assertEquals("green", black.getText());
    }
    @Test(priority = 0,enabled = false)
    public void exampleTestCase3() {

    }

    @Test
    public void aSkipTest() throws SkipException{
        String condition="Skip Test";
        if(condition.equals("Skip Test"))
        {
            throw new SkipException("Skipping - This is not ready for testing");
        }
        }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}