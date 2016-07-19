package nd.java.mlbtest.pages.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import nd.java.mlbtest.pages.BasePage;

public class EbayItemPage extends BasePage
{
	//Encapsulation of an eBay item page
	public EbayItemPage(WebDriver wd) 
	{
		super(wd);
	}
	
	//Grabs the item price and returns it as a string
	public String grabItemPrice()
	{
		WebElement price = waitForAndGetElementByXPath("//*[@id='prcIsum' or @id='prcIsum_bidPrice']");
		
		return price.getText();
	}
	
}
