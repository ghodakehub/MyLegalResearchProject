package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.SwitchWindow;

public class LatestCaseofSupremeCourt extends BasePage1 {

	public LatestCaseofSupremeCourt(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	@FindBy (xpath="/html/body/div[3]/main/a[1]/button") private WebElement latestcasebtn;
	@FindBy (xpath="//select[@id='date_filter']") private WebElement datefilterdropdown;
	@FindBy (xpath="//select[@id='sortBy']") private WebElement sortbydropdown;
	@FindBy(xpath="//*[@id=\"result\"]/div[2]/div[1]/a") private WebElement clcikonnews;
	@FindBy(xpath="//*[@id=\"court1\"]")private WebElement supremecourtcasetotal;
	@FindBy(xpath="//*[@id=\"court2\"]") private WebElement totalNoOFhighcourtcases;
	@FindBy(xpath="//*[@id=\"court3\"]") private WebElement totalNoOFtribunalcases;
	
	
	public void latestcaseverify(WebDriver driver) throws InterruptedException
	{
		latestcasebtn.click();
		Thread.sleep(2000);
		
		
		String title = driver.getTitle();
		System.out.println("Title of page :"+title);
		
		Select option= new Select(datefilterdropdown);
		option.selectByValue("15");
		
		Reporter.log("Total no of  Supremecourt , Highcourt , Tribunal:");
		String totalnocase = supremecourtcasetotal.getText();
		System.out.println("Total Number of supremeCourtCases = 1:"+totalnocase);
		
		String highcourtcase1 = totalNoOFhighcourtcases.getText();
		System.out.println(highcourtcase1);
		
		String tribunal = totalNoOFtribunalcases.getText();
		System.out.println(tribunal);
		
		Thread.sleep(4000);
		clcikonnews.click();
		// Window switch
		SwitchWindow.switchWindowByIndex(BaseLib.driver, 1);
		Thread.sleep(3000);

		option.selectByValue("30");
		String totalnocase1 = supremecourtcasetotal.getText();
		System.out.println("2:"+totalnocase1);
		
		String highcourtcase2 = totalNoOFhighcourtcases.getText();
		System.out.println(highcourtcase2);
		
		String tribunal2 = totalNoOFtribunalcases.getText();
		System.out.println(tribunal2);
		
		
		Thread.sleep(4000);
		option.selectByValue("60");
		String totalnocase2 = supremecourtcasetotal.getText();
		System.out.println("3:"+totalnocase2);
		
		String highcourt3 = totalNoOFhighcourtcases.getText();
		System.out.println(highcourt3);
		String tribunal3 = totalNoOFtribunalcases.getText();
		System.out.println(tribunal3);
		
		Thread.sleep(4000);
		option.selectByValue("7");
		Thread.sleep(4000);
		
	}
	public void latestcaseverify1() throws InterruptedException
	
	{
		Thread.sleep(2000);
		sortbydropdown.click();
		
		Select sort= new Select(sortbydropdown);
		sort.selectByVisibleText("Newest");
		Thread.sleep(4000);
		sort.selectByVisibleText("Oldest");
		Thread.sleep(4000);
		sort.selectByVisibleText("Random");
		
	}
	
	

}
