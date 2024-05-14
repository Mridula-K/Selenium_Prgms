package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToFrame {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.dream11.com/");
			
//			driver.switchTo().frame(0);
//			driver.switchTo().frame("send-sms-iframe");
			WebElement smsframe = driver.findElement(By.id("send-sms-iframe"));
			driver.switchTo().frame(smsframe);
			driver.findElement(By.id("regEmail")).sendKeys("95681");
			driver.findElement(By.id("regUser")).click();
			System.out.println(driver.findElement(By.id("errorMob")).getText());
			
			driver.switchTo().defaultContent();
//			driver.switchTo().parentFrame();
			driver.findElement(By.id("hamburger")).click();
			
			
	}

}
