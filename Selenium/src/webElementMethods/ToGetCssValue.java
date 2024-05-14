package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCssValue {

	public static void main(String[] args) {
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/login");
     driver.findElement(By.xpath("//input[@value='Log in']")).click();
     String color = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
     System.out.println("The color of the font is "+color);
	
	String fontSize = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-size");
     System.out.println("The font size is "+fontSize);
     
	String fontFamily = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-family");
     System.out.println("The font family is "+fontFamily);
     
     
     
     
     
	}

}
