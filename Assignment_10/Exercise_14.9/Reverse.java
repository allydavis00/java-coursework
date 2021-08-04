//Allyson Davis
//Exercise 14.9
//Reverse.java

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = scnr.nextLine();
        String tokens[] = line.split(" ");

        System.out.println("\nReversing sentence...");
        for(int i = tokens.length-1;i>=0;i--){
            System.out.print(tokens[i]+" ");
        }
    }//end main
}//end class