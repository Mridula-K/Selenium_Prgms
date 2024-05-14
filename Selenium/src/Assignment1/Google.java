package Assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().setPosition(new Point(-9,-9));
	System.out.println(driver.manage().window().getSize());
}
}
