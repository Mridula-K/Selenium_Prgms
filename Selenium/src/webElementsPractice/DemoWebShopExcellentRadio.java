package webElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopExcellentRadio {

	public static void main(String[] args)
	{
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    WebElement excellentRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
    excellentRadioBtn.click();
    System.out.println("Excellent radio button is selected : "+excellentRadioBtn.isDisplayed());
    
    
    
	}

}
