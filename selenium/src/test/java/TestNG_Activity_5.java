import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG_Activity_5 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"group1"})
    public void header() {
        WebElement header = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(header.getText(), "Third header");
    }
    @Test(groups = {"group1"})
    public void header1() {
        WebElement color = driver.findElement(By.tagName("h5"));
        Assert.assertEquals(color.getCssValue("color"), "rgb(33, 186, 69)");

    }
    @Test(groups = {"group2"})
        public void Button() {

            WebElement olive = driver.findElement(By.cssSelector("button.olive"));
            Assert.assertEquals(olive.getText(), "Olive");
        }


        @AfterClass
        public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}