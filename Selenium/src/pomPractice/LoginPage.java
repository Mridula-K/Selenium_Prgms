package pomPractice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       public LoginPage(WebDriver driver)
       {
    	   PageFactory.initElements(driver, this);
       }
	
		@FindBy(id = "email")
		private WebElement emailTF;
		
		@FindBy(id = "password")
		private WebElement pwdTF;
		
		@FindBy(id = "last")
		private WebElement loginBtn;
		

		public WebElement getLoginBtn() {
			return loginBtn;
		}

		public WebElement getEmailTF() {
			return emailTF;
		}

		public WebElement getPwdTF() {
			return pwdTF;
		}
		
		
		
		

	

}
