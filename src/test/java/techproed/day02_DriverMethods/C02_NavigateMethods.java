package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasina gidelim.
        driver.navigate().to("https://techproeducation.com");//get() methodu ile ayni mantikta calisir.
        Thread.sleep(3000); //Java kodlarini bekletmek icin kullanabiliriz.

        //Sonra Amazon sayfasina gidelim.
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasinin basligini yazdiralim.
        System.out.println("Amazon Sayfa Basligi : "+ driver.getTitle());
        Thread.sleep(3000);

        //Techproeducation sayfasina geri donelim.
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa basligini yazdiralim.
        System.out.println("Techproeducation Sayfa Basligi : "+driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasina tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon Sayfasi Url'i : " + driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayi kapatalim.
        driver.close();
    }
}
