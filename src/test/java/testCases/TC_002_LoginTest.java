package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	
	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		try
		{
		logger.info("Starting TC_002_LoginTest");
		
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(rb.getString("email"));
		lp.enterPassword(rb.getString("password"));
		lp.clickLogin();
		logger.info("Clicked on Login button");
		
		MyAccountPage ma=new MyAccountPage(driver);
		boolean targetPage=ma.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true,"Invlaid login data..");
		}catch (Exception e) {
			Assert.fail();
		}
		
	}
}
