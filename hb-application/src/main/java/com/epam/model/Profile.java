package com.epam.model;

// DO NOT CHANGE THIS FILE
public class Profile {
    private String realName;
    private byte[] content;

    public Profile(String realName, byte[] image) {
        this.realName = realName;
        this.content = image;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public byte[] getImageContent() {
        return content;
    }

    public void setImageContent(byte[] imageContent) {
        this.content = imageContent;
    }
}
