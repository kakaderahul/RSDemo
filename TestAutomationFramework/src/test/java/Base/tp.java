package Base;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tp {

//	public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver driver=null;
//		System.out.println("************************** Menu bar ******** ");
//		System.out.println("1: Chrome browser ");
//		System.out.println("2: Mozella browser");
//		System.out.println("3: Edge ");
//		System.out.println("4: quit");
//		
//		System.out.println("************************** ******** ");
//		
//		System.out.println(" enter your choice ");
//		Scanner sc=new Scanner(System.in);
//		int c=sc.nextInt();
//		
//		switch (c)
//		{
//		case 1:
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			break;
//			
//		case 2:
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//			break;
//		case 3:
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//			break;
//			
//		default:
//			System.out.println("invalid choice");
//			
//		
//		}
//		
//		
//		
//		
//		driver.get("https://www.zoho.com/in/billing/pricing/?src=zohobilling_topmenu");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("(//a[text()='Start 14-day free trial' and @class='free-trial-cta'])[1]")).click();
//		
//		
//		
//		
//	}

	public static String [] testd() {
		String[] arr= {"Hello","Hi."};
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		
		String arr2[]= testd();
		System.out.println("String arr2:" +arr2[0]+" "+arr2[1]);
		
	}
	
	
}
