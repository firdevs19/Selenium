package tests.practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P08 {

    public static void main(String[] args) {

        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //8. Sayfayi kapatin

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        System.out.println(driver.manage().window().getSize()+"suankiboyut");
        System.out.println(driver.manage().window().getPosition()+"suankikonum");

        driver.manage().window().setPosition(new Point(19,19));
        driver.manage().window().setSize(new Dimension(250,500));

        System.out.println(driver.manage().window().getPosition()+"ayarlanmis konum");
        System.out.println(driver.manage().window().getSize()+"ayarlanmis boyut");

        driver.close();


    }
}
