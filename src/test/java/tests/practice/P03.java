package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    //Exercise3...
    //Navigate to  https://testpages.herokuapp.com/styled/index.html
    //Click on  Calculater under Micro Apps
    //Type any number in the first input
    //Type any number in the second input
    //Click on Calculate
    //Get the result
    //Print the result
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to  https://testpages.herokuapp.com/styled/index.html

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //Click on  Calculater under Micro Apps
        //calculatetest
        driver.findElement(By.id("calculatetest")).click();

        //Type any number in the first input
        //number1

        driver.findElement(By.id("number1")).sendKeys("5");


        //Type any number in the second input

        driver.findElement(By.id("number2")).sendKeys("4");

        //Click on Calculate

        driver.findElement(By.id("calculate")).click();


        //Get the result
        String result= driver.findElement(By.id("answer")).getText();



        //Print the result

        System.out.println("result = "+result);

        driver.close();











    }
}
