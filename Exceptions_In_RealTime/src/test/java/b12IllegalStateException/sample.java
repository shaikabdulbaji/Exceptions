package b12IllegalStateException;

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
		
		driver.findElement(By.id("blogsmenu")).click();
		
		/*
		 *  manam driver path evakunda execute chestea e exception vastadi "java.lang.IllegalStateException"
		 */
		
		driver.findElement(By.id("selenium143")).click();
		
		driver.close();
		
	}

}
