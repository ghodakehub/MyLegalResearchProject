package Pomclass;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import generic.BaseLib;
import generic.SwitchWindow;

public class LatestLegalPageBrokenLink2 extends BasePage1 {

	public LatestLegalPageBrokenLink2(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}
	
	@FindBy(xpath = "(//button[@type='button'])[4]") // LoginButton
	private WebElement loginbtn;

	@FindBy(xpath = "//button[normalize-space()='Latest Legal News']")
	private WebElement clickbtn;

	
	public WebElement getloginbtn() {
		return loginbtn;
	}

	public WebElement getclickbtn() {
		return clickbtn;
	}

	
	
	
	
	
	
// Actions 	
	public void click() throws MalformedURLException, InterruptedException {

		
		
		clickbtn.click();

		SwitchWindow.switchWindowByIndex(BaseLib.driver, 1);

		List<WebElement> alllinks = BaseLib.driver.findElements(By.tagName("a"));

		System.out.println(alllinks.size());

		for (WebElement element : alllinks) {

			String url = element.getAttribute("href");

			if (url == null || url.isEmpty()) {

				System.out.println("URL is Empty");
				continue;
			}

			URL link = new URL(url);

			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();

				if (httpconn.getResponseCode() >= 400) {

					System.out.println(httpconn.getResponseCode() + url + ": Broken Link");
				}

				else {

					System.out.println(httpconn.getResponseCode() + url + ": is valid link");

				}

			} catch (Exception e) {

				System.out.println(e);
			}
		}

	}

}
