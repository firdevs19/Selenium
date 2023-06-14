package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        driver.get("https://www.amazon.com");

        WebElement aramaKutusuElementi = driver.findElement(By.name("field-keywords"));


        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        //List<WebElement> urunIsimElementleriList = driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));


        List<WebElement> urunIsimElementleriList = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        if (urunIsimElementleriList.size()>10){

            System.out.println("Liste urun sayisi Testi PASSED");

        }else{

            System.out.println("Liste urun sayisi testi FAILED");
        }

        // 5. urun testini test edin ve nutella icerigini yazdirin

        String besinciUrunIsmi = urunIsimElementleriList.get(4).getText();

        System.out.println("5. urun ismi : "+besinciUrunIsmi);
        String expectedIcerik ="Nutella";
        if (besinciUrunIsmi.contains(expectedIcerik)){

            System.out.println("5. urun testi PASSED");
        }else{

            System.out.println("5. urun testi FAILED");
        }




        Thread.sleep(3000);
        driver.close();








    }
}
