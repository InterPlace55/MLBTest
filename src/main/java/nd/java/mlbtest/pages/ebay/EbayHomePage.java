package nd.java.mlbtest.pages.ebay;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class EbayHomePage extends BasePage
{
	public EbayHomePage(WebDriver wd) 
	{
		super(wd);
		goTo("http://ebay.com");
	}
	
	public EbayResultsPage searchForItem(String thing)
	{
		waitForAndGetElementByXPath("//*[@id='gh-ac']").sendKeys(thing);
		findElementByXPath("//*[@id='gh-btn']").click();
		return new EbayResultsPage(getDriver());
	}
}
