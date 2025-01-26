package Exam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class exam {
	
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(60));
        try {
            // Enter to Login Page
            driver.get("https://hachnat.stage-carelogix.de/sing-in");

            // Wait for Username, Password, and Login button to be visible and enter credentials
            WebElement username = letswait.until(ExpectedConditions.presenceOfElementLocated(By.id("credential")));
            WebElement password = letswait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
            WebElement loginButton = letswait.until(ExpectedConditions.elementToBeClickable(By.className("ant-btn")));

            username.sendKeys("syedshawon24@gmail.com");
            password.sendKeys("Carelogix24!!");
            loginButton.click();

            // Wait for 5 seconds after login
            Thread.sleep(5000);  

            
            // Enter to task 
            WebElement task = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/header/div/div[2]/nav/div[2]/div[3]/a/div/img"))
            );
            Thread.sleep(2000);
            // Click on task
            task.click();
            System.out.println("task clicked");
         
            Thread.sleep(5000);
            
         // Enter to create 
            WebElement create = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/main/div/div[1]/div[1]/div/div[1]/div[1]/div/button/span[2]"))
            );
            Thread.sleep(2000);
            // Click on create
            create.click();
            System.out.println("click create.");
         
            Thread.sleep(5000);
            
            
            
            WebElement boardname = letswait.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
            boardname.sendKeys("Akatsuki");
         
            WebElement boardpermission = letswait.until(ExpectedConditions.elementToBeClickable(By.className("ant-select-selection-search-input")));
            
            boardpermission.click();
            
            
           // click 
            WebElement select = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div"))
            );
            
            Thread.sleep(2000);
            // Click on private
            select.click();
            System.out.println("click private.");
         
            Thread.sleep(5000);
            
         // crate board 
            WebElement createnew = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/form/div[2]/button/span"))
            );
            Thread.sleep(2000);
            // Click on to create
            createnew.click();
            System.out.println("Submite clicked.");
         
            Thread.sleep(5000);
            
            
            // click profile 
               WebElement profile = letswait.until(
                   ExpectedConditions.elementToBeClickable(By.xpath(" /html/body/div/div[2]/div/div/header/div/div[3]/div[2]/a/div/div[1]/img"))
               );
               Thread.sleep(2000);
               // Click on 
               profile.click();
               System.out.println("Profile clicked.");
            
               Thread.sleep(5000);
               
               
               // logout 
               WebElement logout = letswait.until(
                   ExpectedConditions.elementToBeClickable(By.xpath("   /html/body/div/div[2]/div/div/header/div/div[3]/div[2]/div/button"))
               );
               Thread.sleep(2000);
               // logout 
               logout.click();
               System.out.println("logout done .");
            
               Thread.sleep(5000);
               
               
            
               
          
          

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Test completed!");
 
        }
        
        
     
    
    }
	
	

}