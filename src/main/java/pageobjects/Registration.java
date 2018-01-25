package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import session.Instance;

public class Registration extends Instance {
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
	}

	@FindBy(css = "a[href='/signup?continue=%2F']")
	public WebElement signUpButton;
	@FindBy(css = "button[class='button_dn23dd-o_O-selected_jtxorj']")
	public WebElement learnerButton;
	@FindBy(css = "select[name='birth[month]'")
	public WebElement birthMonthMenu;
	@FindBy(css = "select[name='birth[day]'")
	public WebElement birthDayMenu;
	@FindBy(css = "select[name='birth[year]'")
	public WebElement birthYearMenu;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > div:nth-child(2) > div.buttons_1uzfa24 > div:nth-child(3) > button")
	public WebElement signUpWithEmailButton;
	@FindBy(css = "#_kareact_1 > div > div.progressShell_zx7qjx-o_O-standaloneProgressShell_zrqlgn-o_O-progressShellPadding_107aw0v > section.actionScreen_1012r2-o_O-actionScreenHeight_ogyq09-o_O-actionScreenPadding_18razct > div > form > div:nth-child(1) > div.fieldWrapper_1u6tck2 > input")
	public WebElement emailField;
	@FindBy(xpath = "//*[@id='_kareact_1']/div/div[3]/section[2]/div/form/div[2]/div/label[1]/input")
	public WebElement firstNameField;
	@FindBy(xpath = "//*[@id='_kareact_1']/div/div[3]/section[2]/div/form/div[2]/div/label[2]/input")
	public WebElement lastNameField;
	@FindBy(xpath = "//*[@id='_kareact_1']/div/div[3]/section[2]/div/form/div[3]/div[1]/input")
	public WebElement passwordField;
	@FindBy(xpath = "//*[@id='_kareact_1']/div/div[3]/section[2]/div/nav/div[2]/button/div")
	public WebElement signUpButton2;

	public Registration() {
		AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajaxElementLocatorFactory, this);
	}

	public void clickSignUpLink() {
		signUpButton.click();
	}

	public void clickLearnerButton() {
		learnerButton.click();
	}

	public void selectBirthMonth(String birthMonth) {
		birthMonthMenu.sendKeys(birthMonth);
	}

	public void selectBirthDay(String birthDay) {
		birthDayMenu.sendKeys(birthDay);
	}

	public void selectBirthYear(String birthYear) {
		birthYearMenu.sendKeys(birthYear);
	}

	public void clickSignUpWithEmailButton() {
		signUpWithEmailButton.click();
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickSignUpButton2() {
		signUpButton2.click();
	}

}
