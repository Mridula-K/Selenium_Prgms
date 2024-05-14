package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getSearchTF().sendKeys("Selenium",Keys.ENTER);
		wp.getSearchTF().sendKeys("Mobile",Keys.ENTER);
		
		
		
//		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
////        searchTF.sendKeys("Selenium",Keys.ENTER);
////        Thread.sleep(2000);
////        searchTF.sendKeys("Mobiles",Keys.ENTER);
//		searchTF.sendKeys("Selenium",Keys.ENTER);
//		driver.navigate().refresh();
//		WebElement searchTF1 = driver.findElement(By.id("small-searchterms"));
//        searchTF.sendKeys("Mobiles",Keys.ENTER);

	}

}
