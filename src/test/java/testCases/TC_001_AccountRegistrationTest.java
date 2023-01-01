package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"Regression","Master"})
	public void accountRegistration()
	{
		logger.debug("Application logs......");
		logger.info("starting account accountRegistration");
		try
		{
			
		
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		hp.clickRegister();
		logger.info("clicked on register link");

		AccountRegistrationPage reg=new AccountRegistrationPage(driver);
		
		logger.info("providing user data");

		reg.clickGender();
		reg.sendFirstname("test232");
		reg.sendLastname("kiujl");
		reg.sendEmail(randomeString()+"@qwe.com");

		reg.sendPassword("test1234");
		reg.sendconfirmPassword("test1234");

		reg.clickSubmit();
		logger.info("clicked on submit");

		String msg=reg.getConfirmationMsg();
		logger.info("validating confim message");

		Assert.assertEquals(msg, "Your registration completed","Test Failed");
		}
		catch(Exception e)
		{
			logger.error("test failed guys");
			Assert.fail();
		}
		logger.info("Finsihed acct reg test");
	}

}
