//Allyson Davis
//Assignment 12
//Exerise 16.10

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //prompt for num of fnames
        System.out.print("Enter the number of first name: ");
        int n = scnr.nextInt();

        //empty array with size
        String [] firstName = new String[n];

        System.out.println("Enter all the first names: ");
        //loop to store fnames
        for(int i = 0; i < n; i++) {
            firstName[i] = scnr.next();
        }

        //list of first names
        List< String > list = Arrays.asList( firstName );

        //set of fnames using list
        Set < String > set = new HashSet < String > (list);

        //prompt to search first name
        System.out.print("\nEnter the name to be searched : ");
        String searchName = scnr.next(); 

        //search for fnames in set
        if (set.contains(searchName)) {
            System.out.println("Element found in set");
        }
        else {
            System.out.println("Element NOT found in set");
        }

        //print element of set
        printNonDuplicates(set);
    
    } //end main
    
    //eliminate duplicates
    private static void printNonDuplicates(Set < String > set) {
        System.out.print("\nNonduplicates are: ");
        for (String value: set)
        System.out.printf("%s ", value);

        System.out.println();
    } //end printNonDuplicates
} //end class