package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy (id="Email")
	WebElement txtEmail;
	
	@FindBy (id="Password")
	WebElement txtPassword;
	
	@FindBy (xpath="//button[normalize-space()='Log in']")
	WebElement clickLogin;
	
	public void enterEmail(String email)
	{
		txtEmail.sendKeys(email);	
		
	}
	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);	
		
	}
	
	public void clickLogin()
	{
		clickLogin.click();
	}
	
	
	
}
