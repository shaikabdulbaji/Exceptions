package a6NoSuchWindowException_NoAlertPresentException_NoSuchElementException_and_NoSuchFrameException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com");
		
		/*
		 * manam adana leani "window" ki switch itea e exception vastadi "org.openqa.selenium.NoSuchWindowException"
		 */
		//driver.switchTo().window("abcd");
		
		/*
		 * manam adana leani "alert" ki switch itea e exception vastadi "org.openqa.selenium.NoAlertPresentException"
		 */
		//driver.switchTo().alert();
		
		/*
		 * manam adana leani "element" ni amana action tisukuntea e exception vastadi "org.openqa.selenium.NoSuchElementException"
		 */
		//driver.findElement(By.id("abcd")).click();
		
		/*
		 * manam adana leani "frame" ki switch itea e exception vastadi "org.openqa.selenium.NoSuchFrameException"
		 */
		//driver.switchTo().frame("abcd");
		
		
	}

}
