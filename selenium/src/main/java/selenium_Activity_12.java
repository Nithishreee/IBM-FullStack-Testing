import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class selenium_Activity_12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/tables");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        WebElement rows_xpath = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]"));
        List<WebElement> x= rows_xpath.findElements(By.tagName("tr"));
        WebElement Column_xpath = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]"));
        List<WebElement> y= Column_xpath.findElements(By.tagName("td"));

        System.out.println("Number of rows: " + x.size());
        System.out.println("Number of columns: " +  y.size());

        //driver.quit();
    }

}

