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
import generic.SwitchWindow;

public class ActListPdfDownload extends BasePage1 {

	public ActListPdfDownload(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	

	
	@FindBy(xpath = "/html/body/div[3]/main/a[2]/button")
	private WebElement ClickActlistbtn;
	
	
	@FindBy(xpath = "//*[@id=\"recordType\"]")
	private WebElement ClickType;
	
	@FindBy(xpath = "//*[@id=\"actType\"]")
	private WebElement SelectState;
	
	@FindBy(xpath = "//*[@id=\"result\"]/tr[1]/td[1]/a")
	private WebElement SelectOnelinkact ;
	
	@FindBy(xpath = "//a[@class='idraf-link'] ") 
	private List< WebElement> SelectsRulesOption ;
	
	
	@FindBy(xpath = "/html/body/div[2]/main/section/div/div[2]/div[1]/div[2]/div[3]/button")
	private WebElement Downloadpdf;
	
	
		
	public void SelectType() throws InterruptedException
	{
		ClickActlistbtn.click();
		Thread.sleep(500);
		
		Select optact= new Select(ClickType);
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
	
		public void SelectState()
		{
			Select optact1= new Select( SelectState);
			List<WebElement>alloptionact=optact1.getOptions();
			for(WebElement actslist1:alloptionact)
			{
				if(actslist1.getText().equals("GUJARAT"))
				{
					actslist1.click();
					break;
				}

			}	
			
		}
		
		public void DwnPdf(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(500);
			SelectOnelinkact.click();
	
			Thread.sleep(500);

			SwitchWindow.switchWindowByIndex(BaseLib.driver, 2);
			Thread.sleep(3000);
			
			
			
			for(int i=1; i<=SelectsRulesOption.size();i++)
			{
				
			WebElement	rulesoptions=driver.findElement(By.xpath("(//a[@class='idraf-link'])["+ i +"]"));
			rulesoptions.click();
			Thread.sleep(2000);
				
			}
			
			Thread.sleep(2000);

			
			Downloadpdf.click();
			
		
		}	
			
			
	
		
		
	
}
