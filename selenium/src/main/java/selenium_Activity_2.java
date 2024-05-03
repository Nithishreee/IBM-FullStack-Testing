import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_Activity_2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        WebElement name= driver.findElement(By.id("username"));
        name.sendKeys("admin");

        WebElement passwordfield= driver.findElement(By.id("password"));
        passwordfield.sendKeys("password");

        WebElement elementByText = driver.findElement(By.xpath("//button[@type='submit']"));
        elementByText.click();
    }

}
