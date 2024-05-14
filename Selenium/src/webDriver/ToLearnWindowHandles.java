package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://shoppersstack.com/products_page/5");
		Thread.sleep(35000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		for (String id : allWindowId) {
			System.out.println(id);
		}
		driver.quit();
	}

}
