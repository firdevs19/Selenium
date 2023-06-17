package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xpath {

    public static void main(String[] args) {

        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements");

       // 2- Add Element butonuna basin

        //driver.findElement(By.xpath()).click();

        //3- Delete butonu’nun gorunur oldugunu test edin

       // WebElement deleteButtonElementi









    }
}
