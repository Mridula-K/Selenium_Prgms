package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTF;
	
	@FindBy(name = "Password")
	private WebElement pwdTF;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPwdTF() {
		return pwdTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}	
	
	
}
