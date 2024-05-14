package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnNotificationPopUp
{

	public static void main(String[] args)
	{
     ChromeOptions setting=new ChromeOptions();
//     setting.addArguments("--disable-notifications");
     setting.addArguments("--incognito");
     WebDriver driver=new ChromeDriver(setting);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     
     driver.get("https://www.redbus.in/");
	}

}
