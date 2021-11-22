package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;


public class WebDriverChrome {


    public static void main(String[] args) throws InterruptedException {


        //2) setup chromedriver (mediator) - its path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\IdeaProjects\\Software\\chromedriver.exe");

        //1) create an instance of webdriver
        WebDriver driver = new ChromeDriver();  //child class object referred by parent interface reference variable

        //3.Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

        //4. get page title (Tab Name)
        String title = driver.getTitle();
        System.out.println(title);

        //5.  Expected vs Actual - Validation
        if (title.equals("nopCommerce demo store")) {
            System.out.println("The title is correct");
        } else {
            System.out.println(" The title is incorrect");
        }
    }
}
//Closing webpage
//driver.close(); //closes the current session
//drive.();// closes everything