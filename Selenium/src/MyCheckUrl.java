import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyCheckUrl {
    public static String url="http://www.amazon.com/";//Global
    public static WebDriver driver;


    public static void main(String args[]){
         firefox(url);                              //code statement

        boolean result=urlValidation((url));
        System.out.println(("Validation:"+result));
    }


    public static void firefox(String url) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\aozde\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
         driver=new FirefoxDriver();
        driver.get(url);
    }

    public static boolean urlValidation(String url){
        System.out.println("Current Url:"+driver.getCurrentUrl());
        System.out. println("Requested Url"+url);
        if (url.equals(driver.getCurrentUrl())){
            return true;
        }
        else{
            return false;
        }
    }}

