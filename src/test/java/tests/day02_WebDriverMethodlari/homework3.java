package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework3 {

    public static void main(String[] args) throws InterruptedException {

        /*
        1.Yeni bir Class olusturalim.C06_ManageWindow
    2. Amazon soyfasina gidelim. https://www.amazon.com/
    3. Sayfanin konumunu ve boyutlarini yazdirin
    4. Sayfayi simge durumuna getirin
    5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
    6. Sayfanin konumunu ve boyutlarini maximize durumunda
    yazdirin
    7.Sayfayi fullscreen yapin
    8. Sayfanin konumunu ve boyutlarini fullscreen durumunda
    yazdirin
    9. Sayfayi kapatin

         */


        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        System.out.println("Konum :"+driver.manage().window().getPosition());
        System.out.println("Size :"+driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();

        System.out.println("Guncel boyut :"+driver.manage().window().getSize()+
                "\nGuncel konum :"+driver.manage().window().getPosition());

        // Extra :
        Dimension sayfaSize;
        sayfaSize=driver.manage().window().getSize();
        System.out.println("Boyutlar : "+sayfaSize);

        if (sayfaSize.equals(driver.manage().window().getSize())){
            System.out.println("Boyut DOGRU");
        }else {
            System.out.println("Boyutlar HATALI!!");
        }

        Point sayfaKonum;
        sayfaKonum=driver.manage().window().getPosition();
        System.out.println("Sayfa Konumu : "+sayfaKonum);
        if (sayfaKonum.equals(driver.manage().window().getPosition())){
            System.out.println("Alles Gut!!");
        }
        //Extra bitti!


        //7
        driver.manage().window().fullscreen();

        //8
        System.out.println("Guncel boyut :"+driver.manage().window().getSize()+
                "\nGuncel konum :"+driver.manage().window().getPosition());


        driver.close();


    }
}
