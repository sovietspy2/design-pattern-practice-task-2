package com.epam.service;

import com.epam.image.*;
import com.epam.model.Profile;

public class ProfileService {

    private final DatabaseService databaseService = new DatabaseService();

    private static String TOKEN = "TASK_SECRET_TOKEN";

    public Profile getProfile(String id) {

        String realName = databaseService.getRealNameById(id);

        ImageDownloadService imageDownloadService = new ImageDownloadServiceImpl();

        Token token = new Token(TOKEN);

        ImageRequest imageRequest = new ImageRequest();
        imageRequest.setId(id);

        imageRequest.setColorSchema(ColorSchema.BW);
        imageRequest.setFileExtension(FileExtension.JPG);

        imageRequest.setQuality(Quality.LOW);

        Image image = imageDownloadService.downloadImage(token, imageRequest);

        return new Profile(realName, image.getContent());
    }

}
