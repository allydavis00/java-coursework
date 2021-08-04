//Allyson Davis
//Assignment 7

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) 
        throws ArithmeticException {
            return numerator / denominator;
    }//end quotient

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            System.out.print("\nPlease enter an integer numerator: ");
            int numerator = scnr.nextInt();
            System.out.print("Please enter an integer denominator: ");
            int denominator = scnr.nextInt();

            try{
            //caluclate quotient
                int result = quotient(numerator,denominator);
                System.out.printf("%nResult: %d / %d = %d%n",numerator,denominator,result);
                continueLoop = false;//input successful.end looping
            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("Exception: %s%n",inputMismatchException);
                scnr.nextLine(); //discard input so user can try again
                System.out.printf("%nYou must enter integers.Please try again.%n");
            }
            catch(ArithmeticException arithmeticException){
                System.out.println();
                System.err.printf("Exception: %s%nOops, can't do that.", arithmeticException);
                System.out.printf("%nZero is an invalid denominator.Please try again.%n");
            }
            finally //finally block
            {
            System.out.println("\nNumerator is "+numerator);
            System.out.println("Denominator is "+denominator);
            }
        } while(continueLoop);
    }//end main
}//end class