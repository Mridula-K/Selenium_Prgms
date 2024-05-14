package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize 
{

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://shoppersstack.com/");
     Dimension size = driver.manage().window().getSize();
     System.out.println(size.getHeight());
     System.out.println(size.getWidth());
     
     driver.manage().window().setSize(new Dimension(1000,1000));
     Thread.sleep(3000);
     	driver.quit();
	
	}

}
