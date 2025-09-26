package seleniumexercises;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SweetAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sweetalert2.github.io/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Show normal alert']")).click();
        Alert alert = driver.switchTo().alert();
		System.out.println("Alert text "+ alert.getText());
		
		alert.accept();
		System.out.println("Alert accepted");
		Thread .sleep(2000);
		
		
        }
 
        //driver.quit();
    }
 