package nd.java.mlbtest.pages.gmail;

import org.openqa.selenium.WebDriver;

import nd.java.mlbtest.pages.BasePage;

public class GmailEmailPage extends BasePage
{

	public GmailEmailPage(WebDriver wd) {
		super(wd);
	}

	public boolean verifyLoginIsSuccessful(String email, String name)
	{
		waitForAndGetElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span").click();
		waitForAndGetElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]");
		if(findElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[2]")
				.getText().contains(email) 
				&& findElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[1]")
				.getText().contains(name))
			return true;
		else return false;
	}
	
}
