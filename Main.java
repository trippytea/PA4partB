// James Tillman
// C00464384
// CMPS 260
// Programming Assignment : [insert assignment number here]
// Due Date : 10/25/2020
// Program Description: parts 3 and 4 of PA4. photo class with methods
// Certificate of Authenticity:
// I certify that the code in the Main, Photograph, and Camera classes
// of this project is entirely my own work with the exception of the
// provided factory methods.
// signed, James Tillman.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String enterDate = " ";
        int pixelPos = 0;
        int enterPixel = -1;
        int memSize = 0;
        Camera[] mem;
        while (enterPixel > 255 || enterPixel < 0) {
            System.out.print("Enter a pixel between 0 and 255, inclusive :");
            enterPixel = in.nextInt();
        }

        while (memSize < 16) {
            System.out.print("Enter the size of the memory card: ");
            memSize = in.nextInt();
            in.nextLine();
            mem = Camera.memory(memSize);
            System.out.println(mem);
        }

        while (enterDate.length() != 8) {
            System.out.print("Enter a date in the format YYYYMMDD : ");
            enterDate = in.nextLine();
        }

        //Photo test = new Photo();
        //test.setPixel(0,enterPixel);
        //test.setDate(enterDate);
        //System.out.println(test.getDate()); // get date test
        //System.out.println(test.getPixel(0)); // get pixel in the array test

        String menuChoice = "null";
        while (!menuChoice.equals("Q")) {
            System.out.println("1) Display the number of photographs");
            System.out.println("2) Add a randomly-generated photograph");
            System.out.println("3) Add a factory-generated photograph");
            System.out.println("4) Set the camera’s date");
            System.out.println("5) Display the date and size of the oldest photograph");
            System.out.println("6) Display the date and size of the largest photograph");
            System.out.println("7) Display the date and size of photographs in the camera’s memory");
            System.out.println("Q) Halt the application");
            System.out.print("Select a menu choice: ");
            menuChoice = in.nextLine();
            switch (menuChoice) {
                case "1":
                    System.out.print("There are" + mem.length);

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "Q":

                    break;
            }


        }



        /**Photo all255 = Photo.createAll255sPhotograph();
        int all255Size = all255.getSize();
        String all255Date = all255.getDate();
        System.out.print("createAll255sPhotograph Factory: ");
        System.out.print(all255Size);
        System.out.print(" ");
        System.out.println(all255Date);

        Photo minPhoto = Photo.createMinimumPhotograph();
        int minPhotoSize = minPhoto.getSize();
        String minPhotoDate = minPhoto.getDate();
        System.out.print("createMinimumPhotograph Factory: ");
        System.out.print(minPhotoSize);
        System.out.print(" ");
        System.out.println(minPhotoDate);

        Photo checkerPhoto = Photo.create7x7Checkerboard();
        int checkerPhotoSize = checkerPhoto.getSize();
        String checkerPhotoDate = checkerPhoto.getDate();
        System.out.print("createMinimumPhotograph Factory: ");
        System.out.print(checkerPhotoSize);
        System.out.print(" ");
        System.out.println(checkerPhotoDate);**/


    }
}
