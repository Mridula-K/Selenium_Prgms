package baseClass;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass 
{
@Test
public void click()
{
	driver.findElement(By.partialLinkText("JEWELRY")).click();
	driver.findElement(By.partialLinkText("BOOKS")).click();
	driver.findElement(By.partialLinkText("GIFT CARDS")).click();
	Reporter.log("Clicked on the elements Successfully",true);
	//click on computers and electronics
}
}
