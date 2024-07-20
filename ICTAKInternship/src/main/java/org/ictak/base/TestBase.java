package org.ictak.base;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;




public class TestBase {
	public static  WebDriver driver;
	Properties prop=null;
	public void loadprop() throws IOException
	{
		prop=new Properties();
		FileInputStream fileip =new FileInputStream("C:\\Users\\jacks\\Documents\\MavenLive\\ICTAKInternship\\src\\test\\resources\\config.properties"); //load external file
		prop.load(fileip);
		
	}
	
	@BeforeTest
	public void setupconfig() throws IOException
	{
		loadprop();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/*
	@AfterSuite
    public void new_setup() {
	driver.quit();
	}
	public void End()
	{
		System.out.println("All Test Caeses are Executed");
	}

*/
}
