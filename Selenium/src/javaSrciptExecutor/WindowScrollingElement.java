package javaSrciptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrollingElement
{
  public static void main(String[] args)
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://www.naukri.com/registration/createAccount?");
//	WebElement whatsapp = driver.findElement(By.xpath("//span[text()='WhatsApp']"));
	WebElement emailTF = driver.findElement(By.id("email"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeAsyncScript("arguments[0].scrollIntoView(true)", whatsapp);
	js.executeScript("arguments[0].scrollIntoView(true)", emailTF);
  }
  
}
