package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy (xpath = "//a[@class='ico-account']")
	WebElement myAccountLink;
	
	@FindBy (xpath = "//a[@class='ico-logout']")
	WebElement logoutLink;
	
	public boolean isMyAccountPageExists()
	{
		try {
			return myAccountLink.isDisplayed();
		}catch (Exception e) {
		return false;
		}
	}
	
	public void clickLogout()
	{
		logoutLink.click();	
	}
	
}
