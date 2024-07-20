package org.ictak.testcases;

import java.time.Duration;

import org.ictak.base.TestBase;
import org.ictak.pages.AdminDashboard;
import org.ictak.pages.AdminLogPage;
import org.ictak.pages.MentorLogPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.AutomationConstant;

public class AdminLoginTC extends TestBase{
	AdminLogPage adlgobj;
	AdminDashboard adobj;
	@Test (priority=4)
	public void TC_4() 
	{
		adlgobj= new AdminLogPage(driver);
		
		adlgobj.logBtn1();
		adlgobj.invalidlogincasess("admin@gmail.co", "admin@1234");
		adlgobj.sgnBtn1();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String warnn=adlgobj.getTextAssertion_Warning();
		Assert.assertEquals(warnn,AutomationConstant.ExpectedWarning1);
		System.out.println(warnn);
		
		adlgobj.hmBtn1();
		adlgobj.logBtn1();
		adlgobj.invalidlogincasess1("admin@gmail.co", "admin@12345");
		adlgobj.sgnBtn1();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String warnn1=adlgobj.getTextAssertion_Warning();
		Assert.assertEquals(warnn1,AutomationConstant.ExpectedWarning1);
		System.out.println(warnn1);
		
		adlgobj.hmBtn1();
		adlgobj.logBtn1();
		adlgobj.validlogincasess("admin@gmail.com", "admin@12345");
		adlgobj.sgnBtn1();
		
	}
	@Test (priority=5)
	public void TC_5() throws InterruptedException 
	{
		adlgobj= new AdminLogPage(driver);
		adobj= new AdminDashboard(driver);
		String wel=adlgobj.getTextWeladm();
		Assert.assertEquals(wel,AutomationConstant.Expectedword4);
		System.out.println(wel);
		
		adobj.Project();
		adobj.Addpro();
		adobj.Pronam("Test");
		adobj.Proadd();
		adobj.Edit1();
		adobj.Clear();
		adobj.Change("Testing");
		adobj.Save();
		adobj.Dele();
		
	
	}
	@Test (priority=6)
	public void TC_6() throws InterruptedException 
	{
		adobj= new AdminDashboard(driver);
		adobj.Mentorform();
		String form=adobj.getTextAddform();
		Assert.assertEquals(form,AutomationConstant.Expectedword5);
		System.out.println(form);
		adobj.mnt("xyz","xyz@gmail.com","9234567888","123456789");
		
		adobj.Menttopic();
		adobj.Topic();
		adobj.Sbmit();
		
		String for3=adobj.getTextInfo();
		Assert.assertEquals(for3,AutomationConstant.Expectedword6);
		System.out.println(for3);
		adobj.Up();
		String for4=adobj.getTextUpdateinfo();
		Assert.assertEquals(for4,AutomationConstant.Expectedword7);
		System.out.println(for4);
		adobj.mnt1("9234567889","123456789");
		adobj.Menttopic1();
		adobj.Topic1();
		adobj.Sbmit1();
		//adobj.Indel();
	}
	}

