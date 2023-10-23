package b10SessionNotCreatedException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		/*
		 * correct chrome driver vadali lekapotea sessionNotCreated exception ani vastadi, browser a updated version untea
		   aa updated browsers veasi run chestea saripotadi.
		 * apudu updated browser a run aavali antea "WebDriverManager" dependencies use chestea saripodi.
		 */
		
		driver.get("https://omayo.blogspot.com");
		
		driver.close();
		
	}

}
