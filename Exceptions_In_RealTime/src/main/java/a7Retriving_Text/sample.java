package a7Retriving_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		
		//getText() --> This method only gives text
		/*
		System.out.println(driver.findElement(By.xpath("//h3[text()='This is an example of paragraphs']")).getText());		
		System.out.println(driver.findElement(By.id("p1")).getText());		
		System.out.println(driver.findElement(By.id("p2")).getText());
		System.out.println(driver.findElement(By.id("p3")).getText());
		*/
		
		
		//getAttribute("textContent") --> This method gives inner content
		/*
		System.out.println(driver.findElement(By.id("p1")).getAttribute("textContent"));		
		System.out.println(driver.findElement(By.id("p2")).getAttribute("textContent"));
		System.out.println(driver.findElement(By.id("p3")).getAttribute("textContent"));
		*/
		
		//getAttribute("textContent") --> This method gives inner content with HTML 
		/*
		System.out.println(driver.findElement(By.id("p1")).getAttribute("innerHTML"));		
		System.out.println(driver.findElement(By.id("p2")).getAttribute("innerHTML"));
		System.out.println(driver.findElement(By.id("p3")).getAttribute("innerHTML"));
		*/
		
		/*
		driver.findElement(By.id("input1")).sendKeys("selenium");
		System.out.println(driver.findElement(By.id("input1")).getAttribute("value"));
		driver.findElement(By.id("input1")).clear();
		driver.findElement(By.id("input1")).sendKeys("myselect");
		System.out.println(driver.findElement(By.id("input1")).getAttribute("value"));
		*/
		
		System.out.println(driver.findElement(By.id("link")).getAttribute("href"));
		
		driver.close();
		
	}

}
