package tests;

import java.io.IOException;

import org.junit.Test;

import helpers.WebTestsHelper;
import pages.HomePage;

/**
	 * @author Avi Arviv <avia@gett.com>
*/
public class HomePageTest extends WebTestsHelper{
	
	@Test
	public void testStartButton() throws IOException{
		goToHomePage();
		HomePage.startButtonElement(driver).click();
		isElementVisibale(HomePage.finishText, 10);
		assertTextForElement(driver, "Hello World!", HomePage.finishTextElement(driver));
	}
	
	@Test
	public void testHelloText() throws IOException {
		goToHomePage();
		HomePage.startButtonElement(driver).click();
		isElementVisibale(HomePage.finishText, 10);
		assertTextForElement(driver, "Hello", HomePage.finishTextElement(driver));
	}

}
