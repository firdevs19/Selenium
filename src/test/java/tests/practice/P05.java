package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      driver.get("https://www.amazon.com/");

        System.out.println(driver.getTitle());

        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)){
            System.out.println("Test PASSED");

        }else {
            System.out.println("Test FAILED");

        }

        System.out.println(driver.getCurrentUrl());

        String expectedUrl = "Amazon";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.contains(actualUrl)){

            System.out.println("Test PASSED");

        }else {

            System.out.println("Test FAILED");
        }


        System.out.println(driver.getWindowHandle());

        String expectedResult = "Alisveris";
        String actualResult = driver.getPageSource();

        if (expectedResult.contains(actualResult)){

            System.out.println("Test PASSED");

        }else {

            System.out.println("Test FAILED");
        }

        driver.close();




    }
}
