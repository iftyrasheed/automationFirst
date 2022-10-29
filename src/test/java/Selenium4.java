import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Selenium4 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dragElement = driver.findElement(By.cssSelector("div#draggable"));
        WebElement dropElement = driver.findElement(By.cssSelector("div#droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement).perform();
        }
    }

