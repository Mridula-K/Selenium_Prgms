package xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspParcticeXpathByAxes {

	public static void main(String[] args) throws InterruptedException {
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
   Thread.sleep(5000);
   String price = driver.findElement(By.xpath("//th[text()='Samsung Galaxy']/following-sibling::td[4]")).getText();
   System.out.println("The price of samsung galaxy is "+price);
   
   
	}

}
