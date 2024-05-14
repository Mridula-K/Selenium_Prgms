package revisionCls;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersstackEx1 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shoppersstack.com/products_page/11");
        Thread.sleep(35000);
        String parentid = driver.getWindowHandle();
        driver.findElement(By.id("compare")).click();
        Set<String> allwid = driver.getWindowHandles();
        allwid.remove(parentid);
        for(String id:allwid)
        {
        	driver.switchTo().window(id);
//        	driver.close();
        	String url = driver.getCurrentUrl();
        	
        	if(url.contains("flipkart")||url.contains("amazon")||url.contains("ebay"))
        	{
        		driver.close();
        	}
        }
        
      

	}
}
