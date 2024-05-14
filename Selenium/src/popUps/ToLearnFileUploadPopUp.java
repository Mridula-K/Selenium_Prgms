package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("‪E:\\pnr.pdf");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\SQL\\MRIDULA SQL RESUME.docx");
	}
}