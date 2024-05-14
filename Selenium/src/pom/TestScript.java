package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    
    
    driver.get("https://demowebshop.tricentis.com/");
    WelcomePage wp=new WelcomePage(driver);
    wp.getLoginLink().click();
    wp.getRegisterLink().click();
    
    wp.getLoginLink().click();
    LoginPage lp=new LoginPage(driver);
    lp.getEmailTF().sendKeys("saibaba7166@gmail.com");
    lp.getPwdTF().sendKeys("Sb23@1947");
    lp.getLoginBtn().click();
    
	}

}
