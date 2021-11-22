package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverIE {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.ie.driver" , "C:\\Users\\harsh\\IdeaProjects\\Software\\iedriverserver.exe");

        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

//        // Login Functionality
        Thread.sleep(4000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(4000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

        driver.findElement(By.id("Email")).sendKeys("bhumi18@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Dasnadas");
        Thread.sleep(4000);
        driver.findElement(By.className("login-button")).click();
    }
}
