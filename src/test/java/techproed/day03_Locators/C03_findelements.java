package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasina gidelim.
        driver.get("https://amazon.com");

        //Sayfadaki linklerin sayisini ve linkleri yazdiralim.
        /*
        findElement ile bir webelement'e ulasabilirken, birden fazla webelement icin findElements() methodunu
        kullanabiliriz. Bu webElemntlerin sayisina ulasmak icin ya da bu webElementlerin yazisini konsol'a yazdirabilmek icin
        List<Webelement> linklerListesi = driver.findElements(By.locator("locator degeri")) olarak kullaniriz.
        Olusturmus oldugumuz list'i loop ile konsola yazdirabiliriz.
         */
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi : " + linklerListesi.size());

        //webelementin üzerindeki yazıyı almak istiyorsan getText() methodu kullanırız.
        /*
        for (WebElement w:linklerListesi) {
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }


        */

        //2.Yol ==> Lambda ile yazdiralim.

        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
                                       {System.out.println(link.getText());}});

        //Sayfayi kapatalim
        //driver.close();

        //Hello, sign in webElementinin yazisini yazdiralim.
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());

        driver.close();



    }


}
