package a3ShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("chrome://downloads/");
		
		/*
		 * e webelement shadow root kinda undi kabati sendkeys method pani chaiyatm leadu ala chaiyakapotea e exception
		   vastadi org.openqa.selenium.NoSuchElementException.
		 * deni overcome chaiyali antea "javascriptexecutor" use chaiyali.
		 */
		//driver.findElement(By.id("searchInput")).sendKeys("abc");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = (WebElement) jse.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		
		String js = "arguments[0].setAttribute('value', 'Abdul')";
		
		jse.executeScript(js, element);
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
