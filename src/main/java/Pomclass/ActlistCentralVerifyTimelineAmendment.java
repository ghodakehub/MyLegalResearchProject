package Pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import generic.BaseLib;
import generic.Library;
import generic.SwitchWindow;

public class ActlistCentralVerifyTimelineAmendment extends Library{

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
	
	
	@FindBy(xpath="//*[@id=\"amendingAct\"]/a")
	private WebElement ClikOnAmendingAct;
	
	@FindBy(xpath="//*[@id=\"getAmendingActData\"]/div[4]/div/a")
	private WebElement ClikconAmendingactlink;
	
	@FindBy(xpath="//*[@id=\"rule\"]/a")
	private WebElement ClikOnRules;
	
	@FindBy(xpath="//*[@id=\"getAmendingRuleData\"]/div[1]/div/a")
	private WebElement ClikconRuleactlink;
	
	public ActlistCentralVerifyTimelineAmendment (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void VerifyCentralAct(WebDriver driver) throws InterruptedException

	{
		
		Library.threadSleep(2000);
         Library.click(driver,ClickActlistbtn , "Clicked on ClickActlistbtn");
 		
		Library.threadSleep(2000);
		
		
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
		public void VerifyAmendemntTimeline() throws InterruptedException
		{
			
			 clickbutton2.click();
			 Thread.sleep(1000);
			 clickbutton3.click();
			 Thread.sleep(1000);
			 clickonactlink.click();
			
				
			 Thread.sleep(1000);
			 
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
				Thread.sleep(3000);
			 ClikOnAmendingAct.click();
			 Thread.sleep(1000);
			 
			 ClikconAmendingactlink.click();
			 Thread.sleep(1000);
			 
				SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
				Thread.sleep(3000);
				ClikOnRules.click();
				Thread.sleep(2000);
				ClikconRuleactlink.click();

		}
		
	}

