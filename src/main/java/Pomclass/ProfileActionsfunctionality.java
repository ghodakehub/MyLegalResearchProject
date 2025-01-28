package Pomclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;

public class ProfileActionsfunctionality extends BasePage1 {

	public ProfileActionsfunctionality(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	@FindBy(xpath = "//*[@id=\"navbarsExampleDefault\"]/ul/li/a")
	private WebElement profilename;                 
	
	@FindBy(xpath = "//a[text()='Profile']")        
	private WebElement profile;
	
	@FindBy(xpath = "(//a[@title='Rename search history'])[1]")     //update or rename searchhistory of user   
	private WebElement renamesearchhistorybtn;
	
	
	@FindBy(xpath = "//input[@id='editSearchTextarea']")
	private WebElement searchtext;                   //here enter rename text
	
	@FindBy(xpath = "//*[@id=\"editSearchModel\"]/div/div/div[3]/button[2]")  //after enter text update this text
	private WebElement updatebtn;                 
	
	@FindBy(xpath = "//span[@id='successupdatemessage']")
	private WebElement successfulupdatemsg;   
	
	@FindBy(xpath = "//*[@id=\"editSearchModel\"]/div/div/div[3]/button[1]")
	private WebElement closebtn;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[2]/td[4]/a[3]/i")
	private WebElement sharesearchhistoryarrowbtn;
	
	@FindBy(xpath = "//input[@id='sharesavedhistory_user_email']")
	private WebElement entermailid;
	
	@FindBy(xpath = "//button[@id='share_saved_history_btn']")  // after sharebtn the alert pop is there
	private WebElement sharebtn;
	

	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[4]/a[2]/i")
	private WebElement deletebtn;
	
	@FindBy(xpath = "//*[@id=\"deletesearchmodal\"]/div/div/div[3]/button[2]")
	private WebElement deletebtnondeletepop;

	
	@FindBy(xpath = "/html/body/main/section/div/div/div/div/div/section/div/div/nav/ul/li[2]/a")
	private WebElement pageno2;
	
	@FindBy(xpath = "(//ul[@class='pagination justify-content-center'])//li[3]")
	private WebElement pageno3;
	
	@FindBy(xpath = "(//ul[@class='pagination justify-content-center'])//li[4]")
	private WebElement pageno4;
	
	@FindBy(xpath = "/html/body/main/section/div/div/div/div/div/section/div/div/nav/ul/li[12]/a/span[1]")
	private WebElement next;
	
	@FindBy(xpath = "/html/body/main/section/div/div/div/div/div/section/div/div/nav/ul/li[13]/a/span[1]")
	private WebElement oldest;
	
	public void verifyprofileactions(WebDriver driver) throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		act.moveToElement( profilename).perform();
		act.click().perform();
		profile.click();
		Thread.sleep(2000);
		
		renamesearchhistorybtn.click();
		Thread.sleep(2000);

		searchtext.clear();
		Thread.sleep(2000);

		searchtext.sendKeys("Test1 ");
		Thread.sleep(2000);
		
		updatebtn.click();
		Thread.sleep(2000);
		
	//	String msg = successfulupdatemsg.getText();
	//	System.out.println(" Successful Message after rename the search history:" +msg);
	//	Thread.sleep(2000);
		
	//	closebtn.click();
		//Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) BaseLib.driver;
		js1.executeScript("arguments[0].scrollIntoView(true);", sharesearchhistoryarrowbtn);
		Thread.sleep(3000);
		sharesearchhistoryarrowbtn.click();
		
		entermailid.sendKeys("ghodake6896@gmail.com");
		Thread.sleep(2000);
				
		sharebtn.click();
		Thread.sleep(2000);
		Alert alt= driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) BaseLib.driver;
		js2.executeScript("arguments[0].scrollIntoView(true);", deletebtn);
		Thread.sleep(3000);
		deletebtn.click();
		
		JavascriptExecutor js31 = (JavascriptExecutor) BaseLib.driver;
		js31.executeScript("arguments[0].scrollIntoView(true);", deletebtnondeletepop);
		Thread.sleep(3000);
		deletebtnondeletepop.click();
		
		try {
		JavascriptExecutor js3 = (JavascriptExecutor) BaseLib.driver;
		js3.executeScript("arguments[0].scrollIntoView(true);", pageno2);
		pageno2.click();
		Thread.sleep(3000);
	}
		
		catch(StaleElementReferenceException e) {
			pageno2.click();
			Thread.sleep(3000);
		}
		JavascriptExecutor js4 = (JavascriptExecutor) BaseLib.driver;
		js4.executeScript("arguments[0].scrollIntoView(true);", pageno3);
		pageno3.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js5 = (JavascriptExecutor) BaseLib.driver;
		js5.executeScript("arguments[0].scrollIntoView(true);", pageno4);
		pageno4.click();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js6 = (JavascriptExecutor) BaseLib.driver;
		js6.executeScript("arguments[0].scrollIntoView(true);", next);
		next.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js7 = (JavascriptExecutor) BaseLib.driver;
		js7.executeScript("arguments[0].scrollIntoView(true);", oldest);
		oldest.click();
		Thread.sleep(3000); 
	}	
}
