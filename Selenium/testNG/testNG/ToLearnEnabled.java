package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnEnabled {
@Test(invocationCount = 3)
public void register()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	Reporter.log("Register test case executed");
}
@Test(priority = 1,enabled = false)
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	Reporter.log("login test case executed");
}
}

