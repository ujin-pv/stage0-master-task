package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength; i > 0; i--){
            for(int j = 1; j < cathetusLength + 1; j++){
                if(j >= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
