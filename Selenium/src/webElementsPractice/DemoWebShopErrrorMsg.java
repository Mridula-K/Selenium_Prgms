package webElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopErrrorMsg 
{
	public static void main(String[] args) throws InterruptedException
	{
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      Thread.sleep(5000);
      driver.findElement(By.linkText("Log in")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
      Thread.sleep(3000);
      driver.findElement(By.id("Password")).sendKeys("abc123");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
      Thread.sleep(2000);
      String errorMsg = driver.findElement(By.className("validation-summary-errors")).getText();
      System.out.println(errorMsg);
      
	}
}
