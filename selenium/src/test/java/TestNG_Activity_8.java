import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import suiteExample.TestNG_Activity_8_sub;
public class TestNG_Activity_8 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");

    }

    @Test(dataProviderClass = TestNG_Activity_8_sub.class, dataProvider = "SimpleForm")
    public void Testmethod(String sFirstname, String sLastname, String sEmail,String iNumber,String sMessage)
    {
        WebElement firstName= driver.findElement(By.id("firstName"));
        firstName.sendKeys(sFirstname);
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys(sLastname);
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys(sEmail);
        WebElement number=driver.findElement(By.id("number"));
        number.sendKeys(iNumber);
        WebElement textarea=driver.findElement(By.tagName("textarea"));
        textarea.sendKeys(sMessage);


        WebElement submit = driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input"));
        submit.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement clear = driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[2]/input"));
        clear.click();
    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

}