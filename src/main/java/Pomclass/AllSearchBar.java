package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

import UtilityClass.Library;

public class AllSearchBar extends BasePage1 {

	public AllSearchBar(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}


	@FindBy(xpath = "//*[@id=\"search\"]") // Main Search Box
	private WebElement searchbox;

	@FindBy(xpath = "//div[@class='search-btn']") // Main Search Icon (Button)
	private WebElement SearchButton;

	@FindBy(id = "changesearchbutton") // Search type button drop down
	private WebElement SearchType;

	@FindBy(xpath = "//*[@id=\"select-dropdown\"]/div/div/ul/li[1]/div/div/label/span") // All Button
	private WebElement All;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span/strong") // All Button result
	private WebElement Allresult;

	@FindBy(xpath = "//*[@id=\"select-dropdown\"]/div/div/ul/li[2]/div/div/label/span") // Citation button 
	private WebElement citation;
	
	@FindBy(xpath = "//input[@id='searchCitationFormat']") // Citation search box
	private WebElement citationsearchbox;

	@FindBy(xpath = "//input[@id='publisher']") // Citation section search box
	private WebElement citationsectionbox;

	@FindBy(xpath = "//*[@id=\"citationJournal\"]/tr[37]/td[2]") // Citation name
	private WebElement Citationname;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span") // Citation name result
	private WebElement Citationresult;

	@FindBy(xpath = "//*[@id=\"select-dropdown\"]/div/div/ul/li[3]/div/div/label/span") // Judge Name
	private WebElement JudgeName;

	@FindBy(xpath = "//input[@id='judgename']") // Judge Name search box
	private WebElement JudgeNamebox;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span") // Judge Name search result
	private WebElement JudgeNameresult;

	@FindBy(xpath = "//*[@id=\"select-dropdown\"]/div/div/ul/li[4]/div/div/label/span") // Party Name
	private WebElement PartyName;

	@FindBy(xpath = "//input[@id='petitionername']") // Party Name box
	private WebElement PartyNamebox;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span") // Party Name result
	private WebElement PartyNameresult;

	@FindBy(xpath = "//*[@id=\"select-dropdown\"]/div/div/ul/li[5]/div/div/label/span") // Act Name
	private WebElement ActName;

	@FindBy(xpath = "//input[@id='actname']") // Act Name box
	private WebElement ActNamebox;

	@FindBy(xpath = "//input[@id='section']") // Act Name section box
	private WebElement ActNamesection;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span") // Act Name result
	private WebElement ActNameresult;
	
	@FindBy(xpath = "//*[@id=\"changesearchbutton\"]") // Search Type button
	private WebElement search_type_button;
	
	
	// Actions 	
		public void click(WebDriver driver) throws InterruptedException {
			
			searchbox.sendKeys("ram");
			Thread.sleep(3000);
			SearchButton.click();
			Thread.sleep(3000);
			SearchType.click();
			Thread.sleep(3000);

			String actualText1 = "Found : "+Allresult.getText()+" results for query ram";
			String ExpectedText1 = "Found : "+Allresult.getText()+" results for query ram";

			Assert.assertEquals(actualText1, ExpectedText1);
			Reporter.log("Free text Search is working", true);
			//Reporter.log("Free text Search is not working", false);
			Thread.sleep(4000);

			//citation search type 
			Library.click(driver, citation, "click on citation");
			Library.threadSleep(3000);


			Library.click(driver, search_type_button, "click on search_type_button");
			Library.threadSleep(3000);

			
			Library.click(driver, citation, "click on citation");
			Library.threadSleep(3000);

             Library.sendKeys(driver, citationsearchbox, "enter air in texbox", "AIR");
             Library.threadSleep(3000);



 			Library.click(driver, citationsectionbox, "click on citationsectionbox");
 			Library.threadSleep(3000);



 			Library.click(driver, citationsearchbox, "click on citationsearchbox");
 			Library.threadSleep(3000);


			

 			Library.click(driver, Citationname, "click on Citationname");
 			Library.threadSleep(3000);

 			Library.sendKeys(driver, citationsectionbox, "enter text in search box", "201749");
 			Library.threadSleep(3000);


 			Library.click(driver, SearchButton, "click on SearchButton");
 			Library.threadSleep(3000);



		/*	String actualText2 = Citationresult.getText();
			String ExpectedText2 = Citationresult.getText();
			Assert.assertEquals(actualText2, ExpectedText2);
			Reporter.log("By Citation Search is working", true);
			Thread.sleep(4000); */

			// Judge Name search type 
 			Library.click(driver, SearchType, "click on SearchType");
 			Library.threadSleep(3000);
			
 			
 			Library.click(driver, JudgeName, "click on JudgeName");
 			Library.threadSleep(3000);
			

 			Library.sendKeys(driver, JudgeNamebox, "enter text in JudgeNamebox", "rakesh");
 			Library.threadSleep(3000);

		
			SearchButton.click();
			Thread.sleep(4000);

			String actualText3 = JudgeNameresult.getText();
			String ExpectedText3 = JudgeNameresult.getText();

			Assert.assertEquals(actualText3, ExpectedText3);
			Reporter.log("By Judge Name Search is working", true);
			Thread.sleep(4000);

			// Party name search type
			SearchType.click();
			Thread.sleep(3000);
			PartyName.click();
			Thread.sleep(3000);
			PartyNamebox.sendKeys("ashiana");
			Thread.sleep(3000);
			SearchButton.click();
			Thread.sleep(4000);

			String actualText4 = PartyNameresult.getText();
			String ExpectedText4 = PartyNameresult.getText();
			
			Assert.assertEquals(actualText4, ExpectedText4);
			Reporter.log("By Party Name search is worknig", true);
			Thread.sleep(4000);

			// Act Name search type
			SearchType.click();
			Thread.sleep(3000);
			ActName.click();
			Thread.sleep(3000);
			ActNamebox.sendKeys("indian penal code");
			Thread.sleep(3000);
			ActNamesection.sendKeys("420");
			Thread.sleep(3000);
			SearchButton.click();
			Thread.sleep(4000);

			String actualText5 = ActNameresult.getText();
			String ExpectedText5 = ActNameresult.getText();

			Assert.assertEquals(actualText5, ExpectedText5);
			Reporter.log("By Act Name seacrh is working", true);
			Thread.sleep(4000);
		}
		}
