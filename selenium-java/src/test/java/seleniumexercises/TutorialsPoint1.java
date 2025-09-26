package seleniumexercises;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
 
import java.time.Duration;
 
public class TutorialsPoint1 {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();
 
       
        wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys("Sagar S");
        driver.findElement(By.id("email")).sendKeys("sagar@gmail.com");
 
       
        WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input"));
        maleRadio.click();
      
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9945661506");
        
        driver.findElement(By.xpath("//input[@id='subjects']")).sendKeys("Maths");
        
        driver.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//label[text()='Music']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("16-08-2000");
        driver.findElement(By.xpath("//input[@id='picture']")).sendKeys("C:/Users/DELL/Desktop/Output.txt");
      
     
        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Domlur Bangalore");
      
        
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("Uttar Pradesh");
 
        
        Select citySelect = new Select(driver.findElement(By.id("city")));
        citySelect.selectByVisibleText("Lucknow");
        
        //driver.findElement(By.xpath("//input[@value='Login']")).click();
      
        System.out.println("Form automated successfully");
 
        
       // driver.quit();
    }
}