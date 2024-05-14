package webElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginButton {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/");
    boolean loginBtnStatus = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
    System.out.println("Is login button enabled ! :"+loginBtnStatus);
    
    
    
    
	}

}
