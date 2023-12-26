package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC {
	
		public static WebDriver driver=null;
		public static Properties pr=new Properties();
		public static FileReader fr,fr2;
		public static Properties pr2=new Properties();
		
		@BeforeMethod
		public void setup() throws IOException {
			
			fr2=new FileReader("C:\\Users\\admin\\Desktop\\Selenium Automaiton\\TestAutomationFramework\\src\\test\\resources\\ConfigFiles\\locators.properties");
			pr2.load(fr2);
			
			if(driver==null) {
				
				fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\config.properties");
				pr.load(fr);
				//System.out.println("project path:"+System.getProperty("user.dir"));
			}
			
			if(pr.getProperty("browser").equalsIgnoreCase("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get(pr.getProperty("testurl"));
				driver.manage().window().maximize();
				System.out.println("hello");
				
			}
			
			else if(pr.getProperty("browser").equalsIgnoreCase("Firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get(pr.getProperty("testurl"));
				driver.manage().window().maximize();
			}
			
		}
		@AfterMethod
		public void teardown() {
			System.out.println("hello");
			
			driver.close();
			
			
		}
		
	
}
