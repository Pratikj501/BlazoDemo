package LibraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public void initializeBrowser() throws InterruptedException, IOException
	{
//		WebDriverManager.chromedriver().setup();
//		
//		 driver=new ChromeDriver();
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	
		 System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\PRATIK\\Downloads\\eclipse-dsl-2022-03-R-win32-x86_64\\eclipse\\Blazeproject\\Browsers\\cdriver.exe");
					
			    driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			driver.get(Com_UtilityClass.getPFdata("URL"));
	

}


}
