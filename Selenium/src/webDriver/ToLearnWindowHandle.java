

package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWindowHandle
{
      public static void main(String[] args)
      {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://shoppersstack.com/");
		System.out.println(driver.getWindowHandle());//71B2 & B988 are different.Window id is unique everytime when we run the script.
		
		driver.quit();
	  }
}
