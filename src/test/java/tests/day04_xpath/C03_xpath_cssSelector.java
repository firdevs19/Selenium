package tests.day04_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xpath_cssSelector {

    public static void main(String[] args) {

        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //6- Gift Cards sekmesine basin
        //7- Birthday butonuna basin
        //8- Best Seller bolumunden ilk urunu tiklayin
        //9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        String actualTitle = driver.getTitle();
        String expectedIcerik = "Spend less";


    }
}