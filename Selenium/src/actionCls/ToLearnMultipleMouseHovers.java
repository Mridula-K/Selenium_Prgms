package actionCls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMultipleMouseHovers {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    
    driver.get("https://demowebshop.tricentis.com/");
    WebElement pc = driver.findElement(By.partialLinkText("COMPUTERS"));
    Actions act=new Actions(driver);
    act.moveToElement(pc).perform();
    WebElement desktop = driver.findElement(By.partialLinkText("Desktops"));
    act.moveToElement(desktop).perform();
    act.click(desktop).perform();
    
    
	}

}
