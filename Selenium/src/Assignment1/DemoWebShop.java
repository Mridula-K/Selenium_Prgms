package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println(driver.getPageSource());
	driver.quit();
}
}
