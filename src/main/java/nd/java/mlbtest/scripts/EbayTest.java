package nd.java.mlbtest.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nd.java.mlbtest.pages.ebay.EbayHomePage;
import nd.java.mlbtest.pages.ebay.EbayItemPage;
import nd.java.mlbtest.pages.ebay.EbayResultsPage;
public class EbayTest 
{
	public static boolean executeTest()
	{
		WebDriver driver = new FirefoxDriver();
    	EbayHomePage ehp = new EbayHomePage(driver);
    	EbayResultsPage erp = ehp.searchForItem("Electric Guitar");
    	EbayItemPage eip = erp.grabResultNumber(1);
    	String price = eip.grabItemPrice();
    	
    	System.out.println(price);
    	
    	return true;
	}
	
    public static void main( String[] args )
    {
    	executeTest();
    }
}
