package a7TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * manam echina time lo site open itea parleadu lekapotea e exception vastadi "org.openqa.selenium.TimeoutException"
		 */
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);	
		driver.get("https://omayo.blogspot.com");
		
		driver.close();
		
	}

}
