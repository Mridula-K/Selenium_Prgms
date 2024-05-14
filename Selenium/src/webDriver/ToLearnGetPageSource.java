package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String source = driver.getPageSource();
	System.out.println(source);
}
}
