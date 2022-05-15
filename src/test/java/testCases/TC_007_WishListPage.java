package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishList;
import testBase.BaseClass;

public class TC_007_WishListPage extends BaseClass {

	@Test
	public void test_wishList() throws InterruptedException {
		try {
			logger.info("Started  TC_007_WishListPage");

			driver.get(rb.getString("appURL"));
			HomePage hp = new HomePage(driver);
			logger.info("HomePage Dispalyed");

			driver.manage().window().maximize();

			WishList wl = new WishList(driver);

			wl.search_txt("iMac");
			Thread.sleep(1000);
			logger.info("Enter any Prodcut");

			wl.search_button();
			Thread.sleep(1000);

			wl.wlist_button();
			Thread.sleep(1000);

			wl.wlist_icon();
			Thread.sleep(1000);

			LoginPage lp = new LoginPage(driver);

			lp.setEmail(rb.getString("email"));
			logger.info("Provided Email ");

			lp.setPassword(rb.getString("password"));
			logger.info("Provided Password ");

			lp.clickLogin();
			logger.info("Clicked on Login");

			wl.Addtocart();
			Thread.sleep(2000);

			wl.removelnk();
			Thread.sleep(3000);

			wl.continueclick();
			Thread.sleep(2000);

			boolean tarpage = wl.isPageExists();

			if (tarpage) {
				logger.info("WishList Failed ");
				Assert.assertTrue(false);
			}

			else {
				logger.error("Search Success ");
				captureScreen(driver, "test_search"); // Capturing screenshot
				Assert.assertTrue(true);
			}

			String target = wl.getMessageconformation();
			if (target.equals("Success: You have modified your wish list!")) {
				logger.info("Product Removed  Successfully ");
				Assert.assertTrue(true);

			} else {
				logger.error("Product remove failed");
				captureScreen(driver, " test_wishList");
				Assert.assertTrue(true);
			}

		} catch (Exception e) {
			logger.fatal("WishList Failed ");
			Assert.fail();
		}

		logger.info(" Finished TC_007_WishList");

	}

}
