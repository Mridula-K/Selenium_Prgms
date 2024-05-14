package javaSrciptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToBottomAndRefreshTheWebPage
{

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
			
			driver.get("https://peter.sh/experiments/chromium-command-line-switches/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			js.executeScript("history.go()");
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
