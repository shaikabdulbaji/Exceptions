package a5JavascriptException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com");
		
		/*
		 * javascript lo amana error untea e exception vastadi "org.openqa.selenium.JavascriptException"
		 */
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		WebElement textarea = driver.findElement(By.id("ta1"));
//		jse.executeScript("arguments[0.value='abdul'", textarea);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement textarea = driver.findElement(By.id("ta1"));
		jse.executeScript("arguments[0].value='abdul'", textarea);
		
		driver.close();
		
	}

}
