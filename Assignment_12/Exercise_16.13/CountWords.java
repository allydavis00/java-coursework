//Allyson Davis
//Assignment 12
//Exercise 16.13

import java.util.*;

public class CountWords {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter input string: ");

        String str = scnr.nextLine();
        str = str.toUpperCase();

        String[] words = str.split(" "); //Split the word from String

        int c = 1;

        System.out.println("\nDuplicate Words are: ");

        for(int i = 0; i < words.length; i++) {

            for(int j = i + 1;j < words.length; j++) {

                if(words[i].equalsIgnoreCase(words[j])) {
                    c = c+1;
                    words[j]="0";
                }//end if

            }//end for

            if(words[i] != "0" && c > 1)

            System.out.println(words[i] + " appearing " + c + " times"); //Printing the word along with count

            c = 1;
        }//end for  
    }//end main
}//end class