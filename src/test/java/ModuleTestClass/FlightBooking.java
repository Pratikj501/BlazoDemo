package ModuleTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.Com_UtilityClass;
import ModuleLogin.Com_POM1;
import ModuleLogin.Com_POM2;
import ModuleLogin.Com_POM3;
import ModuleLogin.Com_Recipt;


public class FlightBooking extends BaseClass
{
	
	int TCID;
	 Com_POM1 search;
	 Com_POM2 slt;
	 Com_POM3 purchaseF;
	 Com_Recipt rec;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	    initializeBrowser();
	     search = new Com_POM1(driver);
	     slt = new Com_POM2(driver);
	     purchaseF = new Com_POM3(driver);
	      rec = new Com_Recipt(driver);
	}
	
	@BeforeMethod
	public void searchFlights() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	    search.findFlight();
	    
	    slt.getPrice();
	    slt.selectFlight();
	    
	    purchaseF.getFlightName();
	    purchaseF.PassUserInfo();
	   
	   
		
	}
	
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException 
	{
		rec.GetID();
		TCID = 101;
//		String actUserID=home.getKiteHomePageActUserID();
//		String expUserID=UtilityClass.getTD(0, 3);
//		Assert.assertEquals(actUserID, expUserID,"Failed: both results are diff");
	}
	
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			Com_UtilityClass.captureScreenshot(driver, TCID);
		}
		
		//logout
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		//driver.quit ();
	}

}
