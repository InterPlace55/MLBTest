package nd.java.mlbtest.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nd.java.mlbtest.pages.ebay.EbayHomePage;
import nd.java.mlbtest.pages.ebay.EbayItemPage;
import nd.java.mlbtest.pages.ebay.EbayResultsPage;
public class EbayTest 
{
	
	/**
     * The test initialize a Firefox browser window that opens EBay. 
     * Once the Ebay home page loads, the test will search for an Electric Guitar. 
     * Once results load, the test  will click the first item from the page. 
     * Once the first item loads, the test will extract the price of the item and print it out to console
     */
	public static boolean executeTest()
	{
		String thing = "Electric Guitar";
		
		WebDriver driver = new FirefoxDriver();
    	EbayHomePage ehp = new EbayHomePage(driver);
    	EbayResultsPage erp = ehp.searchForItem(thing);
    	EbayItemPage eip = erp.grabResultNumber(1);
    	String price = eip.grabItemPrice();
    	
    	System.out.println("eBay Test - The first result of " + thing + " on Ebay costs " + price);
    	
    	eip.closeBrowser();
    	
    	return true;
	}
	
    public static void main( String[] args )
    {
    	executeTest();
    }
}
