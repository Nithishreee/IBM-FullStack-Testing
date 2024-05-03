import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNG_Activity_9 {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }

    @Test
    public void simpleAlertTestCase() {
        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void confirmAlertTestCase() {
        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void promptAlertTestCase() {
        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Awesome!!");
        Reporter.log("Awesome");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        alert.accept();
    }

    @AfterClass
    public void afterMethod() {
        driver.quit();
    }
}


