package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAlertPopUp {
    public static void main(String[] args) throws InterruptedException
    {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	Alert alertPopUp=driver.switchTo().alert();
	System.out.println(alertPopUp.getText());
//	alertPopUp.accept();
	alertPopUp.dismiss();
	driver.findElement(By.linkText("Log in")).click();
	
    }
}
