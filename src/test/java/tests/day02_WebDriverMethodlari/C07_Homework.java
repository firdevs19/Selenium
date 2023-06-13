package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Homework {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){

            System.out.println("Title test PASSED");


        }else {

            System.out.println("Title test FAILED\nActual title :" + actualTitle);
        }


        String expectedUrlIcerik = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("facebook Url testi PASSED");

        }else {

            System.out.println("facebook Url testi FAILED\nActual Url : + actualUrl");
        }

        driver.navigate().to("https://www.walmart.com/");

        actualTitle = driver.getTitle();
        String expectedTitleIcerik = "Walmart.com";

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Walmart title testi PASSED");

        } else {

            System.out.println("Walmart title testi FAILED, \nActual Title : " +actualTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.close();



    }
}
