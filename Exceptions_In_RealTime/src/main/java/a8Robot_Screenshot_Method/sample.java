package a8Robot_Screenshot_Method;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space(text())='the automation zone']"));
		
		//Normal Screenshot Method fail itea Robot Screenshot Method use aavutadi
		
		try {
			
			//Normal Screenshot Method
			File screenshot = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
			File output = new File(".//screenshot.png");
			FileUtils.copyFile(screenshot, output);
			
		} catch (Exception e) {

			//Robot Screenshot Method
			Robot rob = new Robot();
			//rob.createScreenCapture(Rectangle) ekada rectangle screen danikosam "Toolkit" use chestamu
			Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage image = rob.createScreenCapture(rect);
			ImageIO.write(image, "png", new File(".//screenshot.png"));
			
		}
		
		driver.close();
		
	}

}
