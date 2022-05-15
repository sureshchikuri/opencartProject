package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressBook {
	WebDriver driver;

	public AddressBook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	
	
	@FindBy(id="input-email")
	WebElement txtemail;
	
	@FindBy(id="input-password")
	WebElement txtpwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnlogin;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Address Book']")
	WebElement addbook;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement btnnewaddress;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='input-company']")
	WebElement cmpny;
	
	@FindBy(xpath="//input[@id='input-address-1']")
	WebElement addln1;
	
	@FindBy(xpath="//input[@id='input-address-2']")
	WebElement addln2;
	
	@FindBy(xpath="//input[@id='input-city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='input-postcode']")
	WebElement pinc;
	
	@FindBy(xpath="//select[@id='input-country']")
	WebElement country;
	

	@FindBy(xpath="//select[@id='input-zone']")
	WebElement state;
	
	@FindBy(xpath="//label[normalize-space()='No']")
	WebElement defaultaddsel;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncont;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void setemail(String email)
	{
	txtemail.sendKeys(email);
	}
	
	public void setpassword(String pwd)
	{
	txtpwd.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	
	public void addressbook()
	{
		addbook.click();
	}

	public void clicknewAddress()
	{
		btnnewaddress.click();
	}
	
	public void txtfname(String fstname)
	{
		fname.sendKeys(fstname);
	}

	public void txtlname(String lstname)
	{
		lname.sendKeys(lstname);
	}
	

	public void txtcompany(String cmpnyname)
	{
		lname.sendKeys(cmpnyname);
	}
	
	public void txtaddress1(String add1)
	{
		addln1.sendKeys(add1);
	}
	
	public void txtaddress2(String add2)
	{
		addln1.sendKeys(add2);
	}
	
	public void txtcity(String cty)
	{
		city.sendKeys(cty);
	}
	
	public void pincode(String pin)
	{
    pinc.sendKeys(pin);
	}
	
	public void select_conlist()
	{
		Select country = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
        country.selectByVisibleText("India");
	}
	
	public void select_statelist()
	{
		Select state = new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
        state.selectByVisibleText("Telangana");
	}
	
	public void radiobtn()
	{
		defaultaddsel.isSelected();
	}
	
	public void clickcontinue()
	{
		btncont.click();
	}
}
