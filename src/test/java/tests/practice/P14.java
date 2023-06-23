package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P14 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String ht = "https://www.";
        driver.get(ht+"google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.get(ht+"amazon.com");
        driver.navigate().to(ht+"amazon.com");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(ht+"wisequarter.com");
        System.out.println(driver.getTitle());

        driver.switchTo();


    }

}
