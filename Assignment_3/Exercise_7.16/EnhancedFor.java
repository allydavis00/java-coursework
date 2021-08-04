//Allyson Davis
//EnhancedFor.java
//Exercise 7.16

import java.util.Scanner;

public class EnhancedFor {
    public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No arguments entered.");
        }//end if

        else {
            double sum = 0;

            for(String x : args) {
                double y = Double.parseDouble(x);
                sum += y;
            }//end for loop

            System.out.printf("Sum of values = %.2f%n", sum);
        }//end else
    }
}