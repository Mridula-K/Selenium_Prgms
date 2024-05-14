package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert
{
@Test
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(driver.getTitle(),"Demo Web Shop","Login Page is not displayed");
	Reporter.log("Login page is displayed",true);
	
	driver.findElement(By.id("Email")).sendKeys("saibaba7166@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Sb23@1947");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	soft.assertEquals(driver.getTitle(), "Demo Web Shop","Home Page not Displayed");
	Reporter.log("Home page is displayed",true);
	
	
	
	
	
    soft.assertAll();
	
	
}
}
