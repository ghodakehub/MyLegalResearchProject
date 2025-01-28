package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import UtilityClass.Library;
import generic.BaseLib;
import generic.SwitchWindow;

public class BlogPaginations extends BasePage1 {

	public BlogPaginations(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	
	@FindBy(linkText = "Blog")   //blog contact footer option verify pages
	private WebElement blog;
	
	@FindBy(xpath = "/html/body/main/section[2]/div/div/ul/li[3]/a")
	private WebElement page2;
	
	@FindBy(xpath = "/html/body/main/section[2]/div/div/ul/li[4]/a")
	private WebElement page3;
	
	@FindBy(xpath = "/html/body/main/section[2]/div/div/ul/li[5]/a")
	private WebElement page4;
	
	@FindBy(xpath = "/html/body/main/section[2]/div/div/ul/li[6]/a")
	private WebElement page5;
	
	@FindBy(xpath = "/html/body/main/section[2]/div/div/ul/li[7]/a")
	private WebElement page6;
	
	@FindBy(xpath = "/html/body/main/section[2]/div/div/ul/li[8]/a")
	private WebElement page7;
	

	@FindBy(linkText = "Environment Laws In India")   
	private WebElement bloglink;
	
	@FindBy(linkText = " Wildlife Protection Act 1972")   
	private WebElement bloglink1;
	
	
	
	
	public void paginations(WebDriver driver) throws InterruptedException
	{
		
		Library.click(driver, blog, "click on blog");
		Library.threadSleep(3000);
		
		Library.click(driver, page2, "click on page2");
		Library.threadSleep(3000);

		
		Library.click(driver, page3, "click on page3");
		Library.threadSleep(3000);

		Library.click(driver, page4, "click on page4");
		Library.threadSleep(3000);

		Library.click(driver, page5, "click on page5");
		Library.threadSleep(3000);
		
		Library.click(driver, page6, "click on page6");
		Library.threadSleep(3000);
		
		Library.click(driver, bloglink, "click on bloglink");
		Library.threadSleep(3000);
		
		SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
		Thread.sleep(3000);
		
		Library.click(driver, bloglink1, "click on bloglink1");
		Library.threadSleep(3000);



	}

	
	
	
}
