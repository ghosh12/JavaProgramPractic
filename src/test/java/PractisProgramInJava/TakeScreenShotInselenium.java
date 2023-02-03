package PractisProgramInJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TakeScreenShotInselenium {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        //Screenshort with current date.
        Date currentdate=new Date();
        //System.out.println(currentdate);
         String screenshortFileName=currentdate.toString().replace(" ","-").replace(":","-");
         System.out.println(screenshortFileName);

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        File trg= new File(".\\Screenshot"+screenshortFileName+"\\homepage.png");
        FileUtils.copyFile(src,trg);
        driver.close();

    }
    public  static void screenShortInSelenium(){
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File src=screenshot.getScreenshotAs(OutputType.FILE);
    }
}

