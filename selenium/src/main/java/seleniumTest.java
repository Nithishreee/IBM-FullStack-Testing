import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


    public class seleniumTest {
        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();

            WebDriver driver = new FirefoxDriver();

            // Open the browser
            driver.get("https://v1.training-support.net");
            String title = driver.getTitle();
            System.out.println("Title of the page:" + title);
            WebElement elementById= driver.findElement(By.id("about-link"));
            elementById.click();
            String aboutpage=driver.getTitle();
            System.out.println("Title of the about page:" + aboutpage);
            //driver.quit();
        }
    }

