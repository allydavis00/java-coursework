import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Developer: Allyson Davis");
        System.out.println("Program evaluates integers as even or odd.");
        System.out.println("Note: Program does *not* check for non-numeric characters.\n");

        //declare vars
        int num;
        //scanner obj
        Scanner scnr = new Scanner(System.in);

        //prompt
        System.out.print("Enter integer: ");
        num = scnr.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is an even number.");
        else
            System.out.println(num + " is an odd number.");
        //even or odd
    }//end main
}