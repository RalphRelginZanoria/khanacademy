package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import session.Instance;

public class SearchFunctionality extends Instance {
	@FindBy(xpath="//div/nav/div/div[1]/div[2]/a/div/span") public WebElement searchField;
	@FindBy(css="input[data-test-id=page-search-box]") public WebElement searchQueryField;
	@FindBy(xpath="//*[@id='___gcse_0']/div/div/div/div[5]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a") public WebElement pixarOverviewObject;


	//searchQueryField = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated)
	public SearchFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void clickSearchField(){
		searchField.click();
	}

	public void enterSearchQuery(String search) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-test-id=page-search-box]")));
		searchQueryField.sendKeys(search);
		searchQueryField.submit();

	}

	public void clickPixarOverview() {
		pixarOverviewObject.click();
	}

}
