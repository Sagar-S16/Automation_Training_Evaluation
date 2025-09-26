package seleniumexercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class HotstarEx {
    public static void main(String[] args) throws InterruptedException {
 
 WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
       driver.get("https://www.hotstar.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
        driver.navigate().to("https://www.netflix.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);        
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles:");
        for (String handle : windowHandles) {
            System.out.println(handle);
        }
        driver.manage().window().maximize();      
        Thread.sleep(1000);
        driver.manage().window().minimize();      
        driver.manage().window().fullscreen();   
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");  
        Thread.sleep(2000);
        driver.close();  
        driver.quit();
    }
}
