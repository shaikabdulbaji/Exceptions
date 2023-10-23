package a8ElementNotInteractableException;

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
		 * manam koni actions koni vatimedea chaiyali lekapotea e exception vastadi "org.openqa.selenium.ElementNotInteractableException"
		 * user cannot perform any action on it, such as clicking or sending keys.
		 */
		//driver.findElement(By.xpath(" //h1[normalize-space(text())='omayo (QAFox.com)']")).sendKeys("abc");
		
		driver.close();
		
	}

}
