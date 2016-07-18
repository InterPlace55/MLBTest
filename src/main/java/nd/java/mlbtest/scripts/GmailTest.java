package nd.java.mlbtest.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nd.java.mlbtest.pages.gmail.GmailEmailPage;
import nd.java.mlbtest.pages.gmail.GmailLoginPage;

/**
 * Hello world!
 *
 */
public class GmailTest 
{
	public static boolean executeTest()
	{
		WebDriver driver = new FirefoxDriver();
    	GmailLoginPage glp = new GmailLoginPage(driver);
    	GmailEmailPage gep = glp.loginToGmail("xxxtest825@gmail.com", "RodeToSun123");
    	return gep.verifyLoginIsSuccessful("xxxtest825@gmail.com", "Test Daniels");
	}
	
    public static void main( String[] args )
    {
    	executeTest();
    }
}
