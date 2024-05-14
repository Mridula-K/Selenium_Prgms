package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://shoppersstack.com/");
    
    Point position = driver.manage().window().getPosition();
    System.out.println(position.getX());
    System.out.println(position.getY());
    Thread.sleep(2000);
   driver.manage().window().setPosition(new Point(0, 0));
   Thread.sleep(2000);
	driver.close();
	}

}
