package listOrDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnIsMultiple {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     
	     driver.get("https://demoapp.skillrary.com/");
	     WebElement cost = driver.findElement(By.id("cars"));
	     Select selectCost=new Select(cost);
	     System.out.println(selectCost.isMultiple());
	     
	}

}
