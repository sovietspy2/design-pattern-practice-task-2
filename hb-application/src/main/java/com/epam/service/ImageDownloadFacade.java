package com.epam.service;

import com.epam.image.*;

public class ImageDownloadFacade {

    private static final Token token = new Token("TASK_SECRET_TOKEN");
    private final ImageDownloadService service = new ImageDownloadServiceImpl();

    public Image download(String id, Quality quality) {

        ImageRequest imageRequest = new ImageRequest();
        imageRequest.setColorSchema(ColorSchema.BW);
        imageRequest.setFileExtension(FileExtension.JPG);
        imageRequest.setId(id);
        imageRequest.setQuality(quality);

        Image image = service.downloadImage(token, imageRequest);

        return image;
    }

}
