package xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAnAcctInInsta {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("saibaba7166@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'full')]")).sendKeys("Sai Baba");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SaiBaba_1702");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("OmSai@23");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(2000);
		driver.quit();


		
		
		
		
		
		
		
	}

}
