package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class P13 {

    public static void main(String[] args) {



        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1 ) http://babayigit.net/relativelocators/relative.html adresine gidin

        driver.get("http://babayigit.net/relativelocators/relative.html");

        //2 ) Nurse  3 farkli relative locator ile locate edin

        WebElement dr = driver.findElement(By.id("dr_thumb"));
        WebElement fr = driver.findElement(By.id("frmn_thumb"));
        WebElement pl = driver.findElement(By.id("pol_thumb"));

        WebElement nurse1 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(dr));
        WebElement nurse2 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(fr));
        WebElement nurse3 =driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(pl));


        //3 ) Relative locator’larin dogru calistigini test edin

        if (nurse1.getAttribute("id").equals("nurse_thumb")){

            System.out.println("Ilk Locator testi PASSED");
        }else {

            System.out.println("Ilk Locator Testi FAILED");
        }

        System.out.println("--------------------------------");

        if (nurse2.getAttribute("id").equals("nurse_thumb")){
            System.out.println("Ikinci Locator testi PASSED");

        }else {

            System.out.println("Ikinci Locator Testi FAILED");
        }

        System.out.println("----------------------------------");

        if (nurse3.getAttribute("id").equals("nurse_thumb")){

            System.out.println("Ucuncu Locator testi PASSED");
        }else {

            System.out.println("Ucuncu Locator Testi FAILED");
        }

        driver.quit();





    }
}
