package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContainsAttribute {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/");
     driver.findElement(By.xpath("//input[contains(@class,'search-box-button')]")).click();
     Thread.sleep(2000);
     driver.quit();
	}

}
