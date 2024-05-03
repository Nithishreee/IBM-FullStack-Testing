import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cucumber_Activity_1 {
        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.google.com/search?q=Cheese&rlz=1C1OPNX_en-GBIN1101IN1101&oq=Cheese&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIQCAEQLhjHARixAxjRAxiABDIKCAIQLhixAxiABDIKCAMQABixAxiABDIKCAQQABixAxiABDIKCAUQABixAxiABDINCAYQABixAxiABBiKBTIHCAcQABiABDIKCAgQABixAxiABDIHCAkQABiPAtIBCTYwODNqMGoxNagCCLACAQ&sourceid=chrome&ie=UTF-8");

            WebElement stats = driver.findElement(By.id("result-stats"));
            System.out.println(stats.getText());

        }

    }
