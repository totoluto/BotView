package ch.totoluto.botgui.gui.objects;

import java.util.ArrayList;

public class TextChannel extends Discord {
    private String name;
    private ArrayList<Message> messages;
    private String profileURL;
    private String nickname;

    public TextChannel(String id, String name, ArrayList<Message> messages, String profileURL, String nickname) {
        super(id);
        this.name = name;
        this.messages = messages;
        this.profileURL = profileURL;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    public void addMessages(Message message){
        this.messages.add(message);
    }
    public String getProfileURL() {
        return profileURL;
    }
    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
