package testCases;

import org.testng.annotations.Test;

import pageObjects.ForgetPassword;
import pageObjects.HomePage;
import testBase.BaseClass;

@Test
public class TC_009_ForgetPassword  extends BaseClass{
	
	public void test_ForgetPassword  () throws InterruptedException
	{
		logger.info("Starting TC_009_ForgetPassword");
		driver.get(rb.getString("appURL"));
		//HomePage hp = new HomePage(driver);
		//hp.clickMyAccount();
		//hp.clickLogin();
		
		driver.manage().window().maximize();
		
		ForgetPassword fp = new ForgetPassword(driver);
		
		fp.myaccount();
		Thread.sleep(2000);
		
		fp.login();
		Thread.sleep(2000);
		logger.info("Clicked on Login");
		
		fp.setEmail("xyzabc123456@gmail.com");
		logger.info("Provided  email");
		Thread.sleep(2000);
		
		
		fp.forgetpassword();
		Thread.sleep(2000);
		
		fp.forgtemail("xyzabc123456@gmail.com");
		Thread.sleep(2000);
		logger.info("Provided  email");
		
		
		fp.continuebtn();
		Thread.sleep(2000);
		logger.info("Clicked on Continue");
		
		
		
	}

}
