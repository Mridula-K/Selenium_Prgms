package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendkeys
{

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoapp.skillrary.com/");
//     driver.findElement(By.name("keyword")).sendKeys("Selenium",Keys.ENTER);
     WebElement searchTF = driver.findElement(By.name("keyword"));
     searchTF.sendKeys("SELENIUM");
     Thread.sleep(3000);
     searchTF.sendKeys(Keys.ENTER);
     
     
     
     
     
     
	}

}
