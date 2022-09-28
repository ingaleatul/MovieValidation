package MoviePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBPushpa {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='suggestion-search']")
	private WebElement search;
	@FindBy(xpath = "//li[@data-testid='title-details-releasedate']")
	private WebElement date;
	@FindBy(xpath = "//li[@data-testid='title-details-origin']")
	private WebElement country;
	@FindBy (xpath = "//li[@id='react-autowhatever-1--item-0']/a") private WebElement title;
	
	

	public IMDBPushpa(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterMovie(String movie,WebDriver driver) {
		search.sendKeys(movie);
		title.click();
	
	}
	

	public void extractDate() {
		System.out.println(date.getText());
	}

	public void extractCountry() {
		System.out.println(country.getText());
	}

}
