package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClick {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
     Thread.sleep(7000);
    
     WebElement clickButton = driver.findElement(By.id("btn"));
     clickButton.click();
     System.out.println("Clicked Successfully...!");
     
     
	}

}
