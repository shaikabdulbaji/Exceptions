package a3StaleElementReferenceException;

import org.openqa.selenium.By;
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
		
//		WebElement textarea = driver.findElement(By.id("ta1"));
//		textarea.sendKeys("abc");
//		driver.navigate().refresh();
//		textarea.clear();
		/*
		 * no longer exist in dom will result to "org.openqa.selenium.StaleElementReferenceException"
		 * means vaka action purthi kakunta inko dani medha action tisukovatam and tisukunaka old danimedha action 
		   tisukuntea work aavadu apude e exception vastadi "org.openqa.selenium.StaleElementReferenceException".
		 */
		
		WebElement textarea = driver.findElement(By.id("ta1"));
		textarea.sendKeys("abc");
		driver.navigate().refresh();
		WebElement textarea1 = driver.findElement(By.id("ta1"));
		textarea1.sendKeys("abc");
		textarea1.clear();
		
		driver.close();
	}

}
