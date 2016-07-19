package nd.java.mlbtest.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nd.java.mlbtest.pages.gmail.GmailLoginPage;

public class GmailWrongLoginTest
{
	/**
     * The test initialize a Firefox browser window that opens Gmail. 
     * Once the Gmail login page loads, the test will try to log into Gmail with a user name not recognized by Gmail. 
     * Gmail will say that it does not recognize the email.
     */
	public static boolean executeTest()
	{
		String email = "xxxtest5@gmail.com";
		
		WebDriver driver = new FirefoxDriver();
		GmailLoginPage glp = new GmailLoginPage(driver);
		boolean wrong = glp.enterUnrecognizedEmail(email);
		
		if(wrong)
			System.out.println("Gmail Unknown Login Test - Prompt is displayed: Test Passed");
    	else System.out.println("Gmail Unknown Login Test - Prompt not displayed: Test Failed");
		
		glp.closeBrowser();
		
		return wrong;
	}

	public static void main( String[] args )
	{
		executeTest();
	}
}
