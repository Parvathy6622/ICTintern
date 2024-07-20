package org.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorLogPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement login;
	@FindBy(xpath="//input[@type='text']")
	WebElement uname;
	@FindBy(xpath="//input[@type='password']")
	WebElement pw;
	@FindBy(xpath="//button[@type='submit']")
	WebElement sgbtn;
	//@FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter css-5ghcyz']")
	//@FindBy(xpath="//p[@id=':r2:-helper-text']")
	@FindBy(xpath="//div[@class='MuiBox-root css-jo4sh0']//child::p")
	
	WebElement error;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']/div[1]/a[1]")
	WebElement hm;
	public MentorLogPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logBtn() {
		login.click();
	}
	public void invalidlogincases(String inusername1,String inpassword1)
	{
		uname.sendKeys(inusername1);
		pw.sendKeys(inpassword1);
		
	}
	public void invalidlogincases1(String inusername2,String password2)
	{
		uname.sendKeys(inusername2);
		pw.sendKeys(password2);
		
	}
	public void validlogincases(String username,String password)
	{
		uname.sendKeys(username);
		pw.sendKeys(password);
	}
	public void sgnBtn() {
		sgbtn.click();
	}
	public String getTextAssertion_Warning()
	{
		return error.getText();
	}
	public void hmBtn() {
		hm.click();
}
}
