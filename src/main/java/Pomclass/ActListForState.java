package Pomclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.Library;

public class ActListForState extends BasePage1 {

	public ActListForState(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	
	@FindBy(xpath = "/html/body/div[3]/main/a[2]/button")
	private WebElement ClickActlistbtn;
	
	
	@FindBy(xpath = "//*[@id=\"recordType\"]")
	private WebElement ClickType;
	
	@FindBy(xpath = "//*[@id=\"actType\"]")
	private WebElement SelectState;
	
	@FindBy(xpath="//a[@class='page-link']")
	private WebElement pagination;
	
	@FindBy(xpath="//a[@class='page-link']")
	private List< WebElement> page;
	

	
	public void typeact(WebDriver driver) throws InterruptedException
	{
Library.click(driver,ClickActlistbtn , "Clicked on ClickActlistbtn");
 		
		Library.threadSleep(2000);
		
		Select optact= new Select(ClickType);
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
	
		public void stateselect()
		{
			Select optact1= new Select( SelectState);
			List<WebElement>alloptionact=optact1.getOptions();
			for(WebElement actslist1:alloptionact)
			{
				if(actslist1.getText().equals("DELHI"))
				{
					actslist1.click();
					break;
				}
			}
		
		}
		
	

	public void pagination (WebDriver driver) throws InterruptedException
	
	{
		
		JavascriptExecutor js1 = (JavascriptExecutor) BaseLib.driver;
		js1.executeScript("arguments[0].scrollIntoView(true);",pagination );
		Thread.sleep(3000);
		
		for(int i=3; i<=6;i++)
		{
			
		WebElement	rulesoptions1=driver.findElement(By.xpath("(//a[@class='page-link'])["+ i +"]"));
		rulesoptions1.click();
		Thread.sleep(3000);
		
	
			
		}
		
	
	}
		
		
		
		}	
	



