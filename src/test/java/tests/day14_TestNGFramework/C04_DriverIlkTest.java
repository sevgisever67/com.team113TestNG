package tests.day14_TestNGFramework;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {
    /*
       POM driver oluşturmal için
       inheritance ile kullandığımız TestBase class 'i yerine static yollarla
       ulaşabileceğimiz bir metod kullanılması tercih edilir
       Driver bizim için çok önemli olduğundan
       Driver için  bağımsız bir class oluşturalım

        */
    @Test
    public void Test01(){
        //amazona git
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.wisequarter.com");
        Driver.getDriver().get("https://www.youtube.com");

        //Nutella için aram yap


        //Arama sonuçlarının nutella içerdiğini test et

        Driver.closeDriver();
    }
}
