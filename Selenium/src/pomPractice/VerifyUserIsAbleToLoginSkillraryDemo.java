package pomPractice;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUserIsAbleToLoginSkillraryDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		FileInputStream fis=new FileInputStream("./TestData/SkillraryTestData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
//		System.out.println(email);
//		System.out.println(pwd);
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTF().sendKeys(email);
		lp.getPwdTF().sendKeys(pwd);
		lp.getLoginBtn().click();
		
		
	}

}
