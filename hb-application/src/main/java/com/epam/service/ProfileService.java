package com.epam.service;

import com.epam.image.*;
import com.epam.model.Profile;

public class ProfileService {

    private final DatabaseService databaseService = new DatabaseService();

    private final ImageDownloadFacade imageDownloadFacade = new ImageDownloadFacade();

    public Profile getProfile(String id) {

        String realName = databaseService.getRealNameById(id);

        Image image = imageDownloadFacade.download(id, Quality.LOW);

        return new Profile(realName, image.getContent());
    }

}
