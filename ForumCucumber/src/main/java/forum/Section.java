package forum;
import java.util.*;

public class Section {

    public Section() {
    }
    
    public Section(String name, String description) {
    	this.name = name;
    	this.description = description;
    }
    
    private int id;

    public User sectionCreator;

    public String name;

    public String description;

    public User User;

    public Set<Topic> Topics;

    public String getSectionName() {
        return name;
    }

    public void setSectionName(String name) {
        this.name = name;
    }

    public String getSectionDescription() {
        return description;
    }
    
    public void setSectionDescription(String description) {
        this.description = description;
    }

}