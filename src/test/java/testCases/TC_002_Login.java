package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

@Test(groups={"sanity","master"})
public class TC_002_Login extends BaseClass 
{
	public void test_Login()
	{
	logger.info(" Starting TC_002_Login");
	
	try {
		driver.get(rb.getString("appURL"));
		logger.info("Home Page is Displayed");
		
		driver.manage().window().maximize();
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	}
	

}
