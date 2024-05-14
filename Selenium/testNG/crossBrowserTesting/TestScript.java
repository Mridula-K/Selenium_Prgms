package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript
{
	public WebDriver driver;
	@Parameters("Browser")
@Test
public void launch(@Optional("edge")String browserName)//optional we r using becoz if we didnt give any browser name,we r asking test ng to execute it in a particular browser
{
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
		Reporter.log("Chrome opened successfully",true);
	}
	else if(browserName.equals("edge"))
	{
		driver=new EdgeDriver();
		Reporter.log("Edge opened successfully",true);
	}
	driver.get("https://demowebshop.tricentis.com/");
}
}
