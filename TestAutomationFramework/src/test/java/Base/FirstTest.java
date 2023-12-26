package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.readfiledata;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FirstTest extends BaseC {

//	public static Properties pr2=new Properties();
//	@BeforeMethod
//	public void readfile() throws IOException
//	{
//	   FileReader fr2=new FileReader("C:\\Users\\admin\\Desktop\\Selenium Automaiton\\TestAutomationFramework\\src\\test\\resources\\ConfigFiles\\locators.properties");
//	   pr2.load(fr2);
//	}
	@Test(dataProviderClass=readfiledata.class,dataProvider="uidpwd")
	public void logintest(String x, String y) throws InterruptedException
	{
		driver.findElement(By.xpath(pr2.getProperty("Email_Textbox"))).sendKeys(x);
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr2.getProperty("Password_Textbox"))).sendKeys(y);
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr2.getProperty("Login_btn"))).click();
		Thread.sleep(10000);
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}
	
//	@Test(dataProviderClass=readfiledata.class,dataProvider="uidpwd")
//	public void Registration(String x, String y) throws InterruptedException
//	{
//		driver.findElement(By.xpath(pr2.getProperty("Email_Textbox"))).sendKeys(x);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(pr2.getProperty("Password_Textbox"))).sendKeys(y);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(pr2.getProperty("Login_btn"))).click();
//		Thread.sleep(10000);
//		
//		
//		
//		
//	}
	
	
	
}
