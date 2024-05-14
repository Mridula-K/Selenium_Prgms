package actionCls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold
{

	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     
     driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
     WebElement pwd = driver.findElement(By.id("password"));
     Actions act=new Actions(driver);
     act.sendKeys(pwd, "OmSai@23").perform();
     WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
     act.clickAndHold(eyeIcon).perform();
	}

}
