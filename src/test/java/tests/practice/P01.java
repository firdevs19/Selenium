package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {

    public static void main(String[] args) throws InterruptedException {

        /*
          /....Exercise-1:...
          Create a new class with main method
        Set Path
        Create a chrome driver
        Maximize window
        Open google home page https://www.google.com
        On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        Wait about 4 sn
        Navigate forward to amazon
        Refresh page
        Close/quit the browser
        And Last step print "All is well" on console
  */

        // Create a new class with main method

        //Set Path
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Open google home page https://www.google.com

        driver.get("https://www.google.com");
        Thread.sleep(1000);

        driver.findElement(org.openqa.selenium.By.xpath("//*[@id='W0wltc']")).click();

        // On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
        driver.findElement(org.openqa.selenium.By.xpath("//input[@data-action-type='DISMISS']")).click();
        Thread.sleep(1000);


        driver.navigate().back();

        //Wait about 4 sn

        Thread.sleep(4000);

        //Navigate forward to amazon

        driver.navigate().forward();

        //Refresh page

        driver.navigate().refresh();

        //  Close/quit the browser

        driver.close();

        System.out.println("All is well");























    }

    private static class By {
    }
}
