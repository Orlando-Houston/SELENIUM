import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aozde\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//first step
        driver.get("http:www.zara.com");

    }
}
