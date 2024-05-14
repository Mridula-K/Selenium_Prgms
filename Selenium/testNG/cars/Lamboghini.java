package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamboghini {
	@Test(groups = "smoke")
	public void launchLamboghini()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://lamboghini.com/");
	Reporter.log("Lamboghini Launched Successfully",true);
	}
}
