package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addcart;
import pageObjects.HomePage;
import pageObjects.ProductCompare;
import testBase.BaseClass;

public class TC_006_ProductCompare extends BaseClass {
	@Test
	public void test_productcompare() throws InterruptedException, IOException {
		logger.info("Starting TC_006_ProductCompare");

		try {
			driver.get(rb.getString("appURL"));
			HomePage hp = new HomePage(driver);
			logger.info("Homepage Displayed");

			driver.manage().window().maximize();

			ProductCompare pc = new ProductCompare(driver);
			pc.search_txt("iMac");
			Thread.sleep(3000);
			logger.info("Enter any Product");

			pc.searchbtn();
			Thread.sleep(3000);
			logger.info("Prodcut Dispaled on Homepage");

			pc.productcompare();
			Thread.sleep(3000);
			logger.info("Product Compare");

			pc.productcompareicon();
			Thread.sleep(3000);

			pc.addcart();
			logger.info("product added to cart");
			Thread.sleep(2000);//
			
			pc.removeproduct();
			Thread.sleep(2000);
			logger.info("product removed from cart");
			
			pc.continuebutton();
			Thread.sleep(2000);
			logger.info("Continue page for shopping Homepage");
			
			
			
			String confmsg = pc.getConfirmationmsg();

			if (confmsg.equals("Success: You have added iMac to your product comparison!")) {
				logger.info("Comparision page success");
				Assert.assertTrue(true);
			}

			else {
				logger.info("Comparision page Failed");
				captureScreen(driver, "test_productcompare");
				Assert.assertTrue(true);
			}
			

			Addcart ac = new Addcart(driver);
			String confmg = ac.getConfirmationMsg();//

			if (confmg.equals("Success: You have added iMac to your shopping cart!"))

			{
				logger.info("Search page is Success ");
				Assert.assertTrue(true);
			} else {
				logger.error("Add cart  Page Failed ");
				captureScreen(driver, "test_search");
				Assert.assertTrue(true);

			}


			ac.viewcart();
			Thread.sleep(3000);
			logger.info("product added to viewcart");

			ac.view();
			Thread.sleep(3000);
			logger.info("product added to view");

			pc.continushop();
			Thread.sleep(2000);
			logger.info("Continue page success");

			
		
		} 
		catch (Exception e) {
			logger.fatal("Add cart  Failed");
			Assert.fail();

		}
		logger.info("Finished TC_006_ProductCompare");

	
   }
}

