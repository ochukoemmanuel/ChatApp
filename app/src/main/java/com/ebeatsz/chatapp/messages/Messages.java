package com.ebeatsz.chatapp.messages;

public class Messages {
    private String name, email, lastMessage, profile_pic;
    private int unseenMessages;

    public Messages(String name, String email, String lastMessage, String profile_pic, int unseenMessages) {
        this.name = name;
        this.email = email;
        this.lastMessage = lastMessage;
        this.profile_pic = profile_pic;
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

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public int getUnseenMessages() {
        return unseenMessages;
    }

    public void setUnseenMessages(int unseenMessages) {
        this.unseenMessages = unseenMessages;
    }
}
