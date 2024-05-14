package actionCls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMoveToElementMOUSEHOVER {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     
     driver.get("https://www.myntra.com/home.php");
     WebElement womanText = driver.findElement(By.partialLinkText("WOMEN"));
     Actions act=new Actions(driver);
     act.moveToElement(womanText).perform();
     driver.findElement(By.partialLinkText("Headphones")).click();
     
     
	}

}
