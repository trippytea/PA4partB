package com.company;

public class Photo {
    private int[] pixelArray;
    private String date;

    public Photo() {
        pixelArray = new int[100];
        date = "19000101";
    }

    public Photo(int size , String date) {
        this.pixelArray = new int[size];
        this.date = date;
    }

    public void setPixel(int i , int pixel) {
        this.pixelArray[i] = pixel;
    }

    public int getPixel(int i) {
        return this.pixelArray[i];
    }

    public String getDate() {
        return date;
    }

    public int getSize() {
        return this.pixelArray.length;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static Photo createAll255sPhotograph() {
        Photo p = new Photo(100, "19000101");
        for(int i=0; i < p.pixelArray.length; i++) {
            p.pixelArray[i] = 255;
        }
        return p;
    }
    public static Photo createMinimumPhotograph() {
        return new Photo(4, "19000102");
    }
    public static Photo create7x7Checkerboard() {
        Photo p = new Photo(49, "19000103");
        for(int i=0; i < p.pixelArray.length; i++) {
            if(i%2 == 0)
                p.pixelArray[i] = 255;
            else
                p.pixelArray[i] = 0;
        }
        return p;
    }

}
