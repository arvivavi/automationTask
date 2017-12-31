package utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Avi Arviv 
 */
public class ScreenShot {

	public static void takeScreenShotForElement(WebDriver driver, WebElement element) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage image = ImageIO.read(scrFile);
		Graphics2D graphics = image.createGraphics();
		int x = element.getLocation().getX();
		int y = element.getLocation().getY() + 160;
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight() + 50;
		graphics.setColor(Color.RED);
		graphics.setStroke(new BasicStroke(10.0f));
		graphics.drawRect(x, y, width, height);
		String path = System.getProperty("user.dir") + "/src/resources/images/image.png/";
		File outputFile = new File(path);
		outputFile.getParentFile().mkdirs();
		ImageIO.write(image, "png", new File(path));
		System.out.println("Screenshot: " + path);
	}

}
