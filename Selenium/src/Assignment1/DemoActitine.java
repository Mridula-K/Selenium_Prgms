package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitine {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.actitime.com/");
	System.out.println(driver.getWindowHandle());

}
}
