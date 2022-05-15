package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {

	WebDriver driver;

	public ProductDisplayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "search")
	WebElement searchtxt;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement searchbtn;

	@FindBy(xpath = "//img[@title='iMac']")
	WebElement img;

	@FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'iMac')]")
	WebElement product;

	@FindBy(xpath = "//a[normalize-space()='Write a review']")
	WebElement writereview;

	@FindBy(xpath = "//input[@id='input-name']")
	WebElement rvwcutomername;

	@FindBy(xpath = "//textarea[@id='input-review']")
	WebElement rvwfeedback;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement conti;

	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	WebElement rating1bad;

	@FindBy(xpath = "//input[@value='2']")
	WebElement rating2avrg;

	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	WebElement rating3btr;

	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	WebElement rating4best;

	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	WebElement rating5good;

	@FindBy(xpath = "//button[@id='button-review']")
	WebElement contiuebtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement msgco;

	public void search_txt(String text) {
		searchtxt.sendKeys(text);
	}

	public void search_button() {
		searchbtn.click();
	}

	public void pro_img() {
		img.click();
	}

	public void productclick() {
		product.click();
	}
	public void click2writervw() {
		writereview.click();
	}

	
	public void customername(String txt) {
		rvwcutomername.sendKeys(txt);
	}

	public void customerfeedback(String txt) {
		rvwfeedback.sendKeys(txt);
	}

	public void ContinueLink() {
		contiuebtn.click();
	}

	public String getConformationmessage() {
		try {
			return (msgco.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}

	/*
	 * public void productspec() { produ_specifi.click(); }
	 */

	
	public boolean ratingselection() {
		// if(rating2avrg.isSelected());
		rating2avrg.click();
		return rating2avrg.isSelected();
	}
	
	

	public boolean isPageExists() {
		try {
			return (conti.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

}
