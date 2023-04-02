package ModuleLogin;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import LibraryFiles.Com_UtilityClass;

public class Com_POM3 
{
	//step1: declaration
	@FindBy(xpath="//div[@class=\"container\"]/p") private List<WebElement> FlightName;   //private WebElement UN=driver.findElement(By.xpath(""))
	@FindBy(xpath="//input[@id=\"inputName\"]") private WebElement Name;  // WebElement PWD=driver.findElement(By.xpath(""))
	@FindBy(xpath="//input[@id='address']") private WebElement Address; 
	@FindBy(xpath="//input[@id='city']") private WebElement City; 
	@FindBy(xpath="//input[@id='state']") private WebElement State; 
	@FindBy(xpath="//input[@id='zipCode']") private WebElement Code; 
	@FindBy(xpath="//select[@id='cardType']") private WebElement Card; 
	@FindBy(xpath="//input[@id='creditCardNumber']") private WebElement CardNumber; 
	@FindBy(xpath="//input[@id='creditCardMonth']") private WebElement creditCardMonth; 
	@FindBy(xpath="//input[@id='creditCardYear']") private WebElement creditCardYear; 
	@FindBy(xpath="//input[@id='nameOnCard']") private WebElement nameOnCard; 
	@FindBy(xpath="//label[@class='checkbox']") private WebElement AgreeCheckbox; 
	@FindBy(xpath="//input[@type='submit']") private WebElement PurchaseFlight; 

	//step2: initialization
	public Com_POM3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//step3: usage
	public void getFlightName() throws InterruptedException 
	{
		for(WebElement name:FlightName)				
		{
			Thread.sleep(2000);
			System.out.println(name.getText());
		
		}
	}
	public void PassUserInfo() throws EncryptedDocumentException, IOException, InterruptedException
	{  
		Thread.sleep(2000);
		Name.sendKeys(Com_UtilityClass.getTD(0, 0));
		Thread.sleep(2000);
		Address.sendKeys(Com_UtilityClass.getTD(1, 0));
		Thread.sleep(2000);
		City.sendKeys(Com_UtilityClass.getTD(2, 0));
		Thread.sleep(2000);
		State.sendKeys(Com_UtilityClass.getTD(3, 0));
		Thread.sleep(2000);
	    Code.sendKeys(Com_UtilityClass.getTD(5, 0));
		Thread.sleep(2000);
		Select scard=new Select(Card);
		scard.selectByIndex(1);	
		CardNumber.sendKeys(Com_UtilityClass.getTD(6, 0));
		creditCardMonth.clear();
		creditCardMonth.sendKeys(Com_UtilityClass.getTD(7, 0));
		creditCardYear.clear();
		creditCardYear.sendKeys(Com_UtilityClass.getTD(8, 0));
		nameOnCard.sendKeys(Com_UtilityClass.getTD(4, 0));
		
		Thread.sleep(3000);
		
		AgreeCheckbox.click();
		PurchaseFlight.click();
	
	}
		
	
	
	


}
