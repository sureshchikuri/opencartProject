package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword {
	WebDriver driver;

	public ForgetPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
   @FindBy(xpath="//span[normalize-space()='My Account']")
   WebElement Myaccountlnk;
   
   @FindBy(xpath="//a[normalize-space()='Login']")
   WebElement Loginlnk;
   
   @FindBy(xpath="//input[@id='input-email']")
   WebElement txtemail;
   
   @FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
   WebElement frgtpwdlnk;
   
   @FindBy(xpath="//input[@id='input-email']")
   WebElement email;
   
   @FindBy(xpath="//input[@value='Continue']")
   WebElement cont;
   
   public void myaccount()
   {
	   Myaccountlnk.click();  
   }
   
   public void login()
   {
	   Loginlnk.click();  
   }
   
   public void setEmail(String txt)
   {
	   txtemail.sendKeys(txt);;  
   }
   
   public void forgetpassword()
   {
	   frgtpwdlnk.click();  
   }
   
   public void forgtemail(String txt)
   {
	   email.sendKeys(txt);  
   }
   public void continuebtn()
   {
	   cont.click();  
   }
  	
}
