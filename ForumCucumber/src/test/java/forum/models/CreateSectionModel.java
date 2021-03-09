package forum.models;

import forum.User;
import forum.services.CreateSectionService;

public class CreateSectionModel {
	
	private String sectionName;
	private String sectionDescription;
	private String message = "";
	
	private User user;
	
	public void navigateToMe() {
		System.out.println("New Section button clicked");
	}
	
	public void setSectionName(final String sectionName) {
		this.sectionName = sectionName;
	}
	
	public void setSectionDescription(final String sectionDescription) {
		this.sectionDescription = sectionDescription;
	}
	
	public void clickCreateSection() {
		message = CreateSectionService.create(sectionName, sectionDescription, user);
	}
	
	public String getCreateMessage() {
		if(message.isBlank()) {
			clickCreateSection();
		}
		return message;
	}

	public void giveUserRights(boolean isModerator) {
		user = new User("testUser",isModerator);
	}
}
