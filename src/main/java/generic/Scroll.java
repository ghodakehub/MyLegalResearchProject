package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



	public class Scroll extends BaseLib{


		public static void scrollWindow( WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView(true)", element);

		}
		
}
