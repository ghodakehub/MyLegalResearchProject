package Pomclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class ActListPaginatinAndSearchText extends BasePage1 {

	public ActListPaginatinAndSearchText(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	
	@FindBy(xpath = "/html/body/div[3]/main/a[2]/button")
	private WebElement ClickActlistbtn;
	
	@FindBy(xpath = "//*[@id=\"court-tabs\"]/li[2]/a")
	private WebElement ClickOnCentrallist;
	
	@FindBy(xpath = "//*[@id=\"centralActType\"]")
	private WebElement Selecttype;
	
	@FindBy(xpath="//*[@id=\"paginationbottom\"]/li[3]")
	private WebElement page1;
	
	@FindBy(xpath="//*[@id=\"paginationbottom\"]/li[4]")
	private WebElement page2;
	
	@FindBy(xpath="//*[@id=\"paginationbottom\"]/li[5]/a")
	private WebElement page3;
	
	@FindBy(xpath="//input[@id='myInput']")
	private WebElement SearchTab;
	
	@FindBy(xpath="//*[@id=\"result\"]/tr[1]/td[1]/a")
	private WebElement clcikonsearchact;
	
	@FindBy(xpath="/html/body/div[2]/main/section/div/div[2]/div[1]/div[2]/div/button")
	private WebElement clcikonpdf;
	
	

	
	//Actions
	
	public void Selecttypeforcentaral() throws InterruptedException
	{
		try {
		ClickActlistbtn.click();
		}catch(NoSuchElementException e)
		{
			ClickActlistbtn.click();
		}
		Thread.sleep(1000);
		ClickOnCentrallist.click();
		Thread.sleep(2000);
		
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
	
	public void VeriFyPages(WebDriver driver) throws InterruptedException
	{
		page1.click();
		Thread.sleep(2000);
		
		page2.click();
		Thread.sleep(2000);
		
		page3.click();
		Thread.sleep(2000);
		
		SearchTab.click();
		Thread.sleep(2000);
		
		SearchTab.sendKeys("EAR DRUMS AND EAR BONES ");
		
		SearchTab.click();
		Thread.sleep(1000);
		
		try {
		clcikonsearchact.click();
		}
		
		 catch(StaleElementReferenceException e)
		 {
		   WebElement ele = driver.findElement(By.xpath("//*[@id=\"result\"]/tr[1]/td[1]/a"));
		   ele.click();
		 }
		Thread.sleep(1000);
		clcikonsearchact.click();
	}
		
		
		
	}
	
	
	

