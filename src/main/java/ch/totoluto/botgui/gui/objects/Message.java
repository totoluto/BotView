package ch.totoluto.botgui.gui.objects;

public class Message extends Discord {
    private User user;
    // String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    private String timeStamp;
    private String message;

    public Message(String id, User user, String timeStamp, String message) {
        super(id);
        this.user = user;
        this. timeStamp = timeStamp;
        this.message = message;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
