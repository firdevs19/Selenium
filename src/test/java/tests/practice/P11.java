package tests.practice;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P11 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.name("firstname")).sendKeys("Firdevs"+ Keys.ENTER);
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Okur");




    }











}







