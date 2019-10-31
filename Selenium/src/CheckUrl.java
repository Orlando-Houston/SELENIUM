import com.sun.source.tree.IfTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl {
    public static  String url="http://www.amazon.com/";
    public static WebDriver driver;


    public static void main(String[] args) {
        chrome(url);
        boolean result=urlValidatoin(url);
        System.out.println("Validation:"+result);
    }

    public static void chrome(String url) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aozde\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);

    }
    public static boolean urlValidatoin(String url){
        System.out.println("Current Url:" +driver.getCurrentUrl());
        if (url.equals(driver.getCurrentUrl())){
            return true;
        }
        else{
            return false;
        }
    }





}