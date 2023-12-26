package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class readfiledata {

	@DataProvider (name="uidpwd")
	public String[][] readfiledata() throws EncryptedDocumentException, IOException
	{	
		//System.out.println("m:"+m.name());
		File f =new File("C:\\Users\\admin\\Desktop\\Selenium Automaiton\\TestAutomationFramework\\src\\test\\resources\\TestDAta\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Login");
		
		DataFormatter df=new DataFormatter();
		int rownum=sh.getLastRowNum();
		int colnum=sh.getRow(0).getLastCellNum();
		
		String [][]arr=new String[rownum][colnum];
		for(int i=1;i<=rownum;i++)
			for(int j=0;j<colnum;j++)
			{
				//arr[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
				
				arr[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
				
			}
		return arr;
		
	}
	
	
	
	
}
