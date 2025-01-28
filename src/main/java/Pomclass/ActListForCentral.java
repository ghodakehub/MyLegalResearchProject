package Pomclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.Library;
import generic.SwitchWindow;

public class ActListForCentral extends BasePage1 {

	public ActListForCentral(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	@FindBy(xpath = "/html/body/div[3]/main/a[2]/button")
	private WebElement ClickActlistbtn;
	
	@FindBy(xpath = "//*[@id=\"court-tabs\"]/li[2]/a")
	private WebElement ClickOnCentrallist;
	
	@FindBy(xpath = "//*[@id=\"centralActType\"]")
	private WebElement Selecttype;
	
	@FindBy(xpath = "//div[@id='alphaMerge']")
	private List < WebElement> selectbuttononebyone;
	
	@FindBy(xpath="//*[@id=\"alphaMerge\"]/button[2]")
	private WebElement clickbutton2;
	
	
	@FindBy(xpath="//*[@id=\"alphaMerge\"]/button[3]")
	private WebElement clickbutton3;
	
	@FindBy(xpath="(//div[@id='alphaMerge']//button[text()='D'])")
	private WebElement clickbutton4;
	
	@FindBy(xpath="//*[@id=\"alphaMerge\"]/button[5]")
	private WebElement clickbutton5;
	
	@FindBy(xpath="//*[@id=\"result\"]/tr[3]/td[1]/a")
	private WebElement clickononeactlink;
	
	@FindBy(xpath = "//a[@class='idraf-link'] ") 
	private List< WebElement> SelectsSectionuOption ;
	
	@FindBy(xpath="/html/body/div[2]/main/section/div/div[2]/div[1]/div[2]/div[3]/button")
	private WebElement pdfdwn;
	
	
	public void Selecttypeforcentaral(WebDriver driver) throws InterruptedException
	{
Library.click(driver,ClickActlistbtn , "Clicked on ClickActlistbtn");
 		
		Library.threadSleep(2000);
		
		
Library.click(driver,ClickOnCentrallist , "Clicked on central button");
 		
		Library.threadSleep(2000);
		Select optact= new Select(Selecttype);
		List<WebElement>alloptionact=optact.getOptions();
		for(WebElement actslist:alloptionact)
		{
			if(actslist.getText().equals("Rules"))
			{
				actslist.click();
				break;
			}
		}	
		
	}
	
	
	public void handlebuttons(WebDriver driver) throws InterruptedException
	{
		
		 clickbutton2.click();
		 Thread.sleep(1000);
		 clickbutton3.click();
		 Thread.sleep(1000);
		 clickbutton4.click();
		 Thread.sleep(1000);
		 clickbutton5.click();
		 Thread.sleep(1000);

		 try
		 {
		
		 clickononeactlink.click();
		 }catch(StaleElementReferenceException e)
		 {
		   WebElement ele = driver.findElement(By.xpath("//*[@id=\"result\"]/tr[3]/td[1]/a"));
		   ele.click();
		 }
			
		 Thread.sleep(1000);
		 
			SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
			Thread.sleep(3000);
			
			for(int i=1; i<=5;i++)
			{
				
			WebElement	rulesoptions=driver.findElement(By.xpath("(//a[@class='idraf-link'])["+ i +"]"));
			rulesoptions.click();
			Thread.sleep(2000);
				
			}
			
			Thread.sleep(2000);
			pdfdwn.click();
	}
	
	}
