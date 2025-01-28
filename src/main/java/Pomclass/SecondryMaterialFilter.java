package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

public class SecondryMaterialFilter extends BasePage1 {

	public SecondryMaterialFilter(WebDriver driver,ExtentTest test) {
		super(driver, test);
	}

	
	@FindBy(xpath = "//*[@id=\"search\"]") // Main Search Box
	private WebElement searchbox;

	@FindBy(xpath = "//*[@id=\"btnSearch\"]/i") // Main Search Icon
	private WebElement SearchButton;

	@FindBy(xpath = "//button[@href='#select-dropdown']") // All
	private WebElement Allmenu;

	@FindBy(xpath = "//a[@id='material11']") // By Acts (Secondary material)
	private WebElement actname;

	@FindBy(xpath = "//*[@id=\"totalResult\"]/span") // result main
	private WebElement result;

	@FindBy(xpath = "//*[@id=\"secondaryId\"]/div/div[2]/button[2]/i") // Secondary material next button
	private WebElement Secondrynxtbtn;

	@FindBy(xpath = "//*[@id=\"secondaryId\"]/div/div[2]/button[1]/i") // Secondary material back button
	private WebElement Secondrybkbtn;

	@FindBy(xpath = "//*[@id=\"material4\"]") // Secondary material Notification option
	private WebElement Notification;

	@FindBy(xpath = "//*[@id=\"material1\"]") // Secondary material Bills in Parliament option
	private WebElement Billinparliament;

	@FindBy(xpath = "//*[@id=\"material5\"]") //
	private WebElement ReportCM;

	@FindBy(xpath = "//*[@id=\"material3\"]")
	private WebElement LawCReport;

	@FindBy(xpath = "//*[@id=\"material2\"]")
	private WebElement CAD;

	@FindBy(xpath = "//*[@id=\"material6\"]")
	private WebElement Treaties;

	@FindBy(xpath = "//*[@id=\"material10\"]")
	private WebElement News;

	@FindBy(xpath = "//*[@id=\"material9\"]")
	private WebElement Interviews;

	@FindBy(xpath = "//*[@id=\"material8\"]")
	private WebElement Columns;

	@FindBy(xpath = "//*[@id=\"material13\"]")
	private WebElement circular;

	@FindBy(xpath = "//*[@id=\"myBtn\"]/i")
	private WebElement topbtn;

	@FindBy(xpath = "//*[@id=\"0\"]/div/div/div[2]/a[1]/small")
	private WebElement srchwthcase;

	@FindBy(xpath = "//*[@id=\"searchitem0\"]")
	private WebElement Searchwithinsearch;

	@FindBy(xpath = "//*[@id=\"0\"]/div/div/div[2]/div/div[1]/div[2]/div[1]/button[1]")
	private WebElement search;

	@FindBy(xpath = "//*[@id=\"0\"]/div/div/div[2]/div/div[1]/div[2]/div[1]/button[3]")
	private WebElement Next;

	@FindBy(xpath = "//*[@id=\"0\"]/div/div/div[2]/div/div[1]/div[2]/div[1]/button[2]")
	private WebElement previous;

	@FindBy(xpath = "//*[@id=\"0\"]/div/div/div[2]/div/div[1]/div[1]/a/i")
	private WebElement close;

	@FindBy(xpath = "//*[@id=\"presecriptive2\"]")
	private WebElement referred;

	// Filter

	@FindBy(xpath = "//*[@id=\"smyearfilter\"]/label")
	private WebElement YearButton;

	@FindBy(xpath = "//*[@id=\"bysmyear\"]/li/div/label/span")
	private WebElement filterfirstdata;

	@FindBy(xpath = "//*[@id=\"ministryfilter\"]/label")
	private WebElement Ministry;

	@FindBy(xpath = "//*[@id=\"byministry\"]/li/div/label/span")
	private WebElement Ministryfirst;

	@FindBy(xpath = "//*[@id=\"titlefilter\"]/label")
	private WebElement titlefilter;

	@FindBy(xpath = "//*[@id=\"bytitle\"]/li/div/label/span")
	private WebElement Titlefiltersencond;

	@FindBy(xpath = "//*[@id=\"subtitlefilter\"]/label")
	private WebElement subtitlefilter;

	@FindBy(xpath = "//*[@id=\"bysubtitle\"]/li/div/label/span")
	private WebElement subtitlefilterfirst;

	@FindBy(xpath = "//*[@id=\"reportnofilter\"]/label")
	private WebElement LawReportfilter;

	@FindBy(xpath = "//*[@id=\"byreportno\"]/li/div/label/span")
	private WebElement LawReportfilterfirst;

	@FindBy(xpath = "//*[@id=\"smyearfilter\"]/label")
	private WebElement CADFilter;

	@FindBy(xpath = "//*[@id=\"bysmyear\"]/li/div/label/span")
	private WebElement CADFilterYearFirst;

	@FindBy(xpath = "//*[@id=\"titlefilter\"]/label")
	private WebElement TreatiesFilter;

	@FindBy(xpath = "//*[@id=\"bytitle\"]/li/div/label/span")
	private WebElement TreatiesTitleFilter;

	@FindBy(xpath = "//*[@id=\"smyearfilter\"]/label/div")
	private WebElement NewsFilter;

	@FindBy(xpath = "//*[@id=\"bysmyear\"]/li[2]/div/label/span")
	private WebElement NewsFilterYeartwo;

	@FindBy(xpath = "//*[@id=\"smyearfilter\"]/label")
	private WebElement ColumnFilter;

	@FindBy(xpath = "//*[@id=\"bysmyear\"]/li/div/label/span")
	private WebElement ColumnFilterYearone;


	// Actions 	
		public void click() throws InterruptedException {
			
			searchbox.sendKeys("rama");
			Thread.sleep(3000);
			SearchButton.click();
			Thread.sleep(3000);
			Secondrynxtbtn.click();
			Thread.sleep(3000);
			Secondrynxtbtn.click();
			Thread.sleep(3000);
			Secondrybkbtn.click();
			Thread.sleep(3000);
			/// Act Filter
			actname.click();
			Thread.sleep(3000);
			YearButton.click();
			Thread.sleep(3000);
			filterfirstdata.click();
			Thread.sleep(3000);

		/*	String actualtext = result.getText();
			String ExpectedText = "Found : 2 results for query rama";
			Assert.assertEquals(actualtext, ExpectedText);
			Reporter.log("ACTS Filter is working", true);
			Thread.sleep(5000); */

			// Notification Filter

			Notification.click();
			Thread.sleep(3000);

			Ministry.click();
			Thread.sleep(3000);
			Ministryfirst.click();
			Thread.sleep(3000);

		/*	String actualtext1 = result.getText();
			String ExpectedText1 = "Found : 3 results for query rama";
			Assert.assertEquals(actualtext1, ExpectedText1);
			Reporter.log("Notification Filter is working", true);
			Thread.sleep(5000); */

			// Bills in Parliament filter

			Billinparliament.click();
			Thread.sleep(3000);
			titlefilter.click();
			Thread.sleep(3000);
			Titlefiltersencond.click();
			Thread.sleep(3000);

		/*	String actualText2 = result.getText();
			String ExpectedText2 = "Found : 1 results for query rama";
			Assert.assertEquals(actualText2, ExpectedText2);
			Reporter.log("Bills In Parliament is working");
			Thread.sleep(5000); */

			// report of commission and committees filter
			ReportCM.click();
			Thread.sleep(3000);
			subtitlefilter.click();
			Thread.sleep(3000);
			subtitlefilterfirst.click();
			Thread.sleep(3000);
		/*	String actualText3 = result.getText();
			String ExpectedText3 = "Found : 1 results for query rama";
			Assert.assertEquals(actualText3, ExpectedText3);
			Reporter.log("Reports of Commissions and Committees is working");
			Thread.sleep(5000); */

			
			
		
			
			// Law report filter
			LawCReport.click();
			Thread.sleep(3000);
			LawReportfilter.click();
			Thread.sleep(3000);
			LawReportfilterfirst.click();
			Thread.sleep(3000);

		/*	String actualText4 = result.getText();
			String ExpectedText4 = "Found : 1 results for query rama";
			Assert.assertEquals(actualText4, ExpectedText4);
			Reporter.log("Law Commission Reports filter is working"); */
			Thread.sleep(5000);

			Secondrynxtbtn.click();
			Thread.sleep(3000);
			Secondrynxtbtn.click();
			Thread.sleep(3000);
			Secondrynxtbtn.click();
			Thread.sleep(3000);

	// Constituent Assembly Debates filter
			CAD.click();
			Thread.sleep(4000);
			CADFilter.click();
			Thread.sleep(3000);
			CADFilterYearFirst.click();
			Thread.sleep(3000);
		/*	String actualText5 = result.getText();
			String ExpectedText5 = "Found : 4 results for query rama";
			Assert.assertEquals(actualText5, ExpectedText5);
			Reporter.log("Constituent Assembly Debates is working");
			Thread.sleep(5000); */
			Secondrynxtbtn.click();
			Thread.sleep(3000);
	// Treaties filter 
			Treaties.click();
			Thread.sleep(4000);
			TreatiesFilter.click();
			Thread.sleep(3000);
			TreatiesTitleFilter.click();

			String actualText6 = result.getText();
			String ExpectedText6 = "Found : 1 results for query rama";
			Assert.assertEquals(actualText6, ExpectedText6);
			Reporter.log("Treaties is working");
			Thread.sleep(5000);

	// News Filter
			News.click();
			Thread.sleep(3000);
			NewsFilter.click();
			Thread.sleep(3000);
			NewsFilterYeartwo.click();
		/*	Thread.sleep(3000);
			String actualText7 = result.getText();
			String ExpectedText7 = "Found : 7 results for query rama";
			Assert.assertEquals(actualText7, ExpectedText7);
			Reporter.log("News is working"); */
			Thread.sleep(5000);

	// Column Filter
			Columns.click();
			Thread.sleep(3000);
			ColumnFilter.click();
			Thread.sleep(3000);
			ColumnFilterYearone.click();
			Thread.sleep(3000);

		/*	String actualText8 = result.getText();
			String ExpectedText8 = "Found : 1 results for query rama";
			Assert.assertEquals(actualText8, ExpectedText8);
			Reporter.log("Columns is working"); */
			
			Secondrynxtbtn.click();
			Thread.sleep(3000);
			
			circular.click();
			Thread.sleep(3000);

			Ministry.click();
			Thread.sleep(3000);
			Ministryfirst.click();
			Thread.sleep(3000);


	
		}
}
