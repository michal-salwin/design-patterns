package com.michals.designpatterns.factorymethod;

public class GifImageReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifImageReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage decodeImage() {
        return decodedImage;
    }
}
