package xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//span[contains(@class,'x1lliihq x1plvlek xryxfnj x1n2onr6 x193iq5w xeuugli ')]")).click();
	Thread.sleep(2000);
	driver.close();
}
}
