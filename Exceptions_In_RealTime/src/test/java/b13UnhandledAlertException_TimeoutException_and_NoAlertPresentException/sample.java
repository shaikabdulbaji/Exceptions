package b13UnhandledAlertException_TimeoutException_and_NoAlertPresentException;

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
		
		driver.findElement(By.id("alert1")).click();
		
		Alert alert = driver.switchTo().alert();
		
		driver.findElement(By.id("ta1")).sendKeys("abc");
		
		/*
		 * adana alert rakunda manam alert ki switch itea e exception vastadi "org.openqa.selenium.NoAlertPresentException"
		 * adana alert vachina tarvata manam aa alert medha a action tisukokapotea e exception vastadi
		   "org.openqa.selenium.UnhandledAlertException"
		 * manam adana wait echina adi em action perform chaiyakapotea "org.openqa.selenium.TimeoutException"
		 */
		
		driver.close();
		
	}

}
