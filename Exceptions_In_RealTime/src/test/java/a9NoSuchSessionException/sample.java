package a9NoSuchSessionException;

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
		
		driver.close();
		
		/*
		 * browser close ina tarvata a statement execute ina e exception vastadi "org.openqa.selenium.NoSuchSessionException"
		 */
		driver.getTitle();
		
	}

}
