package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MoviePage.IMDBPushpa;

import Pojo.IMDBBrowser;

public class IMDBTest {

	public WebDriver driver;
	

	@BeforeMethod

	public void openBrowser() {

		driver = IMDBBrowser.chromeBrowser();

	}

	@Test
	public void movie() {
		IMDBPushpa im = new IMDBPushpa(driver);
		im.enterMovie("Pushpa: The Rise - Part 1",driver);
		im.extractDate();
		im.extractCountry();
	}
	@AfterMethod
	public void driverClose() {
	driver.close();
	}
}
