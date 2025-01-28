package Pomclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.Library;
import generic.SwitchWindow;

public class ActListCentralTimelineAct extends BasePage1 {

	public ActListCentralTimelineAct(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	@FindBy(xpath = "/html/body/div[3]/main/a[2]/button")
	private WebElement ClickActlistbtn;
	
	@FindBy(xpath = "//*[@id=\"court-tabs\"]/li[2]/a")
	private WebElement ClickOnCentrallist;
	
	@FindBy(xpath = "//*[@id=\"centralActType\"]")
	private WebElement Selecttype;
	
	
	@FindBy(xpath="//*[@id=\"alphaMerge\"]/button[2]")
	private WebElement clickbutton2;
	
	
	@FindBy(xpath="//*[@id=\"alphaMerge\"]/button[3]")
	private WebElement clickbutton3;
	
	@FindBy(linkText="CABLE TELEVISION NETWORKS (REGULATION) ACT, 1995")
	private WebElement clickonactlink;
	
	@FindBy(xpath = "//a[@class='idraf-link'] ") 
	private List< WebElement> SelectsSectionuOption ;

	
	@FindBy(xpath="//*[@id=\"amendingAct\"]/a")
	private WebElement ClikOnAmendingAct;
	
	@FindBy(xpath="//*[@id=\"getAmendingActData\"]/div[4]/div/a")
	private WebElement ClikconAmendingactlink;
	
	@FindBy(xpath="//*[@id=\"rule\"]/a")
	private WebElement ClikOnRules;
	
	@FindBy(xpath="//*[@id=\"getAmendingRuleData\"]/div[1]/div/a")
	private WebElement ClikconRuleactlink;
	
	

	@FindBy(xpath="//*[@id=\"timeline-check-act\"]")
	private WebElement ClikcOnTimeLine;
	
	@FindBy(xpath="//*[@id=\"sidebarLinks\"]/div[2]/li[1]/a")
	private WebElement ClikcOnsectionOfTimeline;
	
	@FindBy(xpath="//*[@id=\"nav-profile-tab\"]")
	private WebElement ClikcOn200button;
	
	@FindBy(xpath="//*[@id=\"tab2000\"]/div[2]/div/div[2]/table/thead/tr/th[2]/div/button/i")
	private WebElement ClikcOn200buttonexpand;
	
	@FindBy(xpath="//*[@id=\"tab2000\"]/div[2]/div/div[2]/table/tbody/tr/td[2]/div/button/i")
	private WebElement ClickOnDeletebtn;
	
	
	
	
	public void VerifyCentralAct(WebDriver driver) throws InterruptedException
	{
		Library.threadSleep(3000);
		Library.click(driver,ClickActlistbtn , "Clicked on ClickActlistbtn");
 		test.info("click on Actlist button");
		//Library.threadSleep(2000);
		
		
Library.click(driver,ClickOnCentrallist , "Clicked on ClickActlistbtn");
 		
		Library.threadSleep(2000);
		
		Select optact= new Select(Selecttype);
		List<WebElement>alloptionact=optact.getOptions();
		for(WebElement actslist:alloptionact)
		{
			if(actslist.getText().equals("Act"))
			{
				actslist.click();
				break;
			}
		}	
	}
		public void VerifyAmendemntTimeline(WebDriver driver) throws InterruptedException
		{
			
			 clickbutton2.click();
			 test.info("click on Button 2");
			 Thread.sleep(3000);
			 clickbutton3.click();
			 test.info("click on button3 ");
			 Thread.sleep(2000);
			  clickonactlink.click();
			  test.info("click on Actlist button");
			
			 
			 Thread.sleep(3000);

				SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
				Thread.sleep(3000);
				
			 for(int i=1; i<=5;i++)
				{
					
				WebElement	rulesoptions=driver.findElement(By.xpath("(//a[@class='idraf-link'])["+ i +"]"));
				rulesoptions.click();
				Thread.sleep(2000);
					
				}
			 
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
				Thread.sleep(3000);
			 ClikOnAmendingAct.click();
			 Thread.sleep(1000);
			 
			 ClikconAmendingactlink.click();
			 Thread.sleep(2000);
			 
			 SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
				Thread.sleep(3000);
				ClikOnRules.click();
				Thread.sleep(2000);
				ClikconRuleactlink.click();
				
				 SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
					Thread.sleep(3000);

					ClikcOnTimeLine.click();
					Thread.sleep(2000);
					
					ClikcOnsectionOfTimeline.click();
					Thread.sleep(2000);

					ClikcOn200button.click();
					
					Thread.sleep(2000);

					ClikcOn200buttonexpand.click();
					Thread.sleep(2000);
					
					ClickOnDeletebtn.click();

		}
		
}
