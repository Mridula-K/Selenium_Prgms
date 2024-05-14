package Assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	System.out.println(driver.manage().window().getPosition());
	driver.manage().window().setPosition(new Point(500,300));
}
}
