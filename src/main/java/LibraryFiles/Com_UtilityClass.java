package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Com_UtilityClass 
{
	//@Author Name: Jadhao
		//this method is use to get test data from excel sheet
		//need to pass 2 inputs: 1. rowIndex , 2.colIndex
		public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException 
		{		
			FileInputStream file=new FileInputStream("C:\\Users\\PRATIK\\Downloads\\eclipse-dsl-2022-03-R-win32-x86_64\\eclipse\\Blazeproject\\TestData\\Employee.xlsx");
		    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		            
		    String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		     
			return value;		
			
		}
		
		
		public static void captureScreenshot(WebDriver driver, int TCID) throws IOException 
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\PRATIK\\Downloads\\eclipse-dsl-2022-03-R-win32-x86_64\\eclipse\\Blazeproject\\ScreenShots"+TCID+".jpg");
			FileHandler.copy(src, dest);
		}
		
		
		public static String getPFdata(String key) throws IOException 
		{
			FileInputStream file=new FileInputStream("C:\\Users\\PRATIK\\Downloads\\eclipse-dsl-2022-03-R-win32-x86_64\\eclipse\\Blazeproject\\PropertyFile.properties");
			Properties p=new Properties();
			p.load(file);
			String value = p.getProperty(key);
			     
			return value;
		}
}
