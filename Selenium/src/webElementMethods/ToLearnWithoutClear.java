package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWithoutClear
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	 WebElement username = driver.findElement(By.id("username"));
	 username.sendKeys(Keys.CONTROL+"a");
	 username.sendKeys(Keys.DELETE);
	 username.sendKeys(Keys.chord("ADMIN"));
	 
	 WebElement password = driver.findElement(By.id("password"));
	 password.sendKeys(Keys.CONTROL+"a");
	 password.sendKeys(Keys.DELETE);
	 password.sendKeys(Keys.chord("admin"));
	 
	 WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	 signInButton.sendKeys(Keys.ENTER);
	 
	 if(driver.getTitle().equals("Dashboard"))
	 {
		 System.out.println("Dashboard is verified");
	 }
	 else
	 {
		 System.out.println("Dashboard is not verified");
	 }
	 driver.quit();
}
}
