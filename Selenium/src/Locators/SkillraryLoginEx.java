package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryLoginEx 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin");
	Thread.sleep(2000);
    driver.findElement(By.id("last")).click();
}
}
