package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args)
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/");
     String altValue = driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']")).getAttribute("alt");
     System.out.println(altValue);
     
     
     
     
     
	}

}
