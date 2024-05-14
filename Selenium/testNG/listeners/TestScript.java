package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//@Listeners(ListenerImplementationClass.class)
public class TestScript 
{
@Test
public void login()
{
	Reporter.log("Open the browser",true);
	Reporter.log("Navigate through URL",true);
	Reporter.log("Enter Valid Credentials",true);
	Reporter.log("Click on Login Button",true);
	Assert.assertEquals(false, true,"Home page not displayed");
}
}
