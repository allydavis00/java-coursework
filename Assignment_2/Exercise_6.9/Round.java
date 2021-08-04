//Allyson Davis
//Round.java
//Exercise_6.9

import java.util.Scanner;

public class Round{
    
    public static void main(String[] args){
        double a, b, c;
        double x, y, z;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = scnr.nextDouble();

        System.out.print("Enter second number: ");
        b = scnr.nextDouble();

        System.out.print("Enter third number: ");
        c = scnr.nextDouble();

        x = Math.floor(a + 0.5);
        y = Math.floor(b + 0.5);
        z = Math.floor(c + 0.5);

        System.out.printf("%nFirst Orignal Number: %f%nRounded: %f%n%n", a, x);
        System.out.printf("Second Orignal Number: %f%nRounded: %f%n%n", b, y);
        System.out.printf("Third Orignal Number: %f%nRounded: %f%n%n", c, z);
    }//end main
}