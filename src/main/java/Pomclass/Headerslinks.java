package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.SwitchWindow;

public class Headerslinks extends BasePage1 {

	public Headerslinks(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	

	
	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[3]/a") ///company
	private WebElement product;

	@FindBy(xpath = "/html/body/div[3]/main/a[3]/button")

	private WebElement latestlegalnewsbtn;

	@FindBy(xpath = "(//a[text()='Legiteye'])[1]")
	private WebElement legiteye;

	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[3]/ul/li[2]/a")
	private WebElement punjabharyana;
		
	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[4]/a")
	private WebElement pricing;
	
	@FindBy(xpath="/html/body/header/nav/div/div[1]/ul[1]/li[5]/a")
	private WebElement latestcase;
	

	public void verifyheaderslinks(WebDriver driver) throws InterruptedException
	{
		latestlegalnewsbtn.click();
		Thread.sleep(3000);
		
		SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
		Thread.sleep(3000);
		
		product.click();
		Thread.sleep(3000);
		
		legiteye.click();
		Thread.sleep(3000);
		
		
		SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
		Thread.sleep(3000);

		product.click();
		Thread.sleep(3000);
		
		punjabharyana.click();
		Thread.sleep(3000);
				
		pricing.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		latestcase.click();
		Thread.sleep(3000);
		
		
		
	}
}
