package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        // doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin

        driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

       if (expectedTitle.equals(actualTitle)){

           System.out.println("youtube Title test PASSED");

       }else {

           System.out.println("Title test FAILED \nActual title : "+actualTitle);
       }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.

        String expectedUrl = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){

            System.out.println("youtube Url test PASSED");
        } else {

            System.out.println("youtube Url test FAILED \n actualUrl : "+actualUrl);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

       driver.navigate().to("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun

       driver.navigate().back();

        //6. Sayfayi yenileyin

        driver.navigate().refresh();

        //7. Amazon sayfasina donun

        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin

        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.

        expectedTitle = "Amazon";
        actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitle)){

            System.out.println("Amazon Title test PASSED");
        }else {

            System.out.println("Amazon Title test FAILED \n actualTitle : "+actualTitle);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın.

        expectedUrl = "https://www.amazon.com/";
        actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){

            System.out.println("Amazon Url Test PASSED");

        }else{

            System.out.println("Amazon Url Test FAILED \n actualUrl : "+actualUrl);
        }



       Thread.sleep(3000);

       driver.close();





    }
}
