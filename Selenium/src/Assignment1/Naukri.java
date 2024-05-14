package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) 
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.naukri.com/");
	}

}
