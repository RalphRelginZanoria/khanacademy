package test;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.SearchFunctionality;
import session.Instance;

public class TestSearchFunctionality {
	SearchFunctionality searchQuery;

	@BeforeClass
	public void setup() {
		Instance.createChromeSessionAndNavigateTo("https://www.khanacademy.org/");
		searchQuery = new SearchFunctionality();
	}

	@Test
	public void checkIfSearchQueryisFuntioning() {
		searchQuery.clickSearchField();
		searchQuery.enterSearchQuery("Pixar in a Box");

	}

	@Test
	public void selectingOverviewofPixarInABox() {
		searchQuery.clickPixarOverview();
		Assert.assertEquals("https://www.khanacademy.org/partner-content/pixar/start/introduction/v/pipeline-video", Instance.driver.getCurrentUrl());
	}

}
