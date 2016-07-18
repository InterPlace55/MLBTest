package nd.java.mlbtest.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nd.java.mlbtest.pages.gmail.GmailLoginPage;

public class GmailWrongLoginTest
{
	public static boolean executeTest()
	{
		WebDriver driver = new FirefoxDriver();
		GmailLoginPage glp = new GmailLoginPage(driver);
		return glp.enterUnrecognizedEmail("xxxtest5");
	}

	public static void main( String[] args )
	{
		executeTest();
	}
}
