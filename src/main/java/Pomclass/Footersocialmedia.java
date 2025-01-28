package Pomclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.SwitchWindow;

public class Footersocialmedia extends BasePage1 {

	public Footersocialmedia(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	
	@FindBy(xpath = "//ul[@class='social-icons ml-auto mb-0']/li[1]")
	private WebElement facebook;
	
	@FindBy(xpath = "//*[@id=\"mount_0_0_B2\"]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/i")
	private WebElement seemorecanclebtn;      //facebook  canclebtn

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[3]/div/ul/li[2]/a/i")
	private WebElement twitter;
	
	@FindBy(xpath ="/html/body/div[3]/footer/div/div/div[3]/div/ul/li[3]/a/i")
	private WebElement linkedin;
	
	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[3]/div/ul/li[4]/a/i")
	private WebElement instagram;
	
	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[3]/div/ul/li[5]/a/i")
	private WebElement youtube;
	
			
			public void verifysocialmedialinks(WebDriver driver) throws InterruptedException
			
			
			{
				
				
				facebook.click();
				Thread.sleep(3000);
				
				//seemorecanclebtn.click();
			//	Thread.sleep(3000);
				
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 1);
				Thread.sleep(3000);
				
				
				JavascriptExecutor js = (JavascriptExecutor) BaseLib.driver ;
				js.executeScript("arguments[0].scrollIntoView(true);", twitter);
				twitter.click();
				Thread.sleep(3000);
				
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 1);
				Thread.sleep(3000);
				
				
				JavascriptExecutor js1 = (JavascriptExecutor) BaseLib.driver ;
				js1.executeScript("arguments[0].scrollIntoView(true);", linkedin);
				linkedin.click();
				Thread.sleep(3000);
								
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 1);
				Thread.sleep(3000);	
				
				JavascriptExecutor js2 = (JavascriptExecutor) BaseLib.driver ;
				js2.executeScript("arguments[0].scrollIntoView(true);", instagram);
				instagram.click();
				Thread.sleep(3000);
				
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 1);
				Thread.sleep(3000);
				
				JavascriptExecutor js3 = (JavascriptExecutor) BaseLib.driver ;
				js3.executeScript("arguments[0].scrollIntoView(true);", youtube);
				youtube.click();
				Thread.sleep(3000);				
				
				
			}

}
