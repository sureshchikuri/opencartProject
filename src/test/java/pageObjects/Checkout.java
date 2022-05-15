package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='MacBookAir']")
	WebElement sliderimg1;
	
	@FindBy(xpath="//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-next swiper-slide-duplicate-prev']//img[@alt='iPhone 6']")
	WebElement sliderimg2;
	
	@FindBy(css="swiper-button-next")
	WebElement slideright;
	
	@FindBy(className="swiper-button-prev")
	WebElement slideleft;
	
	
	@FindBy(xpath="//a[normalize-space()='Desktops']")
	WebElement headerdesktopicon;
	
	
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='button-group']//i[@class='fa fa-shopping-cart']")
	WebElement addcart;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement viewcart;
	
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement shpngcart;
	//span[normalize-space()='Shopping Cart']
	
	@FindBy(css="input[value='1']")
	WebElement qntytxt;
	
	@FindBy(xpath="//i[@class='fa fa-refresh']")
	WebElement qntyupdt;
	
	@FindBy(xpath="//i[@class='fa fa-times-circle']")
	WebElement qntyrmv;
	
	@FindBy(xpath="//a[@class='btn btn-primary']") ////a[@class='btn btn-primary']
	WebElement checkout;

	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement msgconotfound;
	
	public void Desktopmenu()
	{
		headerdesktopicon.click();
	}
	
	public void sliderimg1()
	{
		sliderimg1.click();
	}
	
	public void sliderimg2()
	{
		sliderimg2.click();
	}
	
	public void slideright()
	{
		slideright.click();
	}
	
	public void slideleft()
	{
		slideleft.click();
	}
	
	
	
	
	public void searchtext(String txt)
	{
		searchtxt.sendKeys(txt);
	}
	
	public void searchbtn()
	{
		searchbtn.click();
	}
	
	public void addcart()
	{
		addcart.click();
	}
	
	public void viewcart()
	{
		viewcart.click();
	}
	
	public void shoppingcart()
	{
		shpngcart.click();
	}
	
	public void quantity(String txt)
	{
		qntytxt.clear();
		qntytxt.sendKeys(txt);
	}
	
	public void quantityrefresh()
	{
		qntyupdt.click();
	}
	
	public void quantityremove()
	{
		qntyrmv.click();
	}
	
	public void checkout()
	{
		checkout.click();
	}
	
	public boolean isPageExists() 
	{
		
		try 
		{
			return(msgconotfound.isDisplayed());
		} 
		catch (Exception e)
		{
			return false;
		}
	}
	
	
	
	
	
}