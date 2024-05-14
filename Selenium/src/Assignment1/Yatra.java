package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}
}
