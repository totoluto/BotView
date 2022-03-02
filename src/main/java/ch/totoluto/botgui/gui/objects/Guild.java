package ch.totoluto.botgui.gui.objects;

import java.util.ArrayList;

public class Guild extends Discord {
    private String name;
    private String profileURL;
    private ArrayList<VoiceChannel> voiceChannels;
    private ArrayList<TextChannel> textChannels;
    private ArrayList<User> users;

    public Guild(String id, String name, String profileURL, ArrayList<VoiceChannel> voiceChannels, ArrayList<TextChannel> textChannels, ArrayList<User> users) {
        super(id);
        this.name = name;
        this.profileURL = profileURL;
        this.voiceChannels = voiceChannels;
        this.textChannels = textChannels;
        this.users = users;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfileURL() {
        return profileURL;
    }
    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }
    public ArrayList<VoiceChannel> getVoiceChannels() {
        return voiceChannels;
    }
    public void setVoiceChannels(ArrayList<VoiceChannel> voiceChannels) {
        this.voiceChannels = voiceChannels;
    }
    public void addVoiceChannel(VoiceChannel voiceChannel){
        this.voiceChannels.add(voiceChannel);
    }
    public ArrayList<TextChannel> getTextChannels() {
        return textChannels;
    }
    public void addTextChannel(TextChannel textChannel){
        this.textChannels.add(textChannel);
    }
    public void setTextChannels(ArrayList<TextChannel> textChannels) {
        this.textChannels = textChannels;
    }
    public ArrayList<User> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void addUser(User user){
        this.users.add(user);
    }
}
