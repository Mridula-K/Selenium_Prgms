package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByDependentElements {

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://shoppersstack.com/");
     Thread.sleep(20000);

     driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']/../..//button[@name='addToCart']")).click();
     
        
     
	}

}
