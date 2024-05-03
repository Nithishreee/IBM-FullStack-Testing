import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class selenium_Activity_20 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);
        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Awesome!!");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        alert.accept();
    }
}
