package actionCls;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToLearnScrollByAmount {

	public static void main(String[] args) throws InterruptedException 
	   {
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    
		    driver.get("https://demoapp.skillrary.com/");
		    Actions act=new Actions(driver);
		    act.scrollByAmount(0, 800).perform();
		    Thread.sleep(2000);
		    act.scrollByAmount(0, 200).perform();
		    Thread.sleep(2000);
		    act.scrollByAmount(0, -500).perform();
		    
		    
	   }

}
