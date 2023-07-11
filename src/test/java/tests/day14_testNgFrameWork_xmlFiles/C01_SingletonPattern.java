package tests.day14_testNgFrameWork_xmlFiles;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingletonPattern {
    @Test
    public void test01(){
       /*
         Singleton pattern bir class'tan obje olusturulmasini engellemek icin kullanilan bir yontemdir
         Page Object Model'de WebDriver olarak Driver class'indaki getDriver()'nun kullanilmasini istiyoruz.

         Driver class'inin farkli kullanilmasini engellemek icin POM tasarlayanlar
         singleton pattern kullanmistir

         singleton pattern parametresiz constructor'i gorunur yapip access modifier'ini private yaparak
         istenen class'tan obje olusturulmasini engeller.

        */

        //amazon'a gidin
        // Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Driver objemizi private yapip direkt kullanimi engelledik
        //  Driver.driver.get(ConfigReader.getProperty("amazonUrl"));

      //  Driver driver=new Driver();
       // driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //singleton pattern kullanarak bu sekilde erisim durduruldu
    }
}
