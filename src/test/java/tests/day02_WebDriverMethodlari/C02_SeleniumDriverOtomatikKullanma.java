package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C02_SeleniumDriverOtomatikKullanma {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new EdgeDriver();

        Thread.sleep(2000);

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);

        driver.close();


    }
}
