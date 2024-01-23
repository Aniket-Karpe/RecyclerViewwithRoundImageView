package com.aniket.userdemo.model;

import android.graphics.Bitmap;

public class Userdata {
    private int userId;
    private String  username;
    private String usercategoary;
    private Bitmap avatar;

    public Userdata(int userId, String username, String usercategoary, Bitmap avatar) {
        this.userId = userId;
        this.username = username;
        this.usercategoary = usercategoary;
        this.avatar = avatar;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsercategoary() {
        return usercategoary;
    }

    public void setUsercategoary(String usercategoary) {
        this.usercategoary = usercategoary;
    }

    public Bitmap getAvatar() {
        return avatar;
    }

    public void setAvatar(Bitmap avatar) {
        this.avatar = avatar;
    }
}
