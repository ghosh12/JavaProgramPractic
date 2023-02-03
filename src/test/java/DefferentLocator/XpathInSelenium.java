package DefferentLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public class XpathInSelenium {
   static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      WebElement morgageCalculatorLink = driver.findElement(By.xpath("//*[@id=\"hl1\"]/li[1]/a"));
      morgageCalculatorLink.click();
      WebElement montlyPay=driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/h2"));
      System.out.println(montlyPay.getText());


    }
    public void tearDown(){
        driver.quit();
    }
}
