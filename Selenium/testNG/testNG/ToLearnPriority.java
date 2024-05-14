package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnPriority 
{
@Test(priority = 0)
public void register()
{
	Reporter.log("Register testcase executed",true);
}
@Test(priority = 1)
public void login()
{
	Reporter.log("login testcase executed",true);
}
}
