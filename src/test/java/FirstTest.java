import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");

        String expectedTitle = "ToolsQA";
        String actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        driver.findElement(By.cssSelector("button#confirmButton")).click();
        driver.switchTo().alert().accept();
        }
    }
