package testCases;

import org.testng.annotations.Test;

import pageObjects.AddressBook;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC_015_AddressBook extends BaseClass{
	
	@Test
	public void test_AddressBook() throws InterruptedException 
	{
		logger.info("Starting TC_015_AddressBook");
		
		driver.get(rb.getString("appURL"));
		
		driver.manage().window().maximize();
		
		HomePage hp = new HomePage(driver);
		logger.info("Home Page Displayed");
		
		
	
		
		
		AddressBook ab = new AddressBook(driver);
		ab.clickMyAccount();
		Thread.sleep(2000);
		ab.clickLogin();
		Thread.sleep(2000);
		
		ab.setemail("xyzabc123456@gmail.com");
		Thread.sleep(2000);
		
		ab.setpassword("abc123");
		Thread.sleep(2000);
		
		ab.clicklogin();
		Thread.sleep(2000);
		
		ab.addressbook();
		Thread.sleep(2000);
		
		ab.clicknewAddress();
		
		ab.txtfname("kiran kumar");
		ab.txtlname("chikuri");
		ab.txtaddress1("wipro");
		ab.txtaddress1("2-2,choutuppal");
		ab.txtaddress2("Hyderabad");
		
		ab.txtcity("Hyderabad2");
		ab.pincode("500070");
		Thread.sleep(2000); 
		
		ab.select_conlist();
		Thread.sleep(2000);
		
		ab.select_statelist();
		Thread.sleep(2000);
		
		ab.clickcontinue();
		Thread.sleep(2000);

		
	}

}
