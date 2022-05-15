package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompare {
	
	WebDriver Diver;

	public ProductCompare(WebDriver diver) {
		Diver = diver;
		PageFactory.initElements(diver,this);	
		
	}
	
	@FindBy(name="search")
	 WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="//i[@class='fa fa-exchange']")      //a[@id='compare-total']
	WebElement productcompare;//productcompare icon
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgconfm;

    @FindBy(xpath="//a[@id='compare-total']")
    WebElement productlink;
    
    @FindBy(xpath="//input[@value='Add to Cart']")
    WebElement addcart;
    
    @FindBy(xpath="//a[@class='btn btn-default']")
    WebElement continueshopping;
    
    @FindBy(xpath="//a[@class='btn btn-danger btn-block']")
    WebElement remove;
    
    @FindBy(xpath="//a[@class='btn btn-default']")
    WebElement continuebtn;

    public void search_txt(String txt)
    {
    	searchtxt.sendKeys(txt);
    }
    
    public void searchbtn()
    {
    	searchbutton.click();
    }
    
    public void productcompare()
    {
    	productcompare.click();
    }
	
    
    public void productcompareicon()
    {
    	productlink.click();
    }
    
    public void addcart()
    {
    	addcart.click();
    }
    
    public void continushop()
    {
    	continueshopping.click();
    }
    
    public void removeproduct()
    {
    	remove.click();
    }
    
    public void continuebutton()
    {
    	continuebtn.click();
    }
    
    public String getConfirmationmsg()
    {
    	try 
    	{
		return(msgconfm.getText());
		} 
    	catch (Exception e)
    	{
    		return(e.getMessage());
		}
	
    }
	
	
}

      



      


