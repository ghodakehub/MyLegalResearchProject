package Pomclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

import UtilityClass.Library;
import generic.BaseLib;

public class Contact_Footer extends BasePage1 {

	public Contact_Footer(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	@FindBy(xpath = "/html/body/div[3]/footer/div/div/div[2]/div/div[1]/div/div[1]/ul/li[1]/a") // our team
	private WebElement ourteam;

	@FindBy(xpath = "/html/body/main/section[1]/div/div/div/h1") // our team page
	private WebElement teampage;

	@FindBy(xpath = "/html/body/footer/div/div/div[2]/div/div[1]/div/div[1]/ul/li[2]/a") // Gallery footer
	private WebElement gallery;

	@FindBy(linkText = "Contact Us") // Contact Us
	private WebElement contactus;
	
	@FindBy(linkText = "Careers") // Contact Us
	private WebElement careers;

	@FindBy(linkText = "Terms & Conditions") // First name
	private WebElement termscondition;

	@FindBy(linkText = "We value your Privacy") // Last Name
	private WebElement privacy;

	@FindBy(linkText = "Newsletter") // phone number
	private WebElement newsletter;

	@FindBy(linkText = "Request Demo") // email
	private WebElement demo;

	@FindBy(id = "dname") // city
	private WebElement entername;

	@FindBy(id = "demail") // query for
	private WebElement email;

	@FindBy(id = "dphone") // query
	private WebElement phoneno;

	@FindBy(id = "dposition") //here use select class positon from dropdown
	private WebElement position;

	

	@FindBy(id = "dcompany") // companyname
	private WebElement company;

	@FindBy(id="state") // select state form dropdown here use select class message
	private WebElement state;

	@FindBy(id = "city") // here select city form dorpdown
	private WebElement city;

	@FindBy(id = "demoBtn")
	private WebElement submitbtn;
	
	@FindBy(linkText = "FAQ")
	private WebElement faq;
	
	@FindBy(linkText = "Blog")
	private WebElement blog;
	
	@FindBy(linkText = "Download for Punjab and Haryana Judiciary")
	private WebElement harayanapunjab;
	

	
// Actions 	
	public void click(WebDriver driver) throws InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) BaseLib.driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ourteam);
		
		Thread.sleep(3000);
		ourteam.click();
		Thread.sleep(3000);
		teampage.click();
		Thread.sleep(3000);
		
		// Our team Page verification 
		String actualText = teampage.getText();
		String ExpectedText = "Legitquest Team";
		
		/*
		 * if (actualText == ExpectedText) {
		 * Reporter.log("Our Team page is open succesfully !!"); } else {
		 * Reporter.log("Our Team page is not opening !!"); }
		 */
		
		Assert.assertEquals(actualText, ExpectedText);
		Reporter.log("Our Team page is open succesfully", true);
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) BaseLib.driver;
		js1.executeScript("arguments[0].scrollIntoView(true);", gallery);
		Thread.sleep(3000);
		
		//Gallery Page verification 
		gallery.click();
		String actualText1 = teampage.getText();
		String ExpectedText1 = "Gallery";
		
		/*
		 * if (actualText1 == ExpectedText1) {
		 * Reporter.log("Gallery page is open succesfully"); } else {
		 * Reporter.log("Gallery page is not opening"); }
		 */
		
		Assert.assertEquals(actualText1, ExpectedText1);
		Reporter.log("Gallery page is open succesfully", true);
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) BaseLib.driver;
		js2.executeScript("arguments[0].scrollIntoView(true);", gallery);
		Thread.sleep(3000);
		
		// Contact US Page verification 
	/*	contactus.click();
		Thread.sleep(3000);
		firstname.sendKeys("Pratiksha");
		Thread.sleep(3000);
		lastname.sendKeys("Ghodake");
		Thread.sleep(3000);
		phonenumber.sendKeys("9534567350");
		Thread.sleep(3000);
		email.sendKeys("pratiksha.damodar@legitquest.com");
		Thread.sleep(3000);
		city.sendKeys("pune");
		Thread.sleep(3000);
		
		Select select = new Select(queryfor);
		select.selectByIndex(1);
		Thread.sleep(3000);
		
		Select select1 = new Select(query);
		select1.selectByIndex(1);
		
		Thread.sleep(3000);
		text.sendKeys("Testing purpose only !!");
		Thread.sleep(3000);
		//captch
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("recaptcha-checkbox-border")).click();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		String actualText2 = message.getText();
		String ExpectedText2 = message.getText(); */
		
		Library.click(driver,careers , "click on careers");
		Library.threadSleep(3000);
		
		
		Library.click(driver,termscondition , "click on termscondition");
		Library.threadSleep(3000);
		
		
		Library.click(driver,privacy , "click on privacy");
		Library.threadSleep(3000);
		
	//	Library.click(driver,newsletter , "click on newsletter");
	//	Library.threadSleep(3000);
		
		Library.click(driver,demo , "click on demo");
		Library.threadSleep(3000);
		
		
		Library.sendKeys(driver,entername , "enter name ", "Pratiksha damodar ghodake");
		Library.threadSleep(3000);
		
		Library.sendKeys(driver,email , "enter email ", "pratiksha.damodar@legitquest.com");
		Library.threadSleep(3000);
		
		Library.sendKeys(driver,phoneno , "enter phoneno ", "9656789045");
		Library.threadSleep(3000);
		
	Select post=new Select(position);
	post.selectByIndex(1);
		
	Library.sendKeys(driver, company, "enter company ", "legitquest");
	Library.threadSleep(3000);
	
	
	Select state1 =new Select(state);
       state1.selectByValue("Maharashtra");
	
	Select cityname1 =new Select(city);
	cityname1.selectByValue("Amravati");
	
	Library.click(driver,submitbtn , "click on submitbtn");
	Library.threadSleep(4000);

	

	try {
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    // Perform actions on the alert
	} catch (NoAlertPresentException e) {
	    // Handle the case when no alert is present
	    System.out.println("No alert present.");
	}
	
	 Library.threadSleep(3000);

	Library.waitForVisibilityOf(driver, faq);
		Library.click(driver,faq , "click on FAQ");
		Library.threadSleep(3000);
		
		
		Library.click(driver,blog , "click on BLOG");
		Library.threadSleep(3000);

		Library.click(driver,harayanapunjab , "click on harayanapunjab");
		Library.threadSleep(3000);


		
		
	
	}

}
