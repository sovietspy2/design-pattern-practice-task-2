package com.epam.service;

import com.epam.image.*;
import com.epam.image.Image;
import com.epam.model.UserImage;

import java.io.File;
import java.io.InputStream;
import java.util.UUID;

public class FileService {

    private final ImageDownloadFacade imageDownloadFacade = new ImageDownloadFacade();

    // DO NOT CHANGE THIS METHOD
    public InputStream loadFileFromSystem() {
        // Implementation
        return null;
    }

    // DO NOT CHANGE THIS METHOD
    public File loadUserData() {
        // Implementation
        return null;
    }

    public UserImage downloadSomeImage(String id) {

        Image image = imageDownloadFacade.download(id, Quality.HIGH);

        return new UserImage(
                image.getContent(),
                createUUID()
        );
    }

    // DO NOT CHANGE THIS METHOD
    private UUID createUUID() {
        // Some logic
        return UUID.fromString("39120c5e-02dd-408e-b1c5-0feeb429edbe");
    }


}
