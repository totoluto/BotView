package ch.totoluto.botgui.gui.objects;

public class User extends Discord{
    private String name;
    private Boolean isABot;

    public User(String id, String name, Boolean isABot) {
        super(id);
        this.name = name;
        this.isABot = isABot;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getABot() {
        return isABot;
    }
    public void setABot(Boolean ABot) {
        isABot = ABot;
    }
}
