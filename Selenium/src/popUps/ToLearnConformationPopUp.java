package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnConformationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("submit")).click();
        Alert confPopUp = driver.switchTo().alert();
        System.out.println(confPopUp.getText());
        confPopUp.accept();
        Thread.sleep(3000);
        confPopUp.accept();
		
		
		
	}

}
