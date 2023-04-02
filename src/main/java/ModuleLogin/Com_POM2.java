package ModuleLogin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Com_POM2
{
	//step1: declaration
			@FindBy(xpath="//html/body/div[2]/table/tbody/tr[*]/td[6]") private List<WebElement> Price;   //private WebElement UN=driver.findElement(By.xpath(""))
			@FindBy(xpath="(//input[@type='submit'])[3]") private WebElement FlightChoose;  //private WebElement PWD=driver.findElement(By.xpath(""))
			
			
			//step2: initialization
			public Com_POM2(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			
			//step3: usage
			public void getPrice() 
			{
				for(WebElement prc:Price)				
				{
					System.out.println(prc.getText());
				}
			}
			public void selectFlight()
			{
				FlightChoose.click();
			}

}
