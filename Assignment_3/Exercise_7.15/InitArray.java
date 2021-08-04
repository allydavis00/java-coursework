//Allyson Davis
//InitArray.java
//Exercise 7.15

import java.util.Scanner;

public class InitArray {
    public static void main (String[] args) {
        int[] myArray;

        if (args.length == 0){
            myArray = new int[10];
        }
        else {
            int arrayLength = Integer.parseInt(args[0]);
            myArray = new int[arrayLength];
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < myArray.length; counter++) {
            System.out.printf("%5d%8d%n", counter, myArray[counter]);
        }
    }
}