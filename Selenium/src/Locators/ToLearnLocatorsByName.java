package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocatorsByName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/login");
//		driver.findElement(By.name("Email")).sendKeys("saibaba7166@gmail.com");//when id is not present,we go for name 
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("8012614614");
		
		
		
	}

}
