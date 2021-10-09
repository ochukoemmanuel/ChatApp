package com.ebeatsz.chatapp.messages;

public class Messages {
    private String name, email, lastMessage, profilepic;
    private int unseenMessages;

    public Messages(String name, String email, String lastMessage, String profilepic, int unseenMessages) {
        this.name = name;
        this.email = email;
        this.lastMessage = lastMessage;
        this.profilepic = profilepic;
        this.unseenMessages = unseenMessages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public int getUnseenMessages() {
        return unseenMessages;
    }

    public void setUnseenMessages(int unseenMessages) {
        this.unseenMessages = unseenMessages;
    }
}
