package PractisProgramInJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectElementDripdown {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.macys.com//");
       WebElement menLink=driver.findElement(By.xpath("//span[normalize-space()='Sign In']"));
       Thread.sleep(3000);
       //Three way we can handle drop down
       Select select=new Select(menLink);
        select.selectByVisibleText("New Arrivals");
        select.selectByIndex(2);
        select.selectByValue("4");

    }
}
