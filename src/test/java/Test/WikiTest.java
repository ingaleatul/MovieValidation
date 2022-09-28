package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MoviePage.WikiPushpa;
import Pojo.Browser;

public class WikiTest {
	
public WebDriver driver;
	

	@BeforeMethod

	public void openBrowser() {

		driver = Browser.chromeBrowser();

	}

	@Test
	public void movie() {
		WikiPushpa pushpa= new WikiPushpa(driver);
		pushpa.enterMovie("Pushpa: The Rise - Part 1",driver);
		pushpa.scrollPage(driver);
		pushpa.extractDate();
		pushpa.extractCountry();
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
