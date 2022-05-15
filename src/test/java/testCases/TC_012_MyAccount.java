package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccount;
import testBase.BaseClass;

@Test
public class TC_012_MyAccount extends BaseClass {
	

	public void test_MyAccount() throws InterruptedException
	{
		logger.info("Starting TC_012_MyAccount");
		
		driver.get(rb.getString("appURL"));
		HomePage hp = new HomePage(driver);
		logger.info("Home page displayed");
		
		driver.manage().window().maximize();
		
		MyAccount ma = new MyAccount(driver);
		ma.Myaccnt();
		Thread.sleep(1000);
		
		ma.loginlnk();
		Thread.sleep(1000);
		
		    ma.email("xyzabc123456@gmail.com");
		    Thread.sleep(2000);
		    ma.passwrd("abc123");
		    Thread.sleep(1000);
		    ma.clickloginbtn();
		    Thread.sleep(1000);
		    
		
		/*ma.edit_acc_info_lnk();
		Thread.sleep(1000);
		    ma.edit_fname("abc");
		    Thread.sleep(1000);
		    ma.edit_lname("xyz");
		    Thread.sleep(1000);
		    ma.edit_email("xyzabc123456@gmail.com");
		    Thread.sleep(1000);
		    ma.edit_tel("1234567890");
		    Thread.sleep(1000);
		 
		 ma.clickcontinue();
		 Thread.sleep(1000);*/
		 
		/* ma.change_pwd_link();
		 Thread.sleep(1000);
	
		   ma.passwordchange("abcxyz");
		   Thread.sleep(1000);
		   ma.passwordchangeconf("abcxyz");
		   Thread.sleep(1000);
		   
		   ma.clickcontinue();
		   Thread.sleep(1000);*/
		   
		  boolean tar = ma.select_subscribe();
		  if(tar==true)
		  {
			  logger.info("Value selected");
			  Assert.assertTrue(true);
		  }
		  
		  ma.selct_radio();
		  Thread.sleep(3000);
		  
		  ma.clickcontinue();
			 Thread.sleep(3000);
			 
			 ma.contactlnk();
			 Thread.sleep(3000);
			 
			 ma.currencylnk();
			 Thread.sleep(2000);
			 
			 ma.selectCurrency();
			 Thread.sleep(2000);
		
		
		logger.info("Finish TC_012_MyAccount");
		
		
	}

}
