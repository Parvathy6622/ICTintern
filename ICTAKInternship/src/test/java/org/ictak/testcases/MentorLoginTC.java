package org.ictak.testcases;

import java.time.Duration;

import org.ictak.base.TestBase;
import org.ictak.pages.HomePage;
import org.ictak.pages.MentorDashboard;
import org.ictak.pages.MentorLogPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.AutomationConstant;





public class MentorLoginTC extends TestBase{
	HomePage homobj;
	MentorLogPage logobj;
	MentorDashboard mbobj=null;
	@Test (priority=2) 
	public void TC_2()
	{
		homobj= new HomePage(driver);
		logobj= new MentorLogPage(driver);
		
		logobj.logBtn();
		logobj.invalidlogincases("ado@gmail.com ", "adon12345");
		logobj.sgnBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String warn=logobj.getTextAssertion_Warning();
		Assert.assertEquals(warn,AutomationConstant.ExpectedWarning);
		System.out.println(warn);
		
		logobj.hmBtn();
		logobj.logBtn();
		logobj.invalidlogincases1("ado@gmail.com ", "adon123456");
		logobj.sgnBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String warn1=logobj.getTextAssertion_Warning();
		Assert.assertEquals(warn1,AutomationConstant.ExpectedWarning);
		System.out.println(warn1);
		
		logobj.hmBtn();
		logobj.logBtn();
		logobj.validlogincases("adon@gmail.com", "adon123456");
		logobj.sgnBtn();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test (priority=3)
	public void TC_3() throws InterruptedException
	{
		logobj= new MentorLogPage(driver);
		mbobj= new MentorDashboard(driver);
		
		String warn=mbobj.getText();
		Assert.assertEquals(warn,AutomationConstant.Expectedword);
		System.out.println(warn);
		
		mbobj.setShow();
		mbobj.setView();
		mbobj.setEvaluate();
		String form1=mbobj.getTextmark();
		Assert.assertEquals(form1,AutomationConstant.Expectedword1);
		System.out.println(form1);
		mbobj.setMark();
		mbobj.setNumber();
		mbobj.Comment("good");
		mbobj.setSubmit();
		mbobj.setOKK();
		mbobj.setView1();
		String form2=mbobj.getTextedit();
		Assert.assertEquals(form2,AutomationConstant.Expectedword2);
		System.out.println(form2);
		mbobj.setMark1();
		mbobj.setNumber1();
		mbobj.Comment1("well done");
		mbobj.setUpdate();
		mbobj.setOk();
		mbobj.setDelete();
		mbobj.setdeleok();
		mbobj.setReference();
		mbobj.setAddmaterial();
		String form=mbobj.getTextmaterial();
		Assert.assertEquals(form,AutomationConstant.Expectedword3);
		System.out.println(form);
	    mbobj.Titlle("Testing", "Software testing is an important process in the software development lifecycle.", "https://www.geeksforgeeks.org/software-testing-basics/");
	//mbobj.Titlle("Testing");
		mbobj.setAdd();
		mbobj.setDelete1();
		mbobj.setdeleok1();
		mbobj.setLogout();
}

}
