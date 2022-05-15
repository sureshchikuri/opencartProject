package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	WebDriver driver;

	public WishList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="search")
	 WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")         
	WebElement wlist;
	
	@FindBy(xpath="//span[normalize-space()='Wish List (1)']") //
	WebElement wishlsticon;
	
	
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement notfoun;
	
	@FindBy(xpath="//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
	WebElement addtocarticon;
	//button
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement msgcon;
	
	@FindBy(xpath="//a[@class='btn btn-danger']")
	WebElement remove;
	
	@FindBy(linkText="Continue")
	WebElement btn;
	
	public void search_txt(String text)
    {
  	  searchtxt.sendKeys(text);
    }
	
	public void search_button() 
	{
		searchbutton.click();
	}
	
	public void wlist_button()
	{
		wlist.click();
	}
	
	public void wlist_icon()
	{
		wishlsticon.click();
	}
	
	public void Addtocart()
	{
		addtocarticon.click();
	}

	public void removelnk()
	{
		remove.click();
	}
	
    public void continueclick() 
   {
    	btn.click();
   }
	
	public String getMessageconformation() 
	{
		try 
		{
			return(msgcon.getText());
		}
		catch (Exception e)
		{
		return(e.getMessage());
		}
		
	}
	
	public boolean isPageExists()
	{
		try
		{
		return (notfoun.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
}


   


