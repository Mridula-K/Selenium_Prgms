package webElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginErrorMsg {

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.actitime.com/login-to-product");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("xyz@gmail.com");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[text()='Send a code']")).click();
     Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@class='verify-code__input-item']")).sendKeys("123456");
     Thread.sleep(3000);
     String errorMsg = driver.findElement(By.className("verify-code__error")).getText();
     System.out.println(errorMsg);
     System.out.println("The text color is "+driver.findElement(By.className("verify-code__error")).getCssValue("color"));
     
     
     
     
	}

}
