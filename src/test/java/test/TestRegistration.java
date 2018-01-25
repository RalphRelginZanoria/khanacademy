package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Registration;
import session.Instance;

public class TestRegistration extends Instance {
	Registration registration;

	@BeforeClass
	public void setup() {
		Instance.createChromeSessionAndNavigateTo("http://www.khanacademy.org");
		registration = new Registration();
	}

	@Test(priority = 1)
	public void checkIfSignUpLinkIsClickable() {
		registration.clickSignUpLink();
	}

	@Test(priority = 2)
	public void checkIfLearnerButtonIsClickable() {
		registration.clickLearnerButton();
	}

	@Test(priority = 3)
	@Parameters({ "birthMonth2", "birthDay2", "birthYear2", "email2", "firstName2", "lastName2", "password2" })
	public void checkIfUserCanRegister(String birthMonth2, String birthDay2, String birthYear2, String email2,
			String firstName2, String lastName2, String password2) {

		registration.selectBirthMonth(birthMonth2);
		registration.selectBirthDay(birthDay2);
		registration.selectBirthYear(birthYear2);

	}

	@Test(priority = 4)
	public void checkIfUserCanSignUpWithEmail() {
		registration.clickSignUpWithEmailButton();
	}

	@Test(priority = 5)
	@Parameters({ "email2", "firstName2", "lastName2", "password2" })
	public void checkIfUserCanRegister(String email2, String firstName2, String lastName2, String password2) {
		registration.enterEmail(email2);
		registration.enterFirstName(firstName2);
		registration.enterLastName(lastName2);
		registration.enterPassword(password2);
		registration.clickSignUpButton2();
	}

	@AfterClass
	public void teardown() {
		// driver.quit();
	}

}
