package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	
//intialization	
public WelcomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//declaration
@FindBy(linkText = "Register")
private WebElement registerLink;

@FindBy(linkText = "Log in")
private WebElement loginLink;

@FindBy(id="small-searchterms")
private WebElement searchTF;

public WebElement getSearchTF() {
	return searchTF;
}


public WebElement getRegisterLink() {
	return registerLink;
}


public WebElement getLoginLink() {
	return loginLink;
}



}
