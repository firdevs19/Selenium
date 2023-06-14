package tests.day03_Webelements_Locators;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.AnnotatedArrayType;
import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon anasayfaya gidin.

        driver.get("https://www.amazon.com");

        // Arama cubuguna Nutella yazdirip aratin.

        /*
            Bir webelement i kullanabilmek icic
            oncelikle o webdriver in bulabilmesi icin Locate etmeliyiz.
            Yani yerini tarif edecek bilgiye ulasmaliyiz.

            amazon arama cubugu icin bu bilginin id = twotabsearchtextbox oldugunu
            amazon sayfasinda arastirma yaparak bulduk.

            Sonra bu locate blgisini kullanarak,
            web sayfasinda o elementi bulup,bu class da o webelement i kullanabilmek icin
            kaydedecek bir hazir method a ihtiyacimiz var.
         */

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));

        /*

        bU SATIRDA § ISLEM YAPILIYOR
        1- Locate islemi : id = twotabsearchtextbox
        2- bu locate i istedigimiz arama kutusunu bize getirecek method
        driver.findElement() ile buldugumuz web elementi
        3- locate edip , findElement() ile buldugumuz web elementi
        icinde bulundugumuz class da kullanabilmek icin bir WebElement objesine ATAMAK

         */

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();


        // Arama onuclarinin Nutella icerdigini test edin.

        WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));

        System.out.println(aramaSonucElementi.getText());

        String expectedIcerik = "Nutella";
        String actualSonucYazisi= aramaSonucElementi.getText();

        if (actualSonucYazisi.contains(expectedIcerik)){

            System.out.println("Nutella test PASSED");
        }else {

            System.out.println("Nutella test FAILED\nActual Test : "+actualSonucYazisi);
        }


        Thread.sleep(5000);
        driver.close();


    }
}
