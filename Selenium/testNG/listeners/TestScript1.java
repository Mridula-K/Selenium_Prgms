package listeners;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
//@Listeners(ListenerImplementationClass1.class)
public class TestScript1 extends BaseClass
{
 @Test
 public void login()
 {
	 driver.findElement(By.linkText("Log in")).click();
	 Reporter.log("Entered Valid Credentials",true);
	 driver.findElement(By.id("Email")).sendKeys("saibab7166@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("Sb23@194");
	 Reporter.log("Click on login Button",true);
	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home Page not displayed");
	 
 }
	
	
}
