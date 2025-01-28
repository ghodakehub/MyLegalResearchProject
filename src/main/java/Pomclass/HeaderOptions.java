package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.SwitchWindow;

public class HeaderOptions extends BasePage1 {

	public HeaderOptions(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	
	
	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[2]/a") ///company
	private WebElement company;

	@FindBy(xpath = "/html/body/div[3]/main/a[3]/button")

	private WebElement latestlegalnewsbtn;

	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[2]/ul/li[1]/a")
	private WebElement aboutlegitquest;

	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[2]/ul/li[2]/a")
	private WebElement ourteam;
		
	@FindBy(xpath = "/html/body/header/nav/div/div[1]/ul[1]/li[2]/ul/li[3]/a")
	private WebElement career;
	
	@FindBy(xpath="/html/body/header/nav/div/div[1]/ul[1]/li[2]/ul/li[4]/a")
	private WebElement contact;
	

	public void verifyheadersoptions() throws InterruptedException
	{
		latestlegalnewsbtn.click();
		Thread.sleep(3000);
		
		SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
		Thread.sleep(3000);
		
		company.click();
		Thread.sleep(3000);
		
		aboutlegitquest.click();
		Thread.sleep(3000);
		
		company.click();
		Thread.sleep(3000);
		
		ourteam.click();
		Thread.sleep(3000);
		
		company.click();
		Thread.sleep(3000);
		
		career.click();
		Thread.sleep(3000);
		
		company.click();
		Thread.sleep(3000);
		
		
		contact.click();
		Thread.sleep(3000);
	}

}
