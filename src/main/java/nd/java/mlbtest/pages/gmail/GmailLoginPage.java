package nd.java.mlbtest.pages.gmail;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class GmailLoginPage extends BasePage
{

	public GmailLoginPage(WebDriver wd) 
	{
		super(wd);
		goTo("http://gmail.com");
	}

	public GmailEmailPage loginToGmail(String email, String password)
	{
		waitForAndGetElementByXPath("//*[@id='Email']").sendKeys(email);
		findElementByXPath("//*[@id='next']").click();
		waitForAndGetElementByXPath("//*[@id='Passwd']").sendKeys(password);
		findElementByXPath("//*[@id='signIn']").click();
		return new GmailEmailPage(getDriver());
	}
	
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
