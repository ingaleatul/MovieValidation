package Pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver chromeBrowser() {
		
		
	    WebDriverManager.chromedriver().setup();
	    
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		
		return driver;
	}

}
