package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {

	public static void main(String[] args) 
	{
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://web.whatsapp.com/");
     String url = driver.getCurrentUrl();
     System.out.println(url);
   
	}
}
