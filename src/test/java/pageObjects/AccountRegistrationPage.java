package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	
	{
		super(driver);
		
	}
	
	@FindBy (id="gender-male")
	WebElement txtGender;

	@FindBy (name="FirstName")
	WebElement txtFirstname;
	
	@FindBy (name="LastName")
	WebElement txtLastname;
	
	@FindBy (name="Email")
	WebElement txtEmail;
	
	@FindBy (id="Password")
	WebElement txtPassword;
	
	@FindBy (name="ConfirmPassword")
	WebElement txtCrmPassword;
	
	@FindBy (name="register-button")
	WebElement submit;
	
	@FindBy (xpath="//div[@class='result']")
	WebElement successMsg;
	
	
	public void clickGender()
	{
		txtGender.click();
	}
	
	public void sendFirstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void sendLastname(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void sendEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void sendPassword(String password)
	{
		txtPassword.sendKeys(password);
	
		}
	
	public void sendconfirmPassword(String password)
	{
		txtCrmPassword.sendKeys(password);
		
	}
	public void clickSubmit()
	{
		submit.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (successMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}
