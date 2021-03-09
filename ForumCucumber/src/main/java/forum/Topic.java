package forum;
import java.util.*;

public class Topic {

    public Topic() {
    }

    private int id;

    public int section_id;

    public User topicCreator;

    public String topicTitle;

    public String topicContent;

    public User User;

    public Set<Post> Posts;

    public Section Section;

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

}