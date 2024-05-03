import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class selenium_Activity_19 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        confirm.click();
        Alert alert2=driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
        //driver.quit();
    }
}
