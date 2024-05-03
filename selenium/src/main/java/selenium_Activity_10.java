import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_Activity_10 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page:" + driver.getTitle());
        WebElement Button = driver.findElement(By.id("toggleCheckbox"));
        WebElement dynamicCheckbox= driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));

        Button.click();
        System.out.println(dynamicCheckbox.isDisplayed());
        Button.click();
        System.out.println(dynamicCheckbox.isDisplayed());
        dynamicCheckbox.click();

        if (dynamicCheckbox.isDisplayed()) {
            System.out.println("Element is visible.");
        } else {
            System.out.println("Element is not visible.");
        }

    }
}