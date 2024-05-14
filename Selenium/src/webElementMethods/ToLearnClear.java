package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.vtiger.com/vtigercrm/");
     WebElement userTF = driver.findElement(By.id("username"));
     userTF.clear();
     Thread.sleep(2000);
     userTF.sendKeys("Selenium");
     WebElement pwdTF = driver.findElement(By.id("password"));
     pwdTF.clear();
     Thread.sleep(2000);
     pwdTF.sendKeys("java");
     
     
     
     
     
	}

}
