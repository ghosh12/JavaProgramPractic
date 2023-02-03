package PractisProgramInJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShortInSeleniumWebdriver {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //ChromeDriver driver=new ChromeDriver();
        TakesScreenshot ts=(TakesScreenshot)driver;
       File src= ts.getScreenshotAs(OutputType.FILE);
       File trg=new File(".//Screenshort.homepage.png");
        FileUtils.copyFile(src,trg);
        driver.quit();

    }
}
