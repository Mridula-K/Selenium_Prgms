package iframepractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetstoreEx {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     driver.get("https://petdiseasealerts.org/forecast-map/#/");
      WebElement map = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
     driver.switchTo().frame(map);
     driver.findElement(By.name("North Dakota")).click();
     driver.switchTo().parentFrame();
     driver.findElement(By.partialLinkText("SIGN UP")).click();
    

	
	}

}
