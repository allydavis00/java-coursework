//Allyson Davis
//Exercise 15.4
//TransactionRecord.java

public class TransactionRecord {
    private int accountNumber;
    private double amount;

    public TransactionRecord(){};

    public TransactionRecord(int accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    //set/get account number
    public void setAccountNumber(int accountNumber){
       this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    //set/get transaction amount
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}//end class