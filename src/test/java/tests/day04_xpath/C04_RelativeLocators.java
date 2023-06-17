package tests.day04_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_RelativeLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        //3 ) Relative locator’larin dogru calistigini test edin







    }
}
