package nd.java.mlbtest.pages.gmail;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class GmailLoginPage extends BasePage
{

	//Encapsulation of Gmail login page
	public GmailLoginPage(WebDriver wd) 
	{
		super(wd);
		goTo("http://gmail.com");
	}

	//Logs into Gmail using the given credentials of email and password
	public GmailEmailPage loginToGmail(String email, String password)
	{
		waitForAndGetElementByXPath("//*[@id='Email']").sendKeys(email);
		findElementByXPath("//*[@id='next']").click();
		waitForAndGetElementByXPath("//*[@id='Passwd']").sendKeys(password);
		findElementByXPath("//*[@id='signIn']").click();
		return new GmailEmailPage(getDriver());
	}
	
	//Tries to login to Gmail with an unrecognizable email
	public boolean enterUnrecognizedEmail(String email)
	{
		findElementByXPath("//*[@id='Email']").sendKeys(email);
		findElementByXPath("//*[@id='next']").click();
		if(waitForAndGetElementByXPath("//*[@id='errormsg_0_Email']").getText()
				.contains("Sorry, Google doesn't recognize that email"))
			return true;
		else return false;
	}
}
