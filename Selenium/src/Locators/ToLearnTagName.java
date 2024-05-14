package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName 
{

	public static void main(String[] args)
	{
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    List<WebElement> allanchortag = driver.findElements(By.tagName("a"));
    System.out.println(allanchortag.size());
    List<WebElement> allImgs = driver.findElements(By.tagName("img"));
    System.out.println(allImgs.size());
    List<WebElement> allBtns = driver.findElements(By.tagName("button"));
    System.out.println(allBtns.size());
    
    
    
    
    
    
	}

}
