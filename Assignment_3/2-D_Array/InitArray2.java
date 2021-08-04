import java.util.Scanner;
import java.security.SecureRandom;

public class InitArray2 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        //create 2D array with 6 rows and 4 columns
        int [][] a = new int [6][4];

        //fill first 5 rows and 3 columns with random numbers
        for (int row = 0; row < 5; row++) {
            int rowSum = 0;
            for (int col = 0; col < 3; col++) {
                int randomValue = randomNumbers.nextInt(10);
                a[row][col] = randomValue;
                rowSum +=a[row][col];
            }
            //fill first 5 cells in the 4 column with sum of the ints in cells of corresponding rows
            a[row][3] = rowSum;
        }

        //fill first 3 cells of the 6 row with sums of ints in corresponding columns
        for (int col = 0; col < 3; col++) {
            int colSum = 0; 
            for (int row = 0; row < 5; row++) {
                colSum += a[row][col];
            }
            a[5][col] = colSum;
        }

        //bottom corner cell = 0
        a[5][3] = 0;

        //print to screen
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }

    }//end main
}//end class