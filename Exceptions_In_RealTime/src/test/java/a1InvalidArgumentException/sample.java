package a1InvalidArgumentException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * Opening any website without giving "http or https" will gives you "org.openqa.selenium.InvalidArgumentException"
		 */
	//	driver.get("www.google.com");
		
		driver.get("https://www.google.com");
		
	}

}
