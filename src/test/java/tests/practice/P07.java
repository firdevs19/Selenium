package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P07 {

    public static void main(String[] args) throws InterruptedException {

        //1. Yeni bir Class olusturalim.C06_ManageWindow
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        //4. Sayfayi simge durumuna getirin
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //7. Sayfayi fullscreen yapin
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        //9. Sayfayi kapatin

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        System.out.println(driver.manage().window().getPosition()+ "konum");
        System.out.println(driver.manage().window().getSize()+"boyut");

        driver.manage().window().minimize();

        Thread.sleep(3000);

        driver.manage().window().maximize();

        System.out.println(driver.manage().window().getPosition()+"maxkonum");
        System.out.println(driver.manage().window().getSize()+"maxboyut");

        Thread.sleep(3000);

        driver.manage().window().fullscreen();

        System.out.println(driver.manage().window().getPosition()+"fullkonum");
        System.out.println(driver.manage().window().getSize()+"fullboyut");

        driver.close();


    }
}
