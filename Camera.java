package com.company;

public class Camera {


    public static Camera[] memory(int memSize) {
        return new Camera[memSize];
    }
    public static int getMemSize(Camera[] memCard) {
        return memCard.length;
    }

}
