package actionCls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClick {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     
     driver.get("https://demowebshop.tricentis.com/");
     Actions act=new Actions(driver);
//     act.contextClick().perform();
     WebElement registerBtn = driver.findElement(By.linkText("Register"));
//	 act.contextClick(registerBtn).perform();
	 act.click(registerBtn).perform();
	 WebElement Fn = driver.findElement(By.id("FirstName"));
	 act.sendKeys(Fn, "Mridula").perform();
	
	}

}
