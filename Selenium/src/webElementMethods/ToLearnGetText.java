package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) {
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.vtiger.com/vtigercrm/");
     WebElement userTF = driver.findElement(By.id("username"));
     userTF.clear();
     userTF.sendKeys("Selenium");
     
     driver.findElement(By.xpath("//button[text()='Sign in']")).click();
     String errorMsg = driver.findElement(By.id("validationMessage")).getText();
     System.out.println(errorMsg);
     
	}

}
