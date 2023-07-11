package tests.day12_testNG;

import org.testng.annotations.Test;

public class C02_Priority {
/*
        JUnit'de hangi testin once calisacagini ONGOREMEYIZ ve KONTROL EDEMEYIZ
        TestNG testleri natural order'a gore calistirir

        Eger siralamayi degistirmek isterseniz
        test method'larina priority atayabilirsiniz

        priority default olarak 0 degerini alir
        ve var olan priority degerlerine gore kucukten buyuge dogru calistirir

        eger priority degeri ayni olan method'lar varsa
        natural order'a bakar
     */

    @Test (priority = 3)
    public void amazonTest() {
        System.out.println("Amazon");
    }

    @Test (priority = 2)
    public void youtubeTest() {
        System.out.println("Youtube");
    }

    @Test(priority = 1)
    public void wiseTest() {
        System.out.println("Wise");
    }
}

