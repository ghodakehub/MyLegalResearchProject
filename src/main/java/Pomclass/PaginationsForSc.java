package Pomclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import UtilityClass.Library;
import generic.BaseLib;

public class PaginationsForSc extends BasePage1 {

	public PaginationsForSc(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	
	@FindBy(xpath = "//input[@id='search']") // Main Search Box
	private WebElement searchbox;

	@FindBy(xpath = "//div[@class='search-btn']") // Main Search Icon (Button)
	private WebElement SearchButton;

	@FindBy(xpath = "//*[@id=\"select-dropdown\"]/div/div/ul/li[1]/div/div/label/span") // All
	private WebElement Allmenu;

	@FindBy(xpath = "//*[@id=\"bycourt\"]/li[1]/div/label/span") // supreme court
	private WebElement supremecourt;

	@FindBy(xpath = "//*[@id=\"benchresult\"]/label") // by bench filter
	private WebElement bybench;

	@FindBy(xpath = "//*[@id=\"bybench\"]/li[1]/div/label") // by bench filter two
	private WebElement bybenchtwo;

	@FindBy(xpath = "//*[@id=\"yearfilter\"]/label") // by year filter
	private WebElement byyear;

	@FindBy(xpath = "//*[@id=\"byyear\"]/li[1]/div/label/span") // by year filter eight 2010-2019
	private WebElement byyearone;

	@FindBy(xpath = "//*[@id=\"decision\"]/label") // by disposition filter
	private WebElement bydisposition;

	@FindBy(xpath = "//*[@id=\"bydisposition\"]/li[1]/div/label") // by disposition filter one
	private WebElement bydispositionallow;

	@FindBy(xpath = "//*[@id=\"paginationbottom\"]/li[4]/a") // page no 2 
	private WebElement page2;
	
	@FindBy(xpath = "//*[@id=\"paginationbottom\"]/li[5]/a") // page no 3
	private WebElement page3;

	@FindBy(xpath = "//*[@id=\"paginationbottom\"]/li[6]/a") // page no 3
	private WebElement page4;

	
	@FindBy(xpath = "//*[@id=\"paginationbottom\"]/li[7]/a") // page no 3
	private WebElement page5;
	
	
	@FindBy(xpath = "//*[@id=\"paginationbottom\"]/li[8]/a") // page no next button
	private WebElement Next;

	@FindBy(xpath = "//*[@id=\"paginationbottom\"]/li[9]/a") // page no last button
	private WebElement Last;


// Actions 	
	public void click(WebDriver driver) throws InterruptedException {

     Library.sendKeys(driver,searchbox , "enter ram text", "ram");
	Thread.sleep(3000);
	Library.click(driver, SearchButton, "click on searchbtn");
	Thread.sleep(3000);

	// Without Filter Pagination

	
	JavascriptExecutor js = (JavascriptExecutor) BaseLib.driver;
	js.executeScript("arguments[0].scrollIntoView(true);", page2);
	page2.click();
	Thread.sleep(4000);

	JavascriptExecutor js1 = (JavascriptExecutor) BaseLib.driver;
	js1.executeScript("arguments[0].scrollIntoView(true);", page2);
	page3.click();

	Thread.sleep(4000);
	JavascriptExecutor js2 = (JavascriptExecutor) BaseLib.driver;
	js2.executeScript("arguments[0].scrollIntoView(true);", page2);
	page5.click();

	
	

	// With Filter Pagination

	Thread.sleep(3000);
	supremecourt.click();
	Thread.sleep(4000);

	JavascriptExecutor js8 = (JavascriptExecutor) BaseLib.driver;
	js8.executeScript("arguments[0].scrollIntoView(true);", page2);
	page2.click();

	
	Thread.sleep(4000);
	JavascriptExecutor js10 = (JavascriptExecutor) BaseLib.driver;
	js10.executeScript("arguments[0].scrollIntoView(true);", page3);
	page3.click(); 
	
	//Thread.sleep(4000);
	//JavascriptExecutor js9 = (JavascriptExecutor) BaseLib.driver;
	//js9.executeScript("arguments[0].scrollIntoView(true);", Next);
	//Next.click();


	/*Thread.sleep(4000);
	JavascriptExecutor js12 = (JavascriptExecutor) BaseLib.driver;
	js12.executeScript("arguments[0].scrollIntoView(true);", page2);
	Thread.sleep(3000);
	page2.click();
	Thread.sleep(3000);*/


		
	
	

}
}
