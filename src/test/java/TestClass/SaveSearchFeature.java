package TestClass;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ExtentReportBasic.ExtentReportManager;
import Pomclass.Login;
import Pomclass.SaveSearchJugement;
import UtilityClass.UtilityClass;
import generic.BaseLib;
import generic.ForMultiplemailReceipent;

public class SaveSearchFeature extends BaseLib {
	
	
	UtilityClass utility;
	String tcid;
	
	  public static ExtentReports extent;
		
		public static ExtentSparkReporter spark;
		
		public static ExtentTest test;
		
		
	@BeforeMethod
	public void initialize()
	{
	  extent=ExtentReportManager.getReports();
	  test= extent.createTest("SaveSearchFucntionality test case");
		
	}
	
	@Test
	public void verifySearchSaveFunciton() throws InterruptedException, IOException
	
	{
		tcid="6: verify the SaveSearchedJudgementFunctionality";
		Login log= new Login(driver, test);
		log.login("pratiksha.damodar@legitquest.com","lq@123");
		SaveSearchJugement search= new SaveSearchJugement (driver,test);
	search.verifysavesearch(BaseLib.driver);	
	
	}
	@AfterMethod
	public void finish(ITestResult result) throws IOException, MessagingException
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
		String screenshot=  UtilityClass.Capaturescreenshot(BaseLib.driver,result.getName() );
		
		test.log(Status.FAIL,"test"+ test.addScreenCaptureFromPath(screenshot));
		
		
		String testUrl = BaseLib.driver.getCurrentUrl();  
		 ForMultiplemailReceipent.sendEmail(
           	   BaseLib.driver, new String[]{"ghodake6896@gmail.com"},
           	    "LR-Profile - SavedSearch",
           	    "Please check Profile issue coming in SavedSearch , please find the attached screenshot for details." ,
           	 screenshot , testUrl
           	   
           	);
	
	}
	Reporter.log("take screenshot succesfully");
	
	extent.flush();
	BaseLib.driver.quit();
}
}
