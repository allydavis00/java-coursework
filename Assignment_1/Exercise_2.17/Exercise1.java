import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args) {
        int num1, num2, num3;
        int sum, avg, product;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        num1 = scnr.nextInt();

        System.out.print("Enter second integer: ");
        num2 = scnr.nextInt();

        System.out.print("Enter third integer: ");
        num3 = scnr.nextInt();

        sum = num1 + num2 + num3;
        System.out.printf("%nSum: %d%n", sum);

        avg = sum/3;
        System.out.printf("Average: %d%n", avg);

        product = num1 * num2 * num3;
        System.out.printf("Product: %d%n", product);

        if (num1 < num2 && num1 < num3) {
            System.out.printf("Smallest: %d%n", num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.printf("Smallest: %d%n", num2);
        }
        else if (num3 < num1 && num3 < num2) {
            System.out.printf("Smallest: %d%n", num3);
        }

        if (num1 > num2 && num1 > num3) {
            System.out.printf("Largest: %d%n", num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.printf("Largest: %d%n", num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.printf("Largest: %d%n", num3);
        }


    }//end main


}