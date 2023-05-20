package tests.MySelf;

import org.testng.annotations.Test;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Zero_Webapa {
    @Test
    public void zeroTest(){
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroURL"));
        //2. Sign in butonuna basin
        ZeroPage zeroPage=new ZeroPage();
        zeroPage.signInButton.click();
        //3. Login kutusuna “username” yazin
        zeroPage.userNameButton.sendKeys(ConfigReader.getProperty("zeroUsername"));
        //4. Password kutusuna “password” yazin
        zeroPage.passworsButton.sendKeys(ConfigReader.getProperty("zeroPassword"));
        //5. Sign in tusuna basin
        zeroPage.signInKayitButton.click();
        //6. Online banking menusu icinde Pay Bills sayfasina gidi

        //7. “Purchase Foreign Currency” tusuna basin
        //8. “Currency” drop down menusunden Eurozone’u secin
        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin


        // Bu soruyu çözmeyi unutmayalım


    }

}
