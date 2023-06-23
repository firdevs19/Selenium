package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P10 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Automation Exercise Category Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //2- https://www.automationexercise.com/ adresine gidin
        //3- Category bolumundeki elementleri locate edin
        //4- Category bolumunde 3 element oldugunu test edin
        //5- Category isimlerini yazdirin
        //6- Sayfayi kapatin

        driver.get("https://www.automationexercise.com/");

        List<WebElement> elementler = driver.findElements(By.className("panel-heading"));

        int expectedProductNumber =3;
        int actualProductNumber = elementler.size();

        if (expectedProductNumber==actualProductNumber){
            System.out.println("Test PASSED");

        }else {
            System.out.println("Test FAILED");

        }

        for (WebElement eachElement:elementler
             ) {

            System.out.println(eachElement.getText());

        }

        Thread.sleep(3000);

        driver.close();









    }
}
