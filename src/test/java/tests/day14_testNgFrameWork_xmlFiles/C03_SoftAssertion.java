package tests.day14_testNgFrameWork_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_SoftAssertion {
    @Test(groups = "mini regression")
    public void test01(){
        //amazon'a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //SofAssert objesi olusturuyoruz
        SoftAssert softAssert=new SoftAssert();
        //Istediginiz tum testleri softAssert kullanarak yapin

        //title'in best icermedigini test edin
        String unexpectedIcerik="best";
        String actualTitle=Driver.getDriver().getTitle();
        softAssert.assertFalse(actualTitle.contains(unexpectedIcerik),"Title istenmeyen icerik barindiriyor");

        //url'in "https://www.amazon.com/" oldugunu test edin
        String expectedUrl="https://www.amazon.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Url beklenenden farkli");

        //Nutella aratin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonuclarinin Nutella icerdigini test edin
        String urunIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        softAssert.assertTrue(actualSonucYazisi.contains(urunIcerik));

        softAssert.assertAll();
        /*
          softAssert.assertAll() komutu yukarida yapilan tum testleri raporlar ve
          failed olan herhangi bir assertion varsa AssertionError verip calismayi durdurur
          ancak tum hatalari assertAll satirinda verir, hatalarin yerini bulmamiz ve duzeltmemiz icin
          softassert ile yapilan assertion'larda mutlaka aciklama yazilmalidir
         */
        Driver.closeDriver();
    }
}
