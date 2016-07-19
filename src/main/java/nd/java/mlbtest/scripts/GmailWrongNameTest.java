package nd.java.mlbtest.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nd.java.mlbtest.pages.gmail.GmailEmailPage;
import nd.java.mlbtest.pages.gmail.GmailLoginPage;

public class GmailWrongNameTest
{
	/**
     * The test initialize a Firefox browser window that opens Gmail. 
     * Once the Gmail login page loads, the test will log into Gmail with a test account. 
     * Once logged in, the test will verify that the login failed by verifying that the wrong name 
     * and email of test user was used. 
     */
	public static boolean executeTest()
	{
		String email = "xxxtest825@gmail.com";
		String password = "RodeToSun123";
		String wrongEmail = "xxxtest@gmail.com";
		String wrongName = "Test Jackson";
		
		WebDriver driver = new FirefoxDriver();
    	GmailLoginPage glp = new GmailLoginPage(driver);
    	GmailEmailPage gep = glp.loginToGmail(email, password);
    	
    	boolean right = gep.verifyLoginIsSuccessful(wrongEmail, wrongName);
    	
    	if(right)
    		System.out.println("Gmail Wrong Name Test - Login successful and correct: Test Failed");
    	else System.out.println("Gmail Wrong Name Test - Login failed: Test Successful");
    	
    	gep.closeBrowser();
    	
    	return right;
	}
	
    public static void main( String[] args )
    {
    	executeTest();
    }
}
