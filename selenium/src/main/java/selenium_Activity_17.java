import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class selenium_Activity_17 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/selects");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        WebElement singleSelect = driver.findElement(By.id("single-select"));
        singleSelect.click();

        WebElement dropdown=driver.findElement(By.tagName("select"));
        Select s = new Select(dropdown);
        List<WebElement> options = s.getOptions();
        s.selectByVisibleText("Option 2");
        String selectedOption = s.getFirstSelectedOption().getText();
        System.out.println("1  " +selectedOption);

        s.selectByIndex(3);
        String selectedOption1 = s.getFirstSelectedOption().getText();
        System.out.println("2  "+selectedOption1);

        s.selectByValue("4");
        String selectedOption2 = s.getFirstSelectedOption().getText();
        System.out.println("3  "+selectedOption2);


//        driver.quit();
    }

}



