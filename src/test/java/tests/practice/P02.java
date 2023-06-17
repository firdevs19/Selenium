package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {

    public static void main(String[] args) throws InterruptedException {

         /*
     . .Exercise2...
        1-Driver oluşturalim
        2-Java class'imiza chnomedriver.exet i tanitalim
        3-Driver'in tum ekranı kaplamasini saglayalim
        4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        5-"https://www.otto.de" adresine gidelim
        6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        8-Ardindan "https://wisequarter.com/" adresine gidip
        9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        10-Bir onceki web sayfamiza geri donelim
        11-Sayfayı yenileyelim
        12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.otto.de");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // "p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton"

        driver.findElement(By.xpath("//*[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();

        //   6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String ottotitle =driver.getTitle();
        System.out.println("Otto title = "+ottotitle);
        String ottoUrl = driver.getCurrentUrl();
        System.out.println("Otto Url = "+ ottoUrl);

        //  7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim

        if (ottotitle.contains("OTTO")&&ottoUrl.contains("OTTO")){

            System.out.println("Otto title ve Url test PASSED");
        }else {

            System.out.println("Otto title ve Url test FAILED");

        }

        // 8-Ardindan "https://wisequarter.com/" adresine gidip

        driver.navigate().to("https://wisequarter.com/");

        //BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim

        String quarterTitle = driver.getTitle();

        if (quarterTitle.contains("Quarter")){

            System.out.println("Test PASSED");
        }else {

            System.out.println("Test FAILED");

        }

        //  10-Bir onceki web sayfamiza geri donelim

        driver.navigate().back();

        // 11-Sayfayı yenileyelim

        driver.navigate().refresh();

        // 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim

        driver.navigate().forward();
        Thread.sleep(3000);

        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim

        driver.close();


        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();



    }
}
