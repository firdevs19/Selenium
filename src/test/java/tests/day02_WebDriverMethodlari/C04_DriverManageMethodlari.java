package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        System.out.println("Ilk sayfa size: "+driver.manage().window().getSize());
        System.out.println("Ilk sayfanin konumu : "+driver.manage().window().getPosition());


        driver.manage().window().maximize();
        System.out.println("maximize sayfa size: "+driver.manage().window().getSize());
        System.out.println("maximize sayfanin konumu : "+driver.manage().window().getPosition());



        driver.manage().window().fullscreen();
        System.out.println("Fullscreen size: "+driver.manage().window().getSize());
        System.out.println("Fullscreen konumu : "+driver.manage().window().getPosition());


        Thread.sleep(3000);

        driver.close();


    }
}
