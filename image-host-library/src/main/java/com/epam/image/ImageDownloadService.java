package com.epam.image;

public interface ImageDownloadService {
    Image downloadImage(Token token, ImageRequest request);
}
