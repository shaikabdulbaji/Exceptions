package a3ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		
		WebElement ele = driver.findElement(By.xpath("//ul[@slot='my-text']"));
		String txt = ele.getText();
		System.out.println(txt);
		
		/*
		 * manam shadow root element ni find chaiyali antea javascriptexecutor use cheasi find chestamu but now we can find
		   by using "auomation(io.github.sukung)" depedency from maven
		 */
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
