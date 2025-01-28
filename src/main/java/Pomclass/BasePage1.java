package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class BasePage1 {
	
	public WebDriver driver;
	ExtentTest test;
	
	 public BasePage1(WebDriver driver,ExtentTest test) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // Initialize the WebElements
	        this.test = test;
	    }

}
