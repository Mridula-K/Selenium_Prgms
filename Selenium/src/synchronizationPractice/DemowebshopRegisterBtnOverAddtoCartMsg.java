package synchronizationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemowebshopRegisterBtnOverAddtoCartMsg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'14.1-inch Laptop')]/../..//input[@value='Add to cart']")).click();
		WebElement addtocartMsg = driver.findElement(By.xpath("//p[contains(text(),'The product')]"));
//		String print = addtocartMsg.getText();
		System.out.println(addtocartMsg.getText());
		WebElement registerBtn = driver.findElement(By.linkText("Register"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOf(addtocartMsg));
		registerBtn.click();
		
		
		
		
		
		
		
	}

}
