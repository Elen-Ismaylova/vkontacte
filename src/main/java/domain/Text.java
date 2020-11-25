package domain;

public class Text {

    private String text;
    private String userId;
    private boolean canPost;
    private String imageUrl;
    private String videoUrl;
    private long date;
    private long time;

    public String getText () {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserId() {
        return userId;

    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
