package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators
{
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com/");

        //Arama kutusunu locate edelim.
        //Arama kutusuna "iphone" yazdiralim ve aratalim.

        /*
        Bir elementin locate'ini birden fazla kullanacaksaniz, bir Webelement'e degisken olarak atayabilirsiniz.
        Ornegin;
        Webelement aramaKuutusu = driver.findElement(By.id("twotabsearchtextbox"));
        seklinde kullanabiliriz.
        1-Locate işlemi bittikten sonra webelemente bir metin göndereceksek sendKeys() methodu kullanırız.
        2-Webelement'e tıklayacaksak click() methodu kullanırız
        3-Webelement'in üzerindeki yazıyı almak istiyorsak getText()methodunu kullanırız.
        4-sendKeys() methodundan sonra(yani web element'e metin gonderdikten sonra) Keys.ENTER ile ya da
        submit() methodu ile manuel olarak emter yaptigimiz gibi otomasyonda da yapabiliriz.
         */

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);


        //Sayfayi kapatalim.
        driver.close();












    }
}
