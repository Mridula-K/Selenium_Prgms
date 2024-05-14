package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate 
{
public static void main(String[] args) throws InterruptedException, MalformedURLException
  {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.toppr.com/ask/");
//	driver.navigate().to("https://www.toppr.com/ask/");
	driver.navigate().to(new URL("https://www.toppr.com/ask/"));
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
    driver.navigate().refresh(); 
	Thread.sleep(2000);
	driver.quit();
	
    
  }
}
