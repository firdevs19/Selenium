package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P12 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    //1-Driver oluşturalim
    //2-Java class'imiza chnomedriver. exetyi tanitalim
    //3-Driver'in tum ekranı kaplamasini sagu ayalim
    //4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        //Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
    //5-Navigate to http://www.babayigit.net/murat/testpage.html
    //6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
       // alanlarına gerekli bilgileri yazsın
    //7-Submit tuşuna bassın.
    //8- All information was entered correctly.. yazısının göründüğünü test etsin
    //9- Clear butonu ile tüm butonları temizlesin
    //10- Manuel olarak temizlendiğini görecek kadar beklesin
    //11- Sayfayı kapatsın
    //10-8. maddededeki Test sonucunu yazdırsın



        driver.get("http://www.babayigit.net/murat/testpage.html");

        driver.findElement(By.id("ad")).sendKeys("Murat");
        driver.findElement(By.id("soyad")).sendKeys("Yigit");
        driver.findElement(By.id("yas")).sendKeys("41");
        driver.findElement(By.id("meslek")).sendKeys("ogretmen");
        driver.findElement(By.id("dogum_yeri")).sendKeys("Istanbul");
        driver.findElement(By.id("mezun_okul")).sendKeys("Bogazici");
        driver.findElement(By.id("cocuk_sayisi")).sendKeys("2");
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        String uyari = "All information was entered correctly..";

        if (driver.findElement(By.id("uyari")).getText().equals(uyari)){

            System.out.println("All information was entered correctly.. Uyarisi goruntulendi");
            System.out.println("Test Passed");
        }else {

            System.out.println("Test Failed");
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='reset']")).click();

        Thread.sleep(1000);

        driver.quit();




    }
}
