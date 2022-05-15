package testCases;

import org.testng.annotations.Test;

import pageObjects.ChangePassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_014_ChangePassword extends BaseClass {
	
	@Test
	public void test_changePassword() throws InterruptedException {
    logger.info("Strting Tc_014_ChangePassword");
    
    driver.get(rb.getString("appURL"));
    
    logger.info("Home Page Dispalyed");
    
    driver.manage().window().maximize();
    
    HomePage hp = new HomePage(driver);
    hp.clickMyAccount();
    logger.info("Clicked on MyAccount");
    hp.clickLogin();
    logger.info("Clicked on Login");
    
    
    LoginPage lp = new LoginPage(driver);
    lp.setEmail("xyzabc123456@gmail.com");
    lp.setPassword("abc123");
    lp.clickLogin();
    Thread.sleep(2000);
    
    ChangePassword cp = new ChangePassword(driver);
    cp.changepasswordlnk();
    
  //  cp.newpwd("abc@kiran");
  //  cp.confpwd("abc@kiran");
    
  //  cp.back_homepage();
    Thread.sleep(2000);
    logger.info("Home page Displayed");
	
    
    cp.clickcontinue();
    Thread.sleep(2000);
    
    
	}

}
