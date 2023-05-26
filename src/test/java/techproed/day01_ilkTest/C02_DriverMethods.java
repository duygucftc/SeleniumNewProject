package techproed.day01_ilkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class C02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() Sayfa başlığını verir
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);// 8074D570287F8376A8C83D7DC4383CDE

        driver.get("https://techproeducation.com");
        System.out.println("Techproed Actual Title : "+driver.getTitle());//getTitle() methodu Sayfa başlığını verir

        //getCurrentUrl() Gidilen sayfanın Url'ini verir
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource());Bilerek yoruma aldık her çalıştırdığımızda konsola bütün kaynak kodlarını vereceği için

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());//8074D570287F8376A8C83D7DC4383CDE



    }

}
