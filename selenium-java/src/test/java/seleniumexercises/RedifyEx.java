package seleniumexercises;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RedifyEx {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("login")).sendKeys("your_username");
        driver.findElement(By.name("passwd")).sendKeys("your_password"); 
        driver.findElement(By.name("proceed")).click();
        System.out.println("Rediff login attempted successfully");
        Thread.sleep(2000);
        driver.quit();
    }
}

