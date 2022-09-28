package MoviePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPushpa {

	@FindBy(name = "search")
	private WebElement search;
	@FindBy(xpath = "//div[@id='mw-content-text']/div[1]/table[1]/tbody/tr[12]")
	private WebElement date;
	@FindBy(xpath = "//div[@id='mw-content-text']/div[1]/table[1]/tbody/tr[14]")
	private WebElement country;

	public WikiPushpa(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterMovie(String movie, WebDriver driver) {

		search.sendKeys(movie, Keys.ENTER);
	}
	
	public void scrollPage(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,800)", "");

	}

	public void extractDate() {
		System.out.println(date.getText());
	}

	public void extractCountry() {
		System.out.println(country.getText());
	}

}
