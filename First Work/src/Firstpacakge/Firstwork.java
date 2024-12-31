package Firstpacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Firstwork {

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

            
            // Enter to Profile 
            WebElement profileImage = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/div/div/span/img"))
            );
            Thread.sleep(2000);
            // Click the profile image
            profileImage.click();
            System.out.println("Profile clicked successfully.");
         
            Thread.sleep(5000);
            
         // Click the Message option for to react
            WebElement Messagebutton = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[2]/p/span"))
            );
            Thread.sleep(2000);
            Messagebutton.click();
            System.out.println("Button clicked successfully.");
            Thread.sleep(5000);
            
         // Click the reaction
            WebElement Reaction = letswait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div/span"))
            );
            Thread.sleep(2000);
            Reaction.click();
            System.out.println("Reaction done successfully.");
            Thread.sleep(5000);
            
            

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Test completed!");
 
        }
        
        
     
    
    }
}

