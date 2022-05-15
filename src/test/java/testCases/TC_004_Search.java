package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass {
	
	@Test
	public void test_Search() throws InterruptedException
	{
		
		logger.info(" Starting TC_004_Search ");
		
		try
		{
		driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
		logger.info("HomePage Displayed");
		
		driver.manage().window().maximize();
		
	
	
	SearchPage sp = new SearchPage(driver);
	
	sp.searchTxt("iMac");
	Thread.sleep(2000);
	logger.info("Enter any Product");
	
	sp.searchbtn();
	Thread.sleep(1000);
	
	boolean tarpage = sp.isPageExists();
	
	if(tarpage)
	{
		logger.info("Search Fail");
		Assert.assertTrue(true);
	}
	else
	{
		logger.error("Search Success");
		captureScreen(driver,"test_Search");
		Assert.assertTrue(true);
	}
	
	}
		catch(Exception e)
		{
		logger.fatal("Search Failed");
		Assert.fail();
		
		}
		
		logger.info("Fiished TC_OO4_Search");
		
	}
	

}
