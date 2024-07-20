package org.ictak.testcases;


import java.sql.Driver;
import java.time.Duration;

import org.ictak.base.TestBase;
import org.ictak.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.AutomationConstant;

public class HomePageTC extends TestBase{
		HomePage homobj=null;
		@Test (priority=1)
		public void TC_1() throws InterruptedException
		{
			homobj= new HomePage(driver);
			homobj.setstudentsub();
			
			String form=homobj.getTextHome();
			Assert.assertEquals(form,AutomationConstant.ExpectedWord);
			System.out.println(form);
			
			homobj.formdetails("Rose", "rose@gmail.com", "https://github.com/atinfo/awesome-test-automation.git");
			homobj.setBatch();
			homobj.setvalue();
			homobj.setButton();
			
			homobj.setok();
		}

}
