import java.util.Scanner;

public class ArraysAndLoops {
    public static void main(String[] args) {
        System.out.println("Developer: Allyson Davis");
        System.out.println("Program loops through array of strings.");
        System.out.println("Use following values: dog, bird, fish, insect.");
        System.out.println("Use following loop structures: for, enhanced for, while, do...while.\n");
        System.out.println("Note: Pretest loops: for, enhanced for, while. Posttest loop: do...while.");

        //declare array
        String[] arr = {"dog", "bird", "fish", "insect"};

        //for loop
        System.out.println("\nFor loop:");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }

        //enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for( String data : arr) {
            System.out.println(data);
        }

        //while loop
        System.out.println("\nWhile loop:");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        //do...while loop
        System.out.println("\nDo...while loop:");
        i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while(i < arr.length);

    }//end main
}