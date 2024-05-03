import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class selenium_Activity_22 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println(driver.getTitle());
        WebElement elementWithTooltip = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        Actions actions = new Actions(driver);

        actions.moveToElement(elementWithTooltip).perform();
        String tooltipText = elementWithTooltip.getAttribute("data-tooltip");
        System.out.println(tooltipText);
        elementWithTooltip.click();
        WebElement name= driver.findElement(By.id("username"));
        name.sendKeys("admin");

        WebElement passwordfield= driver.findElement(By.id("password"));
        passwordfield.sendKeys("password");

        WebElement elementByText = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/button"));
        elementByText.click();

        WebElement message = driver.findElement(By.id("action-confirmation"));
        System.out.println((message.getText()));
    }

}
