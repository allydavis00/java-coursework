//Allyson Davis
//AcountTest.java
import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //display intial balance of each object
        displayAccount(account1);
        displayAccount(account2);

        //create a Scanner to obtain uput from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account 1: ");   //prompt
        double depositAmount = input.nextDouble();  //obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n",
            depositAmount);
        account1.deposit(depositAmount);    //add to account1's balance

        //display balances
        displayAccount(account1);
        displayAccount(account2);
        
        System.out.print("Enter deposit amount for account 2: ");   //prompt
        depositAmount = input.nextDouble();  //obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n",
            depositAmount);
        account2.deposit(depositAmount);    //add to account2 balance

        //display balances
        displayAccount(account1);
        displayAccount(account2);
    }//end main

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", 
            accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}