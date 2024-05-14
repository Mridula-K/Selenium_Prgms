package getScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class InstaWebElement {
		public static void main(String[] args) throws IOException {
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		     
		     driver.get("https://www.instagram.com/");
		     TakesScreenshot scrnsht=(TakesScreenshot)driver;
		     File temp = scrnsht.getScreenshotAs(OutputType.FILE);
		     File dest=new File("./Screenshots/insta_webpage.png");
		     FileHandler.copy(temp, dest);
		     
		     File temp1 = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getScreenshotAs(OutputType.FILE);     
		     File dest1= new File("./Screenshots/Instagram_imgOfWebElement.png");
		     FileHandler.copy(temp1, dest1);
	}

}
