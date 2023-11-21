package a6svg_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("b");
		
		driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='path'])[2]")).click();
		
		
		driver.close();
		
	}

}
