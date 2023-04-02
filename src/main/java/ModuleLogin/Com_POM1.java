package ModuleLogin;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Com_POM1 
{
	//step1: declaration
		@FindBy(xpath="//select[@name='fromPort']") private WebElement Source;   //private WebElement UN=driver.findElement(By.xpath(""))
		@FindBy(xpath="//select[@name='toPort']") private WebElement Destination;  //private WebElement PWD=driver.findElement(By.xpath(""))
		@FindBy(xpath="//input[@type='submit']") private WebElement FindBtn;  //private WebElement LoginBtn=driver.findElement(By.xpath(""))
		
		
		//step2: initialization
		public Com_POM1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//step3: usage
		public void findFlight() 
		{
			Select src=new Select(Source);
			src.selectByIndex(5);
			
			Select dest=new Select(Destination);
			dest.selectByIndex(2);
			
			FindBtn.click();
		}
		
		
		
		

}
