package listenersPractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;



@Listeners(ListenerImplementClass.class)
public class TestScript extends BaseClass
{
@Test
public void login()
{
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("adm");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	Assert.assertEquals(driver.getTitle(), "Dashboard","HomePage not displayed");
	Reporter.log("HomePage is displayed");
	
	
}
}
