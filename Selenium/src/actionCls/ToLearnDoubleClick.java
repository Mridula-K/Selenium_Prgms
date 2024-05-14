package actionCls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDoubleClick
{
    public static void main(String[] args) throws InterruptedException
    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		Actions act=new Actions(driver);
		WebElement addIcon = driver.findElement(By.id("add"));
		act.doubleClick(addIcon).perform();
		Thread.sleep(2000);
		act.doubleClick(addIcon).perform();
		
		
		
		
		
		
	}
}
