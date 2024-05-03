import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium_Activity_9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println("Title of the page:" + driver.getTitle());
        WebElement violetButton = driver.findElement(By.cssSelector("button[class*='ui violet button']"));
        violetButton.click();
        WebElement content = driver.findElement(By.id("ajax-content"));

        waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("ajax-content")));

//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        wait.until(d -> content.isDisplayed());
//        content.getText();

    }
}