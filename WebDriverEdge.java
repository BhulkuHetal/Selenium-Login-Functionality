package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WebDriverEdge {


    public static void main(String[] args)  throws InterruptedException {


        System.setProperty("webdriver.edge.driver","C:\\Users\\harsh\\IdeaProjects\\Software\\msedgedriver.exe");

        //1) create an instance of webdriver
        WebDriver driver = new EdgeDriver();  //child class object referred by parent interface reference variable


        driver.get("https://demo.nopcommerce.com/"); // Edge webpage launched
        Thread.sleep(3000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

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
