package com.epam.model;

import java.util.UUID;

// DO NOT CHANGE THIS FILE
public class UserImage {
    private byte[] content;
    private UUID uuid;

    public UserImage(byte[] content, UUID uuid) {
        this.content = content;
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
