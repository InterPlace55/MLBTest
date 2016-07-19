package nd.java.mlbtest.pages.ebay;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class EbayResultsPage extends BasePage
{

	//Encapsulation of eBay search results page
	public EbayResultsPage(WebDriver wd) 
	{
		super(wd);
	}

	//Goes to the numbered result given on the search engine
	public EbayItemPage grabResultNumber(int i)
	{
		waitForAndGetElementByXPath("//*[@id='e1-4']");
		findElementByXPath("//*[@id='e1-4']//li[@r='" + i + "']//a").click();
		return new EbayItemPage(getDriver());
	}
	
}
