import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNG_Activity_7 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

   @DataProvider(name="Authentication")
   public  Object[][] credentials() {
       return new Object[][]{
               {"admin", "password"}
//               {"admin1", "password"}
       };
   }
   @Test(dataProvider = "Authentication")
   public void Testmethod(String sUsername, String sPassword)
   {
      WebElement name= driver.findElement(By.id("username"));
      name.sendKeys(sUsername);
      WebElement password=driver.findElement(By.id("password"));
      password.sendKeys(sPassword);

       WebElement elementByText = driver.findElement(By.xpath("//button[@type='submit']"));
       elementByText.click();
       name.clear();
       password.clear();
   }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

}