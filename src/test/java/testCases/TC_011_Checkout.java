package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.HomePage;
import testBase.BaseClass;

@Test
public class TC_011_Checkout extends BaseClass{
	
	public void test_Checkout() throws InterruptedException
	{
		try
		{
		logger.info("Starting TC_011_Checkout");
		
		driver.get(rb.getString("appURL"));
		HomePage hp = new HomePage(driver);
		logger.info("Homepage Displayed");
		
		driver.manage().window().maximize();
		
		Checkout co = new Checkout(driver);
		
		co.Desktopmenu();
		Thread.sleep(4000);
		
		
		co.sliderimg1();
		Thread.sleep(3000);
		
		co.sliderimg2();
		Thread.sleep(3000);
		
		/*co.slideright();
		Thread.sleep(3000);
		
		co.slideleft();
		Thread.sleep(3000);*/
		
		
		co.searchtext("iMac");
		Thread.sleep(2000);
		logger.info("Enter any Product");
		
		co.searchbtn();
		Thread.sleep(2000);
		
		co.addcart();
		Thread.sleep(2000);
		logger.info("Product added to cart");
		
		co.viewcart();
		Thread.sleep(2000);
		
		co.shoppingcart();
		Thread.sleep(2000);
		
	
		co.quantity("3");
		Thread.sleep(2000);
		
		co.quantityrefresh();
		Thread.sleep(2000);
		
		//co.quantityremove();
		//Thread.sleep(2000);
		
		co.checkout();
		Thread.sleep(2000);
		
		boolean target = co.isPageExists();
				if(target)
					{
					logger.info("Checout Failed");
					Assert.assertTrue(true);
					}
				else
					{
					logger.error("Checkout Success");
					captureScreen(driver, "test_Checkout");
					Assert.assertTrue(true);
					}
				;
	}
		catch(Exception e)
		{
			logger.fatal("Checkout failed");
			Assert.fail();
		}
	}

}
