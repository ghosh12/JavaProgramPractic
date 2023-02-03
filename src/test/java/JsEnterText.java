import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsEnterText {
    public static void main(String[] args)  {
        // WebDriver driver;
        try {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            WebElement element = driver.findElement(By.name("q"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //one way
            jse.executeScript("document.getElementsByName('q')[0].value='dipak'");
            //another way
            //jse.executeScript("argument[0].value='dipak'",element);

            //driver.quit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}

