package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PageIlkTest  {
    @Test
    public void amazonTesti(){
        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        //Nutella icin arama yapin
        //Arama kutusunun locator'ina ihtiyacimiz var
        //Locator'larimiz page classlarinda
        //Locator'lar statik olmadigi icin obje olusturarark kullanabiliriz
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //Sonuclarin Nutella icerdigini test edin
String expectedIcerik="Nutella";
String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        //Sayfayi kapatin
        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }
}
