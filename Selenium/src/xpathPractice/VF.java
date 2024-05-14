package xpathPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VF {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("saibaba7166@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'full')]")).sendKeys("Sai Baba");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SaiBaba7156258");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("OmSai@23");
		Thread.sleep(5000);
		
		WebElement signupBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(signupBtn));
		signupBtn.click();

		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month:']"));
		Select monthSelect=new Select(month);
		monthSelect.selectByVisibleText("September");
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day:']"));
		Select daySelect=new Select(day);
		daySelect.selectByValue("23");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year:']"));
		Select yearSelect=new Select(year);
		yearSelect.selectByValue("1920");
		
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		
		
		
	}
}
