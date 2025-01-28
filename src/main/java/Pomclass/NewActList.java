package Pomclass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import UtilityClass.Library;

public class NewActList extends BasePage1 {

	public NewActList(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	@FindBy(xpath = "/html/body/div[3]/main/a[2]/button")
	private WebElement ClickActlistbtn;
	
	@FindBy(xpath = "//*[@id=\"court-tabs\"]/li[3]/a")
	private WebElement ClickonNewActList;
	
	@FindBy(xpath = "//*[@id=\"centralActType\"]")
	private WebElement Selecttype;
	
	
	
	
		public void Actlist(WebDriver driver) throws InterruptedException
		{
			 Library.click(driver, ClickActlistbtn, "Click on actlist button");
			 Library.threadSleep(3000);
			 //Library.click(driver, ClickonNewActList, "Click on NewActlist Tab");
		}
		
		public void verifyNewActlsit(WebDriver driver) {
			
			try {
	          
				
	            WebElement newActsListButton = driver.findElement(By.linkText("NEW ACTS LIST"));
	            newActsListButton.click();

	            // Wait for the New Acts List page to load
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1"))); // Adjust locator as needed

	            // Check if the page is blank
	            if (driver.findElements(By.tagName("body")).get(0).getText().trim().isEmpty()) {
	                System.out.println("Page is blank. Test failed.");
	                test.fail("Pleaes check After click on NewActlist page is showing blank.");
	                System.out.println("Error URL: " + driver.getCurrentUrl());
	                test.info("Error Url :"+driver.getCurrentUrl());
	                
	            } else {
	                System.out.println("New Acts List page loaded successfully.");

	                // Get all acts in the list
	                List<WebElement> actsList = driver.findElements(By.xpath("//*[@id=\"result\"]/tr/td[1]/a")); // Adjust CSS selector

	              
	                for (int i = 0; i < Math.min(actsList.size(), 5); i++) {
	                    WebElement act = actsList.get(i);
	                    String actName = act.getText();
	                    System.out.println("Checking act: " + actName);
	                    
	                    // Get the current window handle
	                    String originalWindow = driver.getWindowHandle();
	                    

	                    // Click on the act link
	                    act .click();

	                    Thread.sleep(2000);
	                    
	                    
	  
	                    // Wait for the new tab to open
	                    wait.until(new ExpectedCondition<Boolean>() {
	                        public Boolean apply(WebDriver driver) {
	                            return driver.getWindowHandles().size() > 1;
	                        }
	                    });

	                    // Switch to the new tab
	                    Set<String> windowHandles = driver.getWindowHandles();
	                    for (String handle : windowHandles) {
	                        if (!handle.equals(originalWindow)) {
	                            driver.switchTo().window(handle);
	                            break;
	                        }
	                    }
	                    
	                    
	                    
	                    // Wait for the act content to load
	                    wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body"))); // Adjust locator

	                    // Check if the act page is blank
	                    if (driver.findElements(By.tagName("body")).get(0).getText().trim().isEmpty()) {
	                        System.out.println("Act page is blank: " + actName);
	                        System.out.println("Error URL: " + driver.getCurrentUrl());
	                    } else {
	                        System.out.println("Act page loaded successfully: " + actName);
	                    }

	                    // Navigate back to the acts list
	                    driver.close();
	                    driver.switchTo().window(originalWindow);
	                    //Thread.sleep(2000);
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	    }
	
}