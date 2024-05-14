package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByVisibleText {

	public static void main(String[] args)
	{
    ChromeDriver r=new ChromeDriver();
    r.manage().window().maximize();
    r.get("https://demowebshop.tricentis.com/");
    r.findElement(By.xpath("//span[text()='Shopping cart']")).click();
    
   
	}

}
