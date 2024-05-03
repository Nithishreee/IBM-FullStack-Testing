import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.Color;

public class selenium_Activity_4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        WebElement thirdHeader = driver.findElement(By.xpath("(//h1 | //h2 | //h3 | //h4 | //h5 | //h6)[3]"));
        String headerText = thirdHeader.getText();
        System.out.println("Text of the third header: " + headerText);

        WebElement fifthHeader = driver.findElement(By.xpath("(//h1 | //h2 | //h3 | //h4 | //h5 | //h6)[5]"));
        String color = fifthHeader.getCssValue("color");
        String hex = Color.fromString(color).asHex();
        System.out.println("Text of the Fifth header color: " + hex);

        // Using CSS selector, find the violet button and print it's all class
        WebElement violetButton = driver.findElement(By.cssSelector("button[class*='violet']"));
        String violetButtonClasses = violetButton.getAttribute("class");
        System.out.println("Classes of the violet button: " + violetButtonClasses);

        // Using CSS selector, find the grey button and print its text
        WebElement greyButton = driver.findElement(By.cssSelector("button.grey"));
        String greyButtonText = greyButton.getText();
        System.out.println("Text of the grey button: " + greyButtonText);

    }
}
