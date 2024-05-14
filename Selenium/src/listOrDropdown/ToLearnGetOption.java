package listOrDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
     driver.get("https://demoapp.skillrary.com/");
     WebElement courseCost = driver.findElement(By.id("cars"));
     Select selectCourse=new Select(courseCost);
     selectCourse.selectByIndex(0);
     selectCourse.selectByIndex(1);
     selectCourse.selectByIndex(2);
     
     List<WebElement> allOptions = selectCourse.getOptions();
     System.out.println(allOptions.size());
     
     for(WebElement y:allOptions)
     {
    	 System.out.println(y.getText());
     }
     
     

	}

}
