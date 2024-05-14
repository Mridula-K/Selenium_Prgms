package iframepractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    WebElement JsPrompt = driver.findElement(By.id("iframeResult"));
    driver.switchTo().frame(JsPrompt);
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
    
    
    
    
    
	}

}
 