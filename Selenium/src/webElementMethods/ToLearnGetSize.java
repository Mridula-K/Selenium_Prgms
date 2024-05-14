package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
     public static void main(String[] args)
     {
	 ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/");
     Dimension searchWeSize = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
     System.out.println(searchWeSize);
     System.out.println(searchWeSize.getHeight());
     System.out.println(searchWeSize.getWidth());
    
     }
}
