package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		boolean loginBtn = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(loginBtn);
		
		
		
	}

}
