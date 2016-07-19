package nd.java.mlbtest.pages.ebay;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class EbayHomePage extends BasePage
{
	//Encapsulation of the eBay home page
	public EbayHomePage(WebDriver wd) 
	{
		super(wd);
		goTo("http://ebay.com");
	}
	
	//Searches for an item in eBay
	public EbayResultsPage searchForItem(String thing)
	{
		waitForAndGetElementByXPath("//*[@id='gh-ac']").sendKeys(thing);
		findElementByXPath("//*[@id='gh-btn']").click();
		return new EbayResultsPage(getDriver());
	}
}
