import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium_Activity_8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page:" + driver.getTitle());
        WebElement toggleCheckbox = driver.findElement(By.id("toggleCheckbox"));
        WebElement dynamicCheckbox= driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
//        WebElement dynamicCheckbox = driver.findElement(By.id("dynamicCheckbox"));

        toggleCheckbox.click();
        toggleCheckbox.click();
        dynamicCheckbox.click();
        System.out.println(toggleCheckbox.isDisplayed());

    }
}



