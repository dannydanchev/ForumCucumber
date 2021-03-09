package forum;
import java.util.*;

public class Post {

    public Post() {
    }

    private int id;

    public int topic_id;

    public User postCreator;

    public String postContent;

    public Topic Topic;

    public String getPostContent() {
        return postContent;
    }
    
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

}