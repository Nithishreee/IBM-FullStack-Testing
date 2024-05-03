import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
public class selenium_Activity_7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();
        if(droppable.getText().contains("Dropped!"));
        System.out.println("Dropped 1");
        new Actions(driver)
                .dragAndDrop(droppable, dropzone2)
                .perform();

        if(dropzone2.getText().contains("Dropped!"));
        System.out.println("Dropped 2");
        driver.quit();



    }
}
