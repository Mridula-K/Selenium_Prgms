package webElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryImg {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.skillrary.com/");
    boolean img = driver.findElement(By.xpath("//img[@alt='SkillRary']")).isDisplayed();
    System.out.println("Is image displayed ! : "+img);
    
    
	}

}
