package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'a gittikten sonra ilk is olarak sayfayi
        // her zaman maximize yapmaliyiz

        //Browser'in konumunu yazdiralim.
        System.out.println("Sayfanin Konumu : "+driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim.
        System.out.println("Sayfanin boyutlari : " + driver.manage().window().getSize());

        //Browser'i maximize yapalim.
        driver.manage().window().maximize();
        /*
      Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
      webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
      maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
      browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
      ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
       */

        //Techproeducation sayfasina gidelim.
        driver.get("https://techproeducation.com");

        //Tekrar Browser'in konumunu yazdiralim.
        System.out.println("Maximize yaptiktan sonra Sayfanin Konumu :  " + driver.manage().window().getPosition());

        //Tekrar Browser'in boyutlarini yazdiralim.
        System.out.println("Maximize yaptiktan sonra Sayfanin Boyutlari : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayi minimize yapalim.
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayi fullScreen yapalim.
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50)); //Istedigimiz konuma getirir.
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));//Istedigimiz boyutlara getirir.(genislik ve boy)
        Thread.sleep(3000);

        //Sayfayi kapatiniz.
        driver.close();














    }
}
