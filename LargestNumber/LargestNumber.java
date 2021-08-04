import java.util.Scanner;   //import statement to allow the program to take user input

public class LargestNumber {
    public static void main(String[] args) {
        //print statements to show name and progam details
        System.out.println("Developer: Allyson Davis");
        System.out.println("Program evaluates largest of two integers.");
        System.out.println("Note: Program does *not* check for non-numeric characters or non-integer values.\n");

        int num1, num2; //declare variables

        Scanner scnr = new Scanner(System.in);  //create scanner object for user input

        //prompt and take input
        System.out.print("Enter first integer: ");
        num1 = scnr.nextInt();

        System.out.print("Enter second integer: ");
        num2 = scnr.nextInt();

        System.out.println();   //blank line for spacing

        //evaluate user input
        if (num1 == num2) {
            System.out.println("Integers are equal.");
        }
        else if (num1 > num2) {
            System.out.printf("%d is larger than %d%n", num1, num2);
        }
        else {
            System.out.printf("%d is larger than %d%n", num2, num1);
        }
    }//end main
}