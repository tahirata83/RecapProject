package utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver=null;

    public static WebDriver getDriver(){

        if(driver== null){
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver(  );

        }

        return driver;
    }

    public static void closeDriver(){

        if(driver!=null){
            driver.quit();
            driver = null;
        }

    }

}
