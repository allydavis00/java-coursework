//Allyson Davis
//Exercise 15.4
//Test.java

import java.io.*;

class CreateTestData {
    //write to oldmaster.txt
    public static void WriteToMaster() throws IOException {
        int account;
        String name;
        double balance;
        PrintWriter pw = new PrintWriter(new FileWriter("oldmaster.txt"), true);

        //Data for the following fields:
        //account number - firstname - lastname - balance
        //Can be modified
        Object[][] data = {
                {100, "Diego Maradonna", 1000.00},
                {200, "Hristo Stoichkov", 2000.00},
                {300, "Zinedine Zidane", 3000.00}
        };

        System.out.println("Contents of oldmaster.txt:");
        for (Object datum[] : data) {
            account = (int) datum[0];
            name = (String) datum[1];
            balance = (double) datum[2];
            System.out.println(account + " " + name + " " + balance);
            pw.println(account + " " + name + " " + balance);
        }
    }//end WriteToMaster

    //write to trans.txt
    public static void WriteToTrans() throws IOException {
        int account;
        double balance;
        PrintWriter pw = new PrintWriter(new FileWriter("trans.txt"), true);

        //Data for the following fields:
        //account number   transaction
        //Can be modified
        Object[][] data = {
                {100, 10.00},
                {200, 20.00},
                {300, 30.00}
        };
        System.out.printf("%nContents of trans.txt:%n");
        for (Object datum[] : data) {
            account = (int) datum[0];
            balance = (double) datum[1];
            System.out.println(account + " " + balance);
            pw.println(account + " " + balance);
        }
    }//end WriteToTrans
}//end CreateTestData class

class ReadAndMatchTestData {
    //read data from oldmaster.txt and trans.txt
    //match by acct numbers
    //if match, add transaction and print to new file

    public static void Match() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("newmaster.txt"),true);
        BufferedReader transReader = new BufferedReader(new InputStreamReader(new FileInputStream("trans.txt")));
        BufferedReader accountReader = new BufferedReader(new InputStreamReader(new FileInputStream("oldmaster.txt")));
        Account account = new Account();
        TransactionRecord tr = new TransactionRecord();

        String accountLine;
        String firstName, lastName;
        while((accountLine = accountReader.readLine()) != null) {
            Object[] splitAccount = accountLine.split(" ");

            firstName = (String) splitAccount[1];
            lastName = (String) splitAccount[2];
            account.setAccount(Integer.parseInt((String) splitAccount[0]));
            account.setBalance(Double.parseDouble((String) splitAccount[3]));

            String trans_line;
            int accountNumber=0;
            while((trans_line=transReader.readLine())!=null) {
                Object[] splitTransaction = trans_line.split(" ");

                //System.out.println(line);
                accountNumber = Integer.parseInt((String) splitTransaction[0]);
                double transaction = Double.parseDouble((String) splitTransaction[1]);
                tr.setAccountNumber(accountNumber);
                tr.setAmount(transaction);
                if(accountNumber == account.getAccount()) {
                    System.out.printf("%nMatch found! Account %d's balance has been increaded by %.2f.%n", accountNumber, transaction);
                    System.out.println("Now it is " + account.combine(tr));
                    System.out.println("Saving new data to 'newmaster.txt'");
                    pw.println(account.getAccount() + " " + firstName + " " + lastName + " " + account.combine(tr));
                    break;
                }
            }//end while
        }//end while

        pw.close();
        transReader.close();
        accountReader.close();

    }//end match
}//end ReadAndMatchTestData class

public class Test {
    public static void main(String[] args) throws IOException {
        CreateTestData.WriteToMaster();
        CreateTestData.WriteToTrans();
        ReadAndMatchTestData.Match();
    }
}//end Test class