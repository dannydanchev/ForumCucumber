package forum;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import forum.models.CreateSectionModel;

public class CreateSectionSteps {
	
	CreateSectionModel createSection = new CreateSectionModel();
	
	@Given("^User has moderator rights$")
	public void userHasModeratorRights() throws Throwable {
	    createSection.giveUserRights(true);
	}

	@Given("^User does not have moderator rights$")
	public void userDoesNotHaveModeratorRights() throws Throwable {
		createSection.giveUserRights(false);
	}
	
	@Given("^User clicks the New Section button$")
	public void openCreateSectionWindow() throws Throwable {
	    createSection.navigateToMe();
	}

	@When("^Enters section name \"([^\"]*)\"$")
	public void addSectionName(final String sectionName) throws Throwable {
	    createSection.setSectionName(sectionName);
	}

	@When("^Enters a section description \"([^\"]*)\"$")
	public void addSectionDescription(final String sectionDescription) throws Throwable {
	    createSection.setSectionDescription(sectionDescription);
	}

	@When("^Clicks on the Create Section button$")
	public void clickCreateSectionButton() throws Throwable {
	    createSection.clickCreateSection();
	}

	@Then("^User sees the message \"([^\"]*)\"$")
	public void checkCreateMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, createSection.getCreateMessage());
	}
}
