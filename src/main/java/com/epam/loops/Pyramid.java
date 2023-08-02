package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int k;
        for(int i = 0; i < cathetusLength; i++){
            k = i + 2;
            for(int j = 0; j < cathetusLength + i; j++){
                if(j < cathetusLength - i - 1)
                    System.out.print(" ");
                else if(j < cathetusLength)
                    System.out.print(--k);
                else System.out.print(++k);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(9);
    }

}
