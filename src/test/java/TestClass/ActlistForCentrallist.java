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
import Pomclass.ActListForCentral;
import Pomclass.Login;
import UtilityClass.UtilityClass;
import generic.BaseLib;
import generic.ForMultiplemailReceipent;

public class ActlistForCentrallist extends BaseLib{

	
	

	UtilityClass utility;
	 ActListForCentral act;
	String tcid;
	
	  public static ExtentReports extent;
		
		public static ExtentSparkReporter spark;
		
		public static ExtentTest test;
		
	
	
	@BeforeMethod
	public void initialize()
	{
	  extent=ExtentReportManager.getReports();
	  test= extent.createTest("ActList for central verify");
		
	}
	
	
	
	@Test
	public void verifyActListforCentral() throws InterruptedException, IOException
	
	{
		Login log= new Login(driver,test);
        log.login("pratiksha.damodar@legitquest.com", "lq@123");
        ActListForCentral act= new  ActListForCentral (driver,test);
		act.Selecttypeforcentaral(BaseLib .driver);
		Thread.sleep(1000);
         act.handlebuttons(BaseLib.driver);
	
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
           	    "ActList For Central ",
           	    "Please check Actlist for central issue coming while downlaod pdf , please find the attached screenshot for details." ,
           	 screenshot , testUrl
           	   
           	);
	
	}
	Reporter.log("take screenshot succesfully");
	
		extent.flush();
		BaseLib.driver.quit();
	}


}
