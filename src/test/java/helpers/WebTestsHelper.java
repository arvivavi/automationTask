package helpers;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import infra.InitWebTests;
import pages.HomePage;
import utils.ScreenShot;

/**
 * @author Avi Arviv <avia@gett.com>
 */
public class WebTestsHelper extends InitWebTests {

	/**
	 * Wait for element to be visible on the page
	 * 
	 * @param by
	 * @param timeOutInSeconds
	 *            The timeout in seconds when an expectation is called
	 */
	public boolean isElementVisibale(By by, long timeOutInSeconds) {
		wait = new WebDriverWait(driver, timeOutInSeconds);
		System.out.println("Waiting " + timeOutInSeconds + " sec for visibilty of element");
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void goToHomePage() {
		System.out.println("Navigate to home page");
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		isElementVisibale(HomePage.startButton, 10);
	}

	public static void assertTextForElement(WebDriver driver, String expected, WebElement element) throws IOException{
		String actual = element.getText();
		try {
			Assert.assertEquals(expected, actual);
		} catch (AssertionError e) {
			System.out.println(e.toString());
			ScreenShot.takeScreenShotForElement(driver, element);
			Assert.fail(e.toString());			
		}
	}

}
