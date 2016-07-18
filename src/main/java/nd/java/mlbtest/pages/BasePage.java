package nd.java.mlbtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	public BasePage(WebDriver wd)
	{
		setDriver(wd);
		wait = new WebDriverWait(getDriver(), 20);
	}
	
	public void goTo(String url)
	{
		getDriver().get(url);
		
	}
	
	protected WebElement findElementByXPath(String xpath)
	{
		return getDriver().findElement(By.xpath(xpath));
	}

	protected WebElement waitForAndGetElementByXPath(String xpath)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	protected WebElement findElementByClass(String ca)
	{
		return getDriver().findElement(By.className(ca));
	}

	protected WebElement waitForAndGetElementByClass(String ca)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(ca)));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
