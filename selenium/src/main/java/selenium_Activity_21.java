import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public class selenium_Activity_21 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);
        System.out.println("current tab"+driver.getWindowHandle());
        WebElement window1 = driver.findElement(By.id("launcher"));
        window1.click();
         wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("currently open windows"+driver.getWindowHandle());
        for(String handle : driver.getWindowHandles())
        {
            driver.switchTo().window(handle);
        }
        //
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Current Tab"+driver.getWindowHandle());
        System.out.println("Title of the page 2:" + driver.getTitle());
        String pageHeading=driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading"+pageHeading);

        driver.findElement(By.id("actionButton"));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for(String handle : driver.getWindowHandles())
        {
            driver.switchTo().window(handle);
        }
        //
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Current Tab"+driver.getWindowHandle());
        System.out.println("Title of the page 2:" + driver.getTitle());
        String pageHeading2=driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading"+pageHeading2);
    }

}
