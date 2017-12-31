package infra;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Avi Arviv 
 */
public class InitWebTests {

	protected WebDriver driver = null;
	protected WebDriverWait wait;
	protected final String path = System.getProperty("user.dir");
	private final String chromePath = "/src/resources/chromedriver";

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", path + chromePath);
		System.out.println("Lanuch webDriver");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() {
		System.out.println("Closing webDriver");
		driver.quit();
	}
}
