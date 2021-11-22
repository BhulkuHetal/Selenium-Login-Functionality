package SeleniumSession;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverFireFox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\harsh\\IdeaProjects\\Software\\geckodriver.exe");

        //1) create an instance of webdriver
        WebDriver driver = new FirefoxDriver();  //child class object referred by parent interface reference variable


        driver.get("https://demo.nopcommerce.com/"); // fire fox webpage launched

// Login Functionality
        Thread.sleep(4000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

        driver.findElement(By.id("Email")).sendKeys("bhumi18@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Dasnadas");
        Thread.sleep(3000);
        driver.findElement(By.className("login-button")).click();


    }


}

