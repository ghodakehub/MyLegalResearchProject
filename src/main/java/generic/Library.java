package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library {

	public static WebElement waitForVisibilityOf(WebDriver driver, WebElement element) {
		Library.scrollByPixelSize(driver, 100);
		Library.threadSleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public static void scrollTillElementDisplay(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollByPixelSize(WebDriver driver, int PixelSize) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + PixelSize + ")", "");
	}

	public static void click(WebDriver driver, WebElement element, String LogMessege) {
		try {
			scrollTillElementDisplay(driver, element);
			waitForVisibilityOf(driver, element);
			element.click();
			System.out.println(LogMessege);
		} catch (Exception e) {
			element.click();
			System.out.println("Test failed at step : " + element);

		}
	}

	public static void sendKeys(WebDriver driver, WebElement element, String LogMessege, String enterValue) {
		try {
			scrollTillElementDisplay(driver, element);
			waitForVisibilityOf(driver, element);
			element.clear();
			element.sendKeys(enterValue);
			System.out.println(LogMessege);
		} catch (Exception e) {
			element.sendKeys(enterValue);
			System.out.println("Test failed at step : " + LogMessege);
		}
	}

	public static void performEnterAction(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	public static void threadSleep(int MiliSeconds) {
		try {
			Thread.sleep(MiliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getConfigueData(String key) {
		Properties pro = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config_Properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = pro.getProperty(key);
		return value;
	}

	public static void WindowHandle(WebDriver driver, WebElement element) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);

			System.out.println("Child window: " + driver.getTitle());
		}
	}

	public static void implicitWait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void verifyText(WebDriver driver, WebElement element, String TextOnWebPage) {
		String extectedText = TextOnWebPage;
		if (element.isDisplayed() && element.getText().equals(extectedText)) {
			System.out.println("Text Verification successful on page.");
		} else {
			System.out.println("Text veificaton failed on page.");
		}
	}

	public static void selectDropDown(WebElement element, String EnterValue) {
		Select select = new Select(element);
		select.selectByVisibleText(EnterValue);
	}


	public static void getText(WebElement element, String LogMessage) {

//	try {
//		
//	}
	
	
	}
	
	
}
