package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.close();
}
}
