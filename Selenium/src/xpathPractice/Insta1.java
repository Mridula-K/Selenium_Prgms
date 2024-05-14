package xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("qwerty");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("12345@r");
	driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
