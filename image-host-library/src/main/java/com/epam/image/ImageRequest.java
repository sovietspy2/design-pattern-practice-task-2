package com.epam.image;

// DO NOT CHANGE THIS FILE
public class ImageRequest {
    private String id;
    private ColorSchema colorSchema;
    private FileExtension fileExtension;
    private Quality quality;

    public ImageRequest() {

    }

    public ImageRequest(String id, ColorSchema colorSchema, FileExtension fileExtension, Quality quality) {
        this.id = id;
        this.colorSchema = colorSchema;
        this.fileExtension = fileExtension;
        this.quality = quality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ColorSchema getColorSchema() {
        return colorSchema;
    }

    public void setColorSchema(ColorSchema colorSchema) {
        this.colorSchema = colorSchema;
    }

    public FileExtension getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(FileExtension fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}
