package com.michals.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args){
        DecodedImage decodedImage;
        ImageReader reader = null;
        String file = "image.jpg";

        String format = file.substring(file.indexOf(".")+1,file.length());
        switch (format) {
            case "gif":
                reader = new GifImageReader(file);
            case "jpg":
                reader = new JpegImageReader(file);

        }

        assert reader != null;
        decodedImage = reader.decodeImage();
        System.out.println(decodedImage);
    }

}
