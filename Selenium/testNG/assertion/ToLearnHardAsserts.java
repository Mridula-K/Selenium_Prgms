package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAsserts 
{
@Test
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login Page is Not Displayed");
	
	
	driver.findElement(By.id("Email")).sendKeys("saibaba7166@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Sb23@1947");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	String title = driver.getTitle();
	
	Assert.assertEquals(title, "Demo Web Shop","Home page is not displayed");//instead of demo web shop if we give as demo web ,then the script will fail
	Reporter.log("Home page is displayed",true);
	
}
}
