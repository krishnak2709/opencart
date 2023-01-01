package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LogginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email,String password,String exp)
	{
		
		logger.info("****starting TC_003_login DDT");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(email);
		lp.enterPassword(password);
		lp.clickLogin();
		
		MyAccountPage ma=new MyAccountPage(driver);
		boolean targetPage=ma.isMyAccountPageExists();
		
		if(exp.equals("valid"))
				{
					if(targetPage==true)
					{
						ma.clickLogout();
						Assert.assertTrue(true);
					}
				}
		if(exp.equals("invalid"))
		{
			if(targetPage==true)
			{
				ma.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);

			}
		}
				
		
	}catch(Exception e)
		{
		Assert.fail();
		}
	}
}
