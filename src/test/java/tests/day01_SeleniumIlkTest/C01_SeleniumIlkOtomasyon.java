package tests.day01_SeleniumIlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_SeleniumIlkOtomasyon {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }

}
