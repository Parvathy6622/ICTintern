package org.ictak.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//div[@class='MuiTypography-root MuiTypography-h6 css-1anx036']")
	WebElement ict;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-k008qs']//child::a[2] ")
	WebElement stusub;
	
	@FindBy(xpath="//input[@name='Name'] ")
	WebElement nam;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']//child::div[2] ")
	WebElement batch;

	@FindBy(xpath="//li[@data-value='KKEM March ST'] ")
	WebElement st;
	@FindBy(xpath="//input[@name='Email']")
	WebElement email;
	@FindBy(xpath="//input[@name='SubmissionLink']")
	WebElement sublink;
	@FindBy(xpath="//button[@type='button']")
	WebElement button;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTextHome()
	{   return ict.getText();
		
		}
	public void setstudentsub()
	{
	    //  Actions actions = new Actions(driver); 
		//  actions.moveToElement(stusub).click().perform();
		stusub.click();
	}
	public void formdetails(String fullname,String mail,String link)
	{
		nam.sendKeys(fullname);
		email.sendKeys(mail);
		sublink.sendKeys(link);
		
	}
	public void setBatch()
	{
		batch.click();
	}
	public void setvalue()
	{
		st.click();
	}
	public void setButton()
	{
		button.click();
	}
	public void setok() throws InterruptedException
	{
	 // driver.switchTo().alert().accept();
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
