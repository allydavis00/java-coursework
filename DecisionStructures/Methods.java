//Allyson Davis
//LIS4381 - skill set 4
import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        //display program requirements
        System.out.println("Developer: Allyson Davis");
        System.out.println("Program evaluates user-entered characters.");
        System.out.println("Use following charcters: W or w, C or c, H or h, N or n.");
        System.out.println("Use following decision structures: if...else, and switch.\n");

    }//end getRequirements

    public static void decisionStructures() {
        Scanner scnr = new Scanner (System.in);
        char c = ' ';

        System.out.println("Phone types: W or w (work), C or c (cell), H or h (home), N or n (none).");
        System.out.print("Enter phone type: ");
        c = input.next().charAt(0);

        final char x = Character.toUpperCase(c);

        System.out.println("\nif...else:");
        if (x == 'W') 
            System.out.println("Phone type: work");
        else if (x == 'C')
            System.out.println("Phone type: cell");
        else if (x == 'H')
            System.out.println("Phone type: home");
        else if (x == 'N')
            System.out.println("Phone type: none");
        else
            System.out.println("Inncorect charcter entry.");

        System.out.println("\nswtich:");
        switch(x) {
            case 'W' :
                System.out.println("Phone type: work");
                break;
            case 'C':
                System.out.println("Phone type: cell");
                break;
            case 'H':
                System.out.println("Phone type: home");
                break;
            case 'N':
                System.out.println("Phone type: none");
                break;
            default
                System.out.println("Inncorect charcter entry.");
        
        }//end switch
        System.out.println();
    }//end decisionStructures
}