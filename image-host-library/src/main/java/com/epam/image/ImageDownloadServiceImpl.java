package com.epam.image;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

// DO NOT CHANGE THIS CLASS
public final class ImageDownloadServiceImpl implements ImageDownloadService{
    @Override
    public Image downloadImage(Token token, ImageRequest request) {

        if (!"TASK_SECRET_TOKEN".equals(token.getToken())) {
            throw new RuntimeException("Invalid or missing token!");
        }

        if (!List.of("AAA","BBB").contains(request.getId())) {
            throw new RuntimeException("Invalid or missing ID!");
        }

        if (request.getQuality()== Quality.HIGH && !Objects.equals(request.getId(), "AAA")) {
            throw new RuntimeException("Invalid ID and Quality combination!");
        }

        if (request.getQuality()== Quality.LOW && !Objects.equals(request.getId(), "BBB")) {
            throw new RuntimeException("Invalid ID and Quality combination!");
        }

        if (request.getColorSchema()!=ColorSchema.BW) {
            throw new RuntimeException("Invalid ColorSchema!");
        }

        if (request.getFileExtension()!=FileExtension.JPG) {
            throw new RuntimeException("Invalid file extension!");
        }

        return new Image(
                "image".getBytes(StandardCharsets.UTF_8),
                request.getId()+".jpg"
        );
    }
}
