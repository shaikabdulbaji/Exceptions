package a4flipkart_suggestions_with_blur_in_eventlisteners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.flipkart.com");
		
		/*
		 * manam flipkart lo adana search cheaseatapudu dani search box to type cheastea manaki koni suggestions vastai
		   aa suggestions ni inspect ala chaiyali.
		 * normal ga aa suggestions lo oka dani paiki velli inspect cheastea aa suggestions potai.
		 * mari ala inspect cheasi automate chestam antea, deniki manchi solution undi.
		 
		   open flipkart --> inspect anywhere --> go to right small window --> event listeners --> blur --> click 
		   on remove --> search any iteam --> inspect.
		 */
		
		
		
		driver.close();
		
	}

}
