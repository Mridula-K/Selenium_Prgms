package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnInvocationCount {
//	@Test(priority = 0,invocationCount = 2)
	@Test(invocationCount = 0)
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=register");
		Reporter.log("Register testcase executed",true);
	}
	@Test(priority = 1,invocationCount = 2)
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Reporter.log("login testcase executed",true);
	}
}
