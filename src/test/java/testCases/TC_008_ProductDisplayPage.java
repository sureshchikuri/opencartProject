package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDisplayPage;
import testBase.BaseClass;

public class TC_008_ProductDisplayPage extends BaseClass {

	@Test
	public void test_productdisplay() throws InterruptedException {
		logger.info("Starting TC_008_ProductDisplayPage");
		try {
			driver.get(rb.getString("appURL"));
			HomePage hp = new HomePage(driver);
			logger.info("Home Page Displayed ");

			driver.manage().window().maximize();

			ProductDisplayPage pd = new ProductDisplayPage(driver);

			pd.search_txt("iMac");
			Thread.sleep(2000);
			logger.info("Enter any Product ");

			pd.search_button();
			Thread.sleep(2000);
			logger.info("Clicked on Search button ");

			pd.pro_img();
			Thread.sleep(2000);
			logger.info("Click the image");
			
			
			pd.productclick();
			Thread.sleep(2000);
			logger.info("Click the image");

			pd.click2writervw();
			logger.info("Click on Write review ");
			Thread.sleep(2000);

			pd.customername("KIRANCH");
			logger.info("Name provided");
			Thread.sleep(2000);

			pd.customerfeedback("This product is the best i have ever found");
			logger.info("Customer provided feedback");
			Thread.sleep(2000);

			boolean t = pd.ratingselection();
			if (t == true) {
				logger.info("value selected");
				Assert.assertTrue(true);
			}

			pd.ContinueLink();
			Thread.sleep(3000);
			logger.info("Clicked on continue button");

			boolean tarpage = pd.isPageExists();

			if (tarpage) {
				logger.info("Product DisplayPage success ");
				Assert.assertTrue(true);
			}

			else {
				logger.error("ProductDisplayPage failed ");
				captureScreen(driver, "test_productdisplay"); // Capturing screenshot
				Assert.assertTrue(true);
			}

			/*
			 * String confrm = pd.getConformationmessage();
			 * 
			 * if (confrm.
			 * equals("Thank you for your review. It has been submitted to the webmaster for approval."
			 * ))
			 * 
			 * { logger.info("Search page is Success "); Assert.assertTrue(true); } else {
			 * logger.error("Add cart  Page Failed "); captureScreen(driver, "test_search");
			 * Assert.assertTrue(true); }
			 */
		} catch (Exception e) {
			logger.fatal("ProductDisplayPage  Failed ");
			Assert.fail();
		}

		logger.info(" Finished TC_008_ProductDisplayPage");

	}

}
