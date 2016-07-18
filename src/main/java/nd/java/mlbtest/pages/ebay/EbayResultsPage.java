package nd.java.mlbtest.pages.ebay;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class EbayResultsPage extends BasePage
{

	public EbayResultsPage(WebDriver wd) 
	{
		super(wd);
	}

	public EbayItemPage grabResultNumber(int i)
	{
		waitForAndGetElementByXPath("//*[@id='e1-4']");
		findElementByXPath("//*[@id='e1-4']//li[@r='" + i + "']//a").click();
		return new EbayItemPage(getDriver());
	}
	
}
