package Assignment1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://shoppersstack.com/products_page/5");
	Thread.sleep(30000);
    driver.findElement(By.id("compare")).click();
    Set<String> allWindowIds = driver.getWindowHandles();
    for(String wid:allWindowIds)
    {
    	driver.switchTo().window(wid);
    	System.out.println(driver.getCurrentUrl()+" : "+wid);
//    	Thread.sleep(1000);
//  	driver.close();
    	String url = driver.getCurrentUrl();
    	if(url.contains("ebay"))//ASSIGNMENT
    	{
    		driver.manage().window().maximize();
    		System.out.println("Ebay Maximised Successfully..!");
    		Thread.sleep(2000);
    	}
    }
    driver.quit();
    
}	
}

