//Allyson Davis
//product.java
//Exercise 7.14

import java.util.Scanner;

public class Product {
    public static void main (String[] args) {
        int a = 23;
        int b = 56;
        int c = 2;
        int d = 330;

        System.out.printf("a = %d%nb = %d%nc = %d%nd = %d%n", a, b, c, d);
        System.out.printf("%nProduct of a and b is %d%n", product(a, b));
        System.out.printf("Product of b and d is %d%n", product(b, d));
        System.out.printf("Product of a, b, and c is %d%n", product(a, b, c));
        System.out.printf("Product of a, b, c, and d is %d%n", product(a, b, c, d));

    }//end main

    private static int product(int... nums) {
        int prod = 1;

        for(int p : nums) {
            prod *= p;
        }

        return prod;

    }//end product
}