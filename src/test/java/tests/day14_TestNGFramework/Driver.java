package tests.day14_TestNGFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Driver {
   static WebDriver driver;

    public  static WebDriver getDriver(){
      if (driver==null) {
          WebDriverManager.chromedriver().setup();
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      }
     return driver;
    }
    @Test
    public static void closeDriver(){
        driver.close();
    }
}
