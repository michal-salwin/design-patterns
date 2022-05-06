package com.michals.designpatterns.factorymethod;

public class JpegImageReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegImageReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage decodeImage() {
        return decodedImage;
    }
}
