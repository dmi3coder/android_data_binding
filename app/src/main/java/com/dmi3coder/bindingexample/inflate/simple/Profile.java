package com.dmi3coder.bindingexample.inflate.simple;


import java.util.Date;

public class Profile {

    private String nickname;
    private String description;
    private boolean online;
    private Date date;
    private int followers;
    private boolean inFriends;

    public Profile(String nickname, String description, boolean online, Date date, int followers, boolean inFriends) {
        this.nickname = nickname;
        this.description = description;
        this.online = online;
        this.date = date;
        this.followers = followers;
        this.inFriends = inFriends;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public boolean isInFriends() {
        return inFriends;
    }

    public void setInFriends(boolean inFriends) {
        this.inFriends = inFriends;
    }

}
