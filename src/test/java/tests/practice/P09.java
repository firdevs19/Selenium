package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P09 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");
        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("Nutella");
        WebElement aranacakKelime = driver.findElement(By.id("nav-search-submit-button"));
        aranacakKelime.click();

        Thread.sleep(3000);

        driver.close();










    }
}
