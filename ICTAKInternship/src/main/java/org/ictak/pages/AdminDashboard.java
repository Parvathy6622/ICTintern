package org.ictak.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboard {
	WebDriver driver;
	@FindBy(xpath="//div[@class='card--title']//child::h2[text()='Projects']")
	WebElement project;
	@FindBy(xpath="//div[@id='root']/div[1]/button")
	WebElement addpro;
	@FindBy(xpath="//div[@role='dialog']/div[1]/div[1]/div[1]/input")
	WebElement pronam;
	@FindBy(xpath="//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-1vskg8q']/button[2]")
	WebElement proadd;
	@FindBy(xpath="//div[text()='Test']//following::div[1]/button[1]")
	WebElement edit1;
	//@FindBy(xpath="//input[@value='Test']")
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 css-1twzmnh']//child::div[1]/input")
	WebElement change;
	
	//@FindBy(xpath="//input[@value='Test']//following::div[1]/button[2]")
	
	@FindBy(xpath="//input[contains(@value,'Test')][1]//following::div[1]/button[2]")
	//@FindBy(xpath="//div[@id='root']/div[2]/div/div[22]/div/div[2]/button[2]")
	//@FindBy(xpath="//div[@class='MuiCardActions-root MuiCardActions-spacing css-ny0n9o']/button[2]")
	WebElement save;
	@FindBy(xpath="//div[text()='Testing']//following::div[1]/button[2][text()='Delete']")
	WebElement dele;
	
	
	//Mentor form
	@FindBy(xpath="//div[@id=\"root\"]//child::header/div/div/div[2]/a[2]")
	WebElement mntfrm;
	@FindBy(xpath="//h4[text()='ADD MENTOR']")
	WebElement addform;
	@FindBy(xpath="//div[@id='root']//child::div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div/input")
	//@FindBy(xpath="//label[text()='Name']")
	
	WebElement mentname;
	@FindBy(xpath="//div[@id='root']//child::div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input")
	WebElement mentemail;
	@FindBy(xpath="//div[@id='root']//child::div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input")
	WebElement mentphone;
	@FindBy(xpath="//div[@id='root']//child::div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input")
	WebElement mentpass;
	@FindBy(xpath="//div[@id='demo-simple-select']")
	WebElement menttopic;
	//@FindBy(xpath="//ul[@role='listbox']//child::li[text()='Testing']")
	@FindBy(xpath="//ul[@role='listbox']//child::li[@data-value='Testing']")
	WebElement topic;
	@FindBy(xpath="//div[@id='root']//child::div/div/form/div/div[6]/button")
	WebElement submit;
	
	//update 
	@FindBy(xpath="//div[@class='mentor-display-container']//child::h4[text()='MENTOR INFO']")
	WebElement info;
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//child::td[text()='xyz']//following::td[4]/button[1]")
	WebElement up;
	@FindBy(xpath="//h4[text()='UPDATE MENTOR']")
	WebElement updateinfo;
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//child::td[text()='xyz']//following::td[5]/button[1]")
	WebElement indel;
	public AdminDashboard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Project() {
		project.click();
	}
	public void Addpro() {
		addpro.click();
	}
	public void Pronam(String till) 
	{
		 
		pronam.sendKeys(till);
		
	}
	public void Proadd()
	{
		proadd.click();
	}
	public void Edit1()
	{
		edit1.click();
		
	}
	public void Clear() throws InterruptedException
	{ 
		//change.click();
		Thread.sleep(5000);
		
		Actions a=new Actions(driver);
		a.moveToElement(change).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
		
	}
	public void Change(String val) throws InterruptedException 
	{
		
		Thread.sleep(5000);
		
		change.sendKeys(val);
		
	}
	public void Save() throws InterruptedException
	{
		save.click();
       Thread.sleep(5000);
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
	}
	public void Dele() throws InterruptedException
	{
		dele.click();
        Thread.sleep(5000);
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
	}
	
	//mentor form
	public void Mentorform()
	{
		mntfrm.click();
		
	}
	public String getTextAddform()
	{
		return addform.getText();
	}
	
	public void mnt(String mnam, String memail,String mph,String mpw) 
	{
		 
		mentname.sendKeys(mnam);
		mentemail.sendKeys(memail);
		mentphone.sendKeys(mph);
		mentpass.sendKeys(mpw);
	}
	
	
	public void Menttopic() {
		menttopic.click();
	}
	public void Topic() {
		topic.click();
		Actions actions = new Actions(driver); 
		  actions.moveToElement(mentname).click().perform();
		
	}
	public void Sbmit() throws InterruptedException {
		submit.click();
		
       Thread.sleep(5000);
		
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.accept();
	}
		
		public String getTextInfo()
		{
			return info.getText();
		}
		public void Up()
		{
			up.click();
		}
		public String getTextUpdateinfo()
		{
			return updateinfo.getText();
		}
		public void mnt1(String mph1,String mpw1) 
		{
			Actions e=new Actions(driver);
			e.moveToElement(mentphone).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
			mentphone.sendKeys(mph1);
			Actions f=new Actions(driver);
			f.moveToElement(mentpass).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
			mentpass.sendKeys(mpw1);
		
		}
		public void Menttopic1() {
			menttopic.click();
		}
		public void Topic1() {
			//topic.click();
			Actions g=new Actions(driver);
			g.moveToElement(topic).doubleClick().perform();
			
			Actions actionss = new Actions(driver); 
			  actionss.moveToElement(mentname).click().perform();
			
		}
		public void Sbmit1() throws InterruptedException {
			submit.click();
			
	       Thread.sleep(5000);
			
			Alert alert4 = driver.switchTo().alert();
			System.out.println(alert4.getText());
			alert4.accept();
		}
		public void Indel() throws InterruptedException
		{
			indel.click();
			Thread.sleep(5000);
			
			Alert alert5 = driver.switchTo().alert();
			System.out.println(alert5.getText());
			alert5.accept();
		}
	}

