package com.epam.image;

// DO NOT CHANGE THIS FILE
public final class Image {
    private final byte[] content;
    private final String filename;

    public Image(byte[] content, String filename) {
        this.content = content;
        this.filename = filename;
    }

    public byte[] getContent() {
        return content;
    }

    public String getFilename() {
        return filename;
    }
}
