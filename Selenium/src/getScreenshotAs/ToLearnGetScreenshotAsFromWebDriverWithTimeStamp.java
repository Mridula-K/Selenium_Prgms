package getScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnGetScreenshotAsFromWebDriverWithTimeStamp {
    
	public static void main(String[] args) throws IOException {
		LocalDateTime sysTime = LocalDateTime.now();
		String actTime = sysTime.toString().replace(":", ",");//sir used - instead of ,
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/");
     TakesScreenshot scrnsht=(TakesScreenshot)driver;
     File temp = scrnsht.getScreenshotAs(OutputType.FILE);
     File dest=new File("./Screenshots/imgwithtime-"+actTime+".png");
     FileHandler.copy(temp, dest);
     
   
     
     
	}

}
