package a2UnhandledAlertException;

import org.openqa.selenium.Alert;
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
		 * without performing any action on alert will give you this exception "org.openqa.selenium.UnhandledAlertException"
		 */
		
		//driver.findElement(By.id("alert1")).click();
		
		driver.findElement(By.id("alert1")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.close();
		
	}

}
