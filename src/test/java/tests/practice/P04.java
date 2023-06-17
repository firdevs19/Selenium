package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {

    public static void main(String[] args) {

        /*
            Navigate to website https://testpages.herokuapp.com/styled/index.html
            Under the ORIGINAL CONTENTS
            click on Alerts
            print the URL
            navigate back
            print the URL
            Click on Basic Ajax
            print the URL
            enter value 20 and ENTER
            and then verify Submitted Values is displayed open page
            close driver
    */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  Navigate to website https://testpages.herokuapp.com/styled/index.html

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Under the ORIGINAL CONTENTS Click on Alerts
            //*[@id="alerts"]

        driver.findElement(By.id("alerts")).click();

        //print the URL

        System.out.println(driver.getCurrentUrl());

        //navigate back

        driver.navigate().back();

        //print the URL

        System.out.println(driver.getCurrentUrl());

        //Click on Basic Ajax

        //*[@id="basicajax"]

        driver.findElement(By.id("basicajax")).click();

        // print the URL

        System.out.println(driver.getCurrentUrl());

        //  enter value 20 and ENTER

        //lteq30

        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);

        // and then verify Submitted Values is displayed open page

        String expectedValues ="Submitted Values";
        String actualValues = driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
        if (expectedValues.equals(actualValues)){

            System.out.println("Test PASSED");

        }else{

            System.out.println("Test FAILED");
        }

        driver.close();







    }
}
