package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Avi Arviv <avia@gett.com>
 */
public class HomePage {

	public static By startButton = By.cssSelector("#start > button");
	public static By finishText = By.xpath("//div[@id='finish']/h4");

	public static WebElement startButtonElement(WebDriver driver) {
		return driver.findElement(startButton);
	}

	public static WebElement finishTextElement(WebDriver driver) {
		return driver.findElement(finishText);
	}

}
