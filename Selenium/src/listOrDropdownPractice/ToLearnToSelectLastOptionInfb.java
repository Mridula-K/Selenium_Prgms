package listOrDropdownPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnToSelectLastOptionInfb {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    
    driver.get("https://www.facebook.com/signup");
    
    WebElement dayDropdown = driver.findElement(By.id("day"));
    Select daySelect=new Select(dayDropdown);
    daySelect.selectByIndex(16);
    daySelect.selectByIndex(daySelect.getOptions().size()-1);
	
    
    WebElement monthDropdown = driver.findElement(By.id("month"));
    Select monthSelect=new Select(monthDropdown);
    monthSelect.selectByValue("2");
    int monthSize = monthSelect.getOptions().size();
	monthSelect.selectByIndex(monthSize-1);
    
    WebElement yearDropdown = driver.findElement(By.id("year"));
    Select yearSelect=new Select(yearDropdown);
    yearSelect.selectByVisibleText("2003");
    int yearSize = yearSelect.getOptions().size();
	yearSelect.selectByIndex(yearSize-1);
	
    System.out.println(yearSelect.isMultiple());
    
    
    
    
    
    
    
	}

}
