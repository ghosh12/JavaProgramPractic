import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthenticationHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //real url
        // driver.get("http://the-internet.herokuapp.com/basic-outh");
        //after http://than put user name password
        //http://userName:passward.com
        //handle url
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic-outh");
        String text =driver.findElement(By.cssSelector("p")).getText();
        System.out.println(text);

    }
}
