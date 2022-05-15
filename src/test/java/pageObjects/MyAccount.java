package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	WebDriver driver;

	public MyAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='caret']")
	WebElement myaccountlnk;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpwd;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginlnk;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnlogin;
	
	@FindBy(linkText="Edit your account information")
	WebElement editac_Info;
	
	   @FindBy(xpath="//input[@id='input-firstname']")
	   WebElement editac_Info_fname;
	   @FindBy(xpath="//input[@id='input-lastname']")
	   WebElement editac_Info_lname;
	   @FindBy(xpath="//input[@id='input-email']")
	   WebElement editac_Info_email;
	   @FindBy(name="telephone")
	   WebElement editac_Info_tel;
	   @FindBy(xpath="//input[@value='Continue']")
	   WebElement continuebtn;
	   
	  
	
	@FindBy(linkText="Change your password")
	WebElement pwdchng;
	
	   @FindBy(name="password")
	   WebElement pwdchngnew;
	   @FindBy(name="confirm")
	   WebElement pwdchngconf;
	   
	
	
	@FindBy(linkText="Modify your address book entries")
	WebElement Modifyaddbk;
	
	@FindBy(linkText="Modify your wish list")
	WebElement modifywhlst;;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Newsletter']")
	WebElement newsltr;
	
	@FindBy(xpath="//input[@value='1']")
	WebElement radiobtn;
	
	@FindBy(xpath="//i[@class='fa fa-phone']")
	WebElement contacticon;
	
	@FindBy(xpath="//span[normalize-space()='Currency']")
	WebElement currencylnk;
	
	@FindBy(xpath="//button[normalize-space()='$ US Dollar']")
	WebElement selectusd;
	
	public void Myaccnt()
	{
		myaccountlnk.click();
		
	}
	
	
	public void loginlnk()
	{
		loginlnk.click();
		
	}
	
	public void email(String txt) 
	{
		txtemail.sendKeys(txt);
	}
	
	public void passwrd(String txt)
	{
		txtpwd.sendKeys(txt);
		
	}
	
	public void clickloginbtn()
		{
			btnlogin.click();
	}
	
	public void edit_acc_info_lnk()
	{
		
		editac_Info.click();
	}
	 
	   public void edit_fname(String txt)
	   {
		   editac_Info_fname.clear();
		   editac_Info_fname.sendKeys(txt);
	   }
	   
	   public void edit_lname(String txt)
	   {
		   editac_Info_lname.clear();
		   editac_Info_lname.sendKeys(txt);
	   }
	   
	   public void edit_email(String txt)
	   {
		   editac_Info_email.clear();
		   editac_Info_email.sendKeys(txt);
	   }
	   
	   public void edit_tel(String txt)
	   {
		   editac_Info_tel.clear();
		   editac_Info_tel.sendKeys(txt);
	   }
	   
	   public void clickcontinue()
	   {
		   continuebtn.click();
	   }
	  
	
	   public void change_pwd_link()
	   {
		   pwdchng.click();
	   }
	   
	   public void passwordchange(String txt)
	   {
		   pwdchngnew.sendKeys(txt);
	   }
	 
	   public void passwordchangeconf(String txt)
	   {
		   pwdchngconf.sendKeys(txt);
	   }
	
	public void modify_addbook_entries_lnk()
	{
		Modifyaddbk.click();
	}

	public void modify_whslist_lnk()
	{
		modifywhlst.click();
	}
	
	public boolean select_subscribe()
	{
		newsltr.click();
		return newsltr.isSelected();
	}
	
	public void selct_radio()
	{
		radiobtn.click();
	}
	
	public void contactlnk()
	{
		contacticon.click();
	}
	
	public void currencylnk()
	{
		currencylnk.click();
	}
	
	public void selectCurrency()
	{
		selectusd.click();
	}
	
	
}
