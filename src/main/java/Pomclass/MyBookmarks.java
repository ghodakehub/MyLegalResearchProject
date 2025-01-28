package Pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class MyBookmarks extends BasePage1 {

	public MyBookmarks(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	@FindBy(xpath = "//*[@id=\"navbarsExampleDefault\"]/ul/li/a")
	private WebElement profilename;                  //main searchbar text
	
	@FindBy(linkText = "My Bookmarks")         //searchbtn
	private WebElement mybookmarks;
	
	@FindBy(xpath = "//*[@id=\"bookmarkTable_length\"]/label/select")    //showentires selectclass       
	private WebElement showentries;
	
	@FindBy(xpath = "//*[@id=\"bookmarkTable\"]/tbody/tr[1]/td[3]/a/i")    //showentires selectclass       
	private WebElement deletebtn;
	
	@FindBy(xpath = "//*[@id=\"deletebookmark\"]/div/div/div[2]/button[2]")    //showentires selectclass       
	private WebElement deletebtnpop;
	
	@FindBy(xpath = "//*[@id=\"loader_message6\"]")    //showentires selectclass       
	private WebElement deletemessage;


	public void profilefunctionality(WebDriver driver) throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		act.moveToElement( profilename).perform();
		Thread.sleep(3000);
		mybookmarks.click();
		Thread.sleep(2000);
		Select entries= new Select(showentries);
		entries.selectByIndex(1);
		Thread.sleep(2000);
		entries.selectByIndex(2);
		Thread.sleep(2000);	
		entries.selectByIndex(3);
		deletebtn.click();
		Thread.sleep(2000);	
		deletebtnpop.click();
		Thread.sleep(2000);	
		String message = deletemessage.getText();
		System.out.println("Message of delete the bookmarks:"+message);
	}

	public void verifytbale(WebDriver driver)
	{
		int rowcount = driver.findElements(By.xpath("//*[@id=\"bookmarkTable\"]/tbody/tr")).size();
		System.out.println("No of rows:"+rowcount);
		
		int column = driver.findElements(By.xpath("//*[@id=\"bookmarkTable\"]/tbody/tr[1]/td")).size();
		System.out.println("No of column:"+column);
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=1;j<=column;j++)
			{
				String text = driver.findElement(By.xpath("//*[@id=\"bookmarkTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
			}
		}

			
	}
}
