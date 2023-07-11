package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        //baska package'daki class'larin bu constructor'i kullanabilmeleri icin access modifier'ini
        //public yapmaliyiz

        //bu page class'indan locate kullanacak tum class'lar AmazonPage class'indan obje olusturmali
        //Obje olusturmak icin de mutlaka bu constructor calisacak
        //O zaman bu class'ta WebDriver'imizi tanimlama isini
        //bu constructor icinde yapabiliriz.

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="twotabsearchtextbox")
    public WebElement aramaKutusu;


    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElementi;


}
