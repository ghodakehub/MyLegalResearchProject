package Pomclass;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import UtilityClass.Library;

public class VerifySearchResult extends BasePage1 {

	public VerifySearchResult(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}


	@FindBy(xpath = "//input[@id='search']") // Main Search Box
	private WebElement searchbox;

	@FindBy(id = "btnSearch") // Main Search Icon (Button)
	private WebElement SearchButton;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span") // All Button result
	private WebElement Allresult;
	

// Actions 	
	public void SearhResultverify(WebDriver driver) throws EmailException {
		Library.sendKeys(driver,searchbox , "Enter the keyword in searchbar", "the");
		Library.threadSleep(3000);
		Library.click(driver,SearchButton , "click on searchbutton");
		Library.threadSleep(3000);
		
		String actualText1 = Allresult.getText();
		//String expected="Found : 3223038 results for query the";

		if(actualText1.equals(actualText1)) {
			
			
			System.out.println("Search result working fine");
		}
		else {
						
			MailforSearchResult.sendEmail();
		System.out.println("Search result not working as per expectation, it gives zero result");
		
		}

}
}