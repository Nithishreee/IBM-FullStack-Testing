import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium_Activity_5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        WebElement elementByText = driver.findElement(By.xpath("/html/body/div[2]"));
        new Actions(driver)
                .click(elementByText)
                .perform();
        WebElement desired = elementByText.findElement(By.className("active"));
        System.out.println(desired.getText());
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]")));


        new Actions(driver)
                .contextClick(elementByText)
                .perform();
        WebElement desired1 = elementByText.findElement(By.className("active"));
        System.out.println(desired1.getText());
//        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
//        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]")));


        new Actions(driver)
                .doubleClick(elementByText)
                .perform();
        WebElement desired2 = elementByText.findElement(By.className("active"));
        System.out.println(desired2.getText());
    }
}
