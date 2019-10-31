import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aozde\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//first step
        driver.get("http://www.amazon.com");//third step  //web driver interface
        // driver.get("http://www.facebook.com");

        }
    }