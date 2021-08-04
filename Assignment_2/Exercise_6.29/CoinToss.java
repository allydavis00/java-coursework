//Allyson Davis
//CoinToss.java
//Exercise_6.29

import java.util.Scanner;
import java.security.SecureRandom;

public class CoinToss {
    public enum Coin { HEADS, TAILS };

    public static Coin flip() {
        SecureRandom randomNumbers = new SecureRandom();
        int randomValue = randomNumbers.nextInt(2);
        if (randomValue == 0) {
            return Coin.HEADS;
        }
        else {
            return Coin.TAILS;
        }
    }

    public static void main(String[] args) {
        int flipNum = 0;
        int totalH = 0;
        int totalT = 0;

        //create Scanner
        Scanner scnr = new Scanner(System.in);

        while(flipNum != -1) {
            int countH = 0;
            int countT = 0;

            System.out.print("Enter number of times to toss the coin OR -1 to exit: ");
            flipNum = scnr.nextInt();

            for (int i = 0; i < flipNum; i++) {
                if (flip() == Coin.HEADS) {
                    countH++;
                    totalH++;
                }
                else {
                    countT++;
                    totalT++;
                }
                    
            }//end for loop

            if (flipNum > 0)
                System.out.printf("Heads: %d  Tails: %d%n", countH, countT);

        }//end while

        System.out.printf("%nTotal Heads: %d  Total Tails: %d%n", totalH, totalT);

    }//end main
}