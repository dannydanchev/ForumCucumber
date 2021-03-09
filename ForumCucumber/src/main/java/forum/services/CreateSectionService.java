package forum.services;

import java.util.ArrayList;
import java.util.List;

import forum.Section;
import forum.User;

public class CreateSectionService {
	
	public static String create(String name, String description, User user) {
		
		if(!user.getModeratorRights()) {
			return "You don't have rights to create a section!";
		}
		
		if((null == name || name.isEmpty()) && (null == description || description.isEmpty())) {
			return "Please enter a section name and description";
		}
		
		if(null == name || name.isEmpty()) {
			return "Please enter a section name";
		}
		
		if(null == description || description.isEmpty()) {
			return "Please enter a section description";
		}
		
		final List<Section> sections = getSections();
		
		boolean isSectionAlreadyExists = sections.stream().anyMatch(s -> s.getSectionName().equals(name));
		if (isSectionAlreadyExists) {
			return "This section already exists";
		}
		
		final Section newSection = new Section(name, description);
		sections.add(newSection);
		return sections.contains(newSection) ? "Forum section successfully created" : "";
	}
	
	public static List<Section> getSections(){
		final Section section = new Section("section1", "description");
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(section);
		return sections;
	}
}
