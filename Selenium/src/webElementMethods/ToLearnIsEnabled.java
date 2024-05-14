package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println("--------------Before passing data--------------");
	System.out.println(loginBtn.isDisplayed());
	System.out.println(loginBtn.isEnabled());
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
	System.out.println("--------------After passing data--------------");
	System.out.println(loginBtn.isDisplayed());
	System.out.println(loginBtn.isEnabled());

	
	
	
	
}
}
