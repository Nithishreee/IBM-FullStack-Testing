import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG_Activity_3 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void exampleTestCase() {
        WebElement name= driver.findElement(By.id("username"));
        name.sendKeys("admin");

        WebElement passwordfield= driver.findElement(By.id("password"));
        passwordfield.sendKeys("password");

        WebElement elementByText = driver.findElement(By.xpath("//button[@type='submit']"));
        elementByText.click();
        WebElement confirm = driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals(confirm.getText(), "Welcome Back, admin");
    }



    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}