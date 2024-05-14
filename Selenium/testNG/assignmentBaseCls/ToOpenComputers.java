package assignmentBaseCls;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class ToOpenComputers extends BaseClass
{
@Test
public void open()
{
 driver.findElement(By.partialLinkText("COMPUTERS")).click();
 Reporter.log("Computers is successfully Opened",true);
}
}
