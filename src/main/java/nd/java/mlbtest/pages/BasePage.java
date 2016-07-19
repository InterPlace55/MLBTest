package nd.java.mlbtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	private WebDriver driver;	//Selenium WebDriver
	private WebDriverWait wait;	//Selenium WebDriver wait object
	
	//Encapsulation of the base web page
	public BasePage(WebDriver wd)
	{
		setDriver(wd);
		wait = new WebDriverWait(getDriver(), 20);
	}
	
	//Go to the specific URL given
	public void goTo(String url)
	{
		driver.get(url);
	}
	
	//Close the browser window
	public void closeBrowser()
	{
		driver.close();
	}
	
	//Finds an element via its xPath
	protected WebElement findElementByXPath(String xpath)
	{
		return driver.findElement(By.xpath(xpath));
	}

	//Waits for an element given by its xPath and returns it
	protected WebElement waitForAndGetElementByXPath(String xpath)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	//Getter and setter for the driver
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
