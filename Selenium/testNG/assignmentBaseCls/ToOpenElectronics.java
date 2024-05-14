package assignmentBaseCls;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class ToOpenElectronics extends BaseClass
{
@Test
public void click()
{
	driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	Reporter.log("Electronics Clicked Successfully...!",true);
}
}
