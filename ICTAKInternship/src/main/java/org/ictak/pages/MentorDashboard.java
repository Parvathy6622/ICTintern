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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorDashboard {
	WebDriver driver;
	
	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-h6 css-1anx036']")
	//@FindBy(xpath="//div[text()='ICTAK INTERNSHIP PORTAL']")
	WebElement welcome;
	@FindBy(xpath="//button[@type='button']")
	WebElement show;
	@FindBy(xpath="//div[@style='display: flex; flex-wrap: wrap; gap: 20px;']/div[2]/div[2]/a")
	WebElement view;
	@FindBy(xpath="//td[text()='Rose']//following::td[5]")
	WebElement evaluate;
	@FindBy(xpath="//div[@id='root']/div[2]/h6")
	WebElement marksub;
	@FindBy(xpath="//div[@role='combobox']")
	WebElement mark;
	@FindBy(xpath="//ul[@role='listbox']/li[10]")
	WebElement number;
	@FindBy(xpath="//textarea[@name='Comments']")
	WebElement comment;
	@FindBy(xpath="//div[@id='root']/div[2]/button")
	WebElement submit;
	@FindBy(xpath="//td[text()='Rose']//following::td[5]")
	WebElement view1;
	@FindBy(xpath="//div[@id='root']/div[2]/h6")
	WebElement edit;
	
	@FindBy(xpath="//ul[@role='listbox']/li[11]")
	WebElement number1;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement update;
	@FindBy(xpath="//td[text()='Rose']//following::td[6]/button")
	WebElement delete;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']//child::a[2]")
	WebElement reference;
	@FindBy(xpath="//button[text()='Add Material']")
	WebElement addmaterial;
	@FindBy(xpath="//h2[text()='Add New Material']")
	WebElement newmaterial;
	//@FindBy(xpath="//div[@role='dialog']/div[1]/div[1]/label")
	@FindBy(xpath="//div[@role='dialog']/div[1]/div[1]/div[1]/input")
	//@FindBy(xpath="//div[@class='MuiDialogContent-root css-1ty026z']//child::div/label[text()='Title']")
	WebElement title;
	//@FindBy(xpath="//label[text()='Description']")
	@FindBy(xpath="//div[@role='dialog']/div[1]/div[2]/div[1]/input")
	WebElement description;
	//@FindBy(xpath="//label[text()='Link']")
	@FindBy(xpath="//div[@role='dialog']/div[1]/div[3]/div[1]/input")
	WebElement link;
	@FindBy(xpath="//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-1vskg8q']/button[2]")
	WebElement add;
	@FindBy(xpath="//div[text()='Testing']//following::div/button")
	WebElement delete1;
	//@FindBy(xpath="//div[@id='root']/header/div/div/div[2]/a[5]")
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	public MentorDashboard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getText()
	{
		return welcome.getText();
	}
	public void setShow()
	{
		show.click();
	}
	public void setView()
	{
		view.click();
	}
	public void setEvaluate()
	{
		evaluate.click();
	}
	public String getTextmark()
	{
		return marksub.getText();
	}
	public void setMark()
	{
		mark.click();
	}
	
	public void setNumber()
	{
		number.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void Comment(String cmt)
	{
		comment.sendKeys(cmt);
	}
	public void setSubmit()
	{
		submit.click();
	}
	public void setOKK() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		Alert alertt = driver.switchTo().alert();
		System.out.println(alertt.getText());
		alertt.accept();
	}
	public void setView1() throws InterruptedException
	{
		view1.click();
		Thread.sleep(5000);
	}
	public String getTextedit()
	{
		return edit.getText();
		
	}
	public void setMark1()
	{
		mark.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void setNumber1() throws InterruptedException
	{
		number1.click();
		Thread.sleep(5000);
	}
	public void Comment1(String cmt1)
	{
		Actions g=new Actions(driver);
		g.moveToElement(comment).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
		comment.sendKeys(cmt1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void setUpdate()
	{
		update.click();
	}
	/*
	public void setOk()
	{
	 // driver.switchTo().alert().accept();
		update.click();
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	*/
	
	public void setOk() throws InterruptedException
	{
		//update.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	public void setDelete()
	{
		delete.click();
	}
	public void setdeleok() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public void setReference()
	{
		reference.click();
	}
	public void setAddmaterial()
	{
		addmaterial.click();
	}
	public String getTextmaterial()
	{
		return newmaterial.getText();
	}
	
	public void Titlle(String til, String des,String lnk) 
	{
		 
		title.sendKeys(til);
		description.sendKeys(des);
		link.sendKeys(lnk);
	}
	
/*    public void Titlle(String til)
	{   Actions actions = new Actions(driver); 
	  actions.moveToElement(title).click().perform();
		title.sendKeys(til);
	}
	
/*	public void Titlle(String til)
{   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(title));
	
    //   JavascriptExecutor executor = (JavascriptExecutor) driver;
    //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
          ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value'", title);
       
       
       // executor.executeScript("arguments[0].click();", title);
   // title.click();
	title.sendKeys(til);
}
*/
	public void setAdd()
	{
		add.click();
	}
	public void setDelete1()
	{
		delete1.click();
	}
	public void setdeleok1() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public void setLogout()
	{
		logout.click();
	}
}
	


