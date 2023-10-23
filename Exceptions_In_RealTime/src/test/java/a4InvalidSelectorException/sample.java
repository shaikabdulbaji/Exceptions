package a4InvalidSelectorException;

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
		 * manam amana xpath lo tappu estea e exception vastadi "org.openqa.selenium.InvalidSelectorException"
		 */
		//driver.findElement(By.xpath("//input[@type='submit']]")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		
	}

}
