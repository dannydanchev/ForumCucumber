package forum;
import java.util.*;

public class User {

    public User() {
    }

    public User(String username, Boolean isModerator) {
    	this.username = username;
    	this.isModerator = isModerator;
    }
    
    public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
    
    private int id;

    private String username;

    private String password;

    private String email;

    private Boolean isModerator;

    private Set<Post> posts = new HashSet<Post>();
    
	private Set<Topic> topics = new HashSet<Topic>();
	
	private Set<Section> sections = new HashSet<Section>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getModeratorRights() {
        return isModerator;
    }

    public void setModeratorRights(Boolean isModerator) {
        this.isModerator = isModerator;
    }

    public Set<Post> Posts;

    public Set<Topic> Topics;
    
    public Set<Section> Sections;
    
    public Set<Post> getPosts() {
        return posts;
    }

    public Set<Topic> getTopics() {
        return topics;
    }
    
    public Set<Section> getSections() {
        return sections;
    }

    public void setPosts(Set<Post> posts) {
    	this.posts = posts;
    }
    
    public void setTopics(Set<Topic> topics) {
    	this.topics = topics;
    }
    
    public void setSections(Set<Section> sections) {
    	this.sections = sections;
    }
    
    public void createPost(Post post) {
        posts.add(post);
    }

    public void createTopic(Topic topic) {
        topics.add(topic);
    }
    
    public void createSection(Section section) {
        sections.add(section);
    }
}