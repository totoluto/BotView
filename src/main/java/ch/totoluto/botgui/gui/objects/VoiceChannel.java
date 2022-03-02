package ch.totoluto.botgui.gui.objects;

public class VoiceChannel extends Discord{
    private String name;

    public VoiceChannel(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
