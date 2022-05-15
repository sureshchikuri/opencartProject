package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	WebDriver driver;

	public ChangePassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Change your password']")
	WebElement changepwd;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement newpswd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confmpwd;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement clickback;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement contnbtn;
	
	public void setemail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setpassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickbtn()
	{
		btnLogin.click();
	}
	
	public void changepasswordlnk()
	{
		changepwd.click();
	}
	
	public void newpwd(String Npass)
	{
		newpswd.sendKeys(Npass);
	}
	
	public void confpwd(String cnfpwd)
	{
		confmpwd.sendKeys(cnfpwd);
	}
	
	public void back_homepage()
	{
		clickback.click();
	}
	
	public void clickcontinue()
	{
		contnbtn.click();
	}

}
