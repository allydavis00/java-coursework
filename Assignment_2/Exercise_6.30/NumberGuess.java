//Allyson Davis
//NumberGuess.java
//Exercise_6.30

import java.util.Scanner;
import java.security.SecureRandom;

public class NumberGuess {

    public static void main(String[] args) {
        int input;
        char choice = 'N';
        Scanner scnr = new Scanner(System.in);

        do {
            //get a random number
            SecureRandom randomNumbers = new SecureRandom();
            int randomValue = 1 + randomNumbers.nextInt(1000);

            //prompt user & get input
            System.out.print("Guess a number between 1 and 1000 > ");
            input = scnr.nextInt();

            while (input != randomValue) {
                if(input > randomValue) {
                    System.out.print("Too high. Try again. > ");
                    input = scnr.nextInt();
                }
                else {
                    System.out.print("Too Low. Try again. > ");
                    input = scnr.nextInt();
                }
            }//end while

            if (input == randomValue) {
                System.out.print("\nCongratulations. You guessed the number!\nWould you like to play again? (Y or N) > ");
                choice = scnr.next().charAt(0);
                choice = Character.toUpperCase(choice);
            }

            System.out.println();
            
        } while (choice == 'Y');

    }//end main
}