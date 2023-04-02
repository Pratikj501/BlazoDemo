package ModuleLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Com_Recipt
{
	//step1: declaration
			@FindBy(xpath="(//table[@class='table']//tr/td)[2]") private WebElement Id;   //private WebElement UN=driver.findElement(By.xpath(""))
			
			
			
			//step2: initialization
			public Com_Recipt(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			
			//step3: usage
			public void GetID() 
			{
				String print = Id.getText();
				System.out.println("ID:  "+ print);
			}

}
