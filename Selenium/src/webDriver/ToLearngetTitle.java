package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetTitle
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("WhatsApp Web"))
			System.out.println("User navigated successfully");
		else
			System.out.println("User navigation failed !");
	}
}
