package org.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogPage {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/login']")
	WebElement login;
	@FindBy(xpath="//input[@type='text']")
	WebElement uname1;
	@FindBy(xpath="//input[@type='password']")
	WebElement pw1;
	@FindBy(xpath="//button[@type='submit']")
	WebElement sgbtn1;
    @FindBy(xpath="//div[@class='MuiBox-root css-jo4sh0']//child::p")
	
	WebElement error1;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']/div[1]/a[1]")
	WebElement hm1;
	@FindBy(xpath="//h1[text()='Welcome Admin!!!']")
	WebElement weladm;
		public AdminLogPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void logBtn1() {
			login.click();
		}
		public void invalidlogincasess(String inemail,String inpassword)
		{
			uname1.sendKeys(inemail);
			pw1.sendKeys(inpassword);
			
		}
		public void invalidlogincasess1(String inemail,String password2)
		{
			uname1.sendKeys(inemail);
			pw1.sendKeys(password2);
			
		}
		public void validlogincasess(String email,String password)
		{
			uname1.sendKeys(email);
			pw1.sendKeys(password);
		}
		public void sgnBtn1() {
			sgbtn1.click();
		}
		public String getTextAssertion_Warning()
		{
			return error1.getText();
		}
		public void hmBtn1() {
			hm1.click();
	}
		public String getTextWeladm()
		{
			return weladm.getText();
		}

}
