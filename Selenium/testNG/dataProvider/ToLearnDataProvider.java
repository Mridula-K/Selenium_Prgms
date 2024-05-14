package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
@DataProvider
public String[][] dataSender()
{
	String[][] data= {
			{"admin","admin"},
			{"user","user"},
			//{"saibaba7166@gmail.com","Sb23@1947"}
	};
	return data;
}
	
	
	
@Test(dataProvider = "dataSender")
public void login(String[] cred)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.id("email")).sendKeys(cred[0]);
	driver.findElement(By.id("password")).sendKeys(cred[1]);
	Reporter.log(cred[0]);
	Reporter.log(cred[1]);
	
	
}
}
