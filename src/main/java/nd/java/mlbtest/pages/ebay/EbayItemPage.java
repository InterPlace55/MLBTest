package nd.java.mlbtest.pages.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import nd.java.mlbtest.pages.BasePage;

public class EbayItemPage extends BasePage
{

	public EbayItemPage(WebDriver wd) 
	{
		super(wd);
	}
	
	public String grabItemPrice()
	{
		WebElement price = waitForAndGetElementByXPath("//*[contains(@id, 'prcIsum']");
		
		return price.getText();
	}
	
}
