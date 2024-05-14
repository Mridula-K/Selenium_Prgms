package listOrDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetAllSelectedOptions {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	     driver.get("https://demoapp.skillrary.com/");
	     WebElement cost = driver.findElement(By.id("cars"));
	     Select costSelect=new Select(cost);
	     costSelect.selectByIndex(0);
	     costSelect.selectByValue("199");
	     costSelect.selectByVisibleText("INR 50 - INR 99 ( 1 )");
	     
	     List<WebElement> allSelectedCost = costSelect.getAllSelectedOptions();
	     System.out.println(allSelectedCost.size());
	     
	     for(WebElement x:allSelectedCost)
	     {
	    	 System.out.println(x.getText());
	     }
	     
	     
	     
	     
	     
	}

}
