import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_Activity_15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input"));
        name.sendKeys("admin");

        WebElement passwordfield = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input"));
        passwordfield.sendKeys("password");

        WebElement elementByText = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button"));
        elementByText.click();

        WebElement message = driver.findElement(By.id("action-confirmation"));
        System.out.println(message.getText());
        driver.quit();
    }
}