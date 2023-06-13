package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wisequarter.com");

        Thread.sleep(1000);

        System.out.println(driver.getTitle());

        String expectedIcerik = "Wise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");


        }else {

            System.out.println("Title Wise icermiyor,Test FAILED");
        }

        String expectedUrl ="https://www.wisequarter.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");

        }else {

            System.out.println("Url testi FAILED");
            System.out.println("Actual Url : " + actualUrl);
        }

        System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle()); //DDFA36B9ADEDDBD8FD18C5966F84F63C unique dir ve her calistirildiginda farkli deger verir.

        System.out.println(driver.getWindowHandles());
        // bulundugumuz class daki driver tarafindan olusturulan
        // ve acik olan tum windowlarin window handle degerlerini
        // bir set olarak bize dondurur

        driver.close();


    }
}
