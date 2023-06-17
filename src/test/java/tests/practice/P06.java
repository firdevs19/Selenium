package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. Yeni bir Class olusturalim.C05_NavigationMethods
        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        //4. Tekrar YouTube’sayfasina donelim
        //5. Yeniden Amazon sayfasina gidelim
        //6. Sayfayi Refresh(yenile) yapalim
        //7. Sayfayi kapatalim / Tum sayfalari kapatalim

        driver.get("https://www.youtube.com/");

        driver.navigate().to("https://www.youtube.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();






    }
}
