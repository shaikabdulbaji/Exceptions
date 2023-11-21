package b10Tooltip_with_freezeingpage_by_f8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		WebElement mouse = driver.findElement(By.className("tooltip-inner"));
		System.out.println(mouse.getText());
		
		/*
		 * asal e tool tip retrive chaiyali antea manku inspect cheaseatapudu aa tool tip close iedi, dani retrive 
		   chaiyali antea, manam page ni freeze(fun+f8) cheasi dani inspect chestea saripotadi.
		 */
		
		driver.close();
		
	}

}
