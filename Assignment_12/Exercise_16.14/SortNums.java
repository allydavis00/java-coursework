//Allyson Davis
//Assignment 12
//Exercise 16.14

import java.util.*;

public class SortNums {
   public static void main(String args[]) {
        Random rand = new Random(); // Creating an object of random class

        LinkedList<Integer> obj = new LinkedList<Integer>();

        for(int i = 0; i < 25; i++) {
            int val=rand.nextInt(101); // Generates a random number between 0 to 100
            obj.add(val); // Inserting into LinkedList
        }

        Collections.sort(obj); // Sorting LinkedList
        System.out.print("LinkedList elements after sorting : ");

        for(int i = 0; i < obj.size(); i++){
            System.out.print(obj.get(i) + " ");
        }

        System.out.print("\n");

        int sum = 0;

        for(int i = 0; i < obj.size(); i++){ // Calculating sum of elements of the LinkedList
            sum += obj.get(i);
        }

        System.out.println("Sum of the elements: " + sum);

        double avg = ((sum * 1.0) / 25); // Calculating average of elements of the LinkedList
        System.out.println("Average of the elements: " + avg);
    }//end main
}//end class