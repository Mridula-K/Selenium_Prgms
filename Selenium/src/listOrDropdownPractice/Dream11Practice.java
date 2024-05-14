package listOrDropdownPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11Practice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	
	driver.get("https://www.dream11.com/");
	driver.findElement(By.id("regEmail")).sendKeys("95681");
	driver.findElement(By.id("regUser")).click();
	System.out.println(driver.findElement(By.id("errorMob")).getText());
	
	
	
	
	
}
}
