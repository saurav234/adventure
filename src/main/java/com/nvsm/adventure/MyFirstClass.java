package com.nvsm.adventure;

public class MyFirstClass {

    public static void main(String[] args) {
        System.out.println("Hello World !!!! Monika has arrived");

        int starCount = 0;
        int spaceCount = 43;
        while(starCount < 43) {
            for(int j = 1; j <spaceCount; j++) {
                System.out.print(" ");
            }
            spaceCount = spaceCount - 1;

            for(int k = 0; k <= starCount; k++) {
                System.out.print("*");
            }
            System.out.println("");
            starCount = starCount +2;
        }
    }
}
