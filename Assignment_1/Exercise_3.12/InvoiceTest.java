//Allyson Davis
//InvoiceTest.java

import java.util.Scanner;
public class InvoiceTest {

    public static void main (String[] args) {
        //create an invoice object
        Invoice invoice1 = new Invoice ("2N43S", "small wrench", 50, 7.50);

        //display current invoice
        System.out.println("Part Number: " + invoice1.getPartNum());
        System.out.println("Description: " + invoice1.getDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.printf("Price: $%.2f%n", invoice1.getPrice());
        System.out.printf("Invoice Amount: $%.2f%n", invoice1.getInvoiceAmount());

        //create scanner object for user input
        Scanner scnr = new Scanner(System.in);
        
        //let user update invoice
        System.out.print("\nEnter new Part Number: ");    //prompt
        String newPartNum = scnr.nextLine();
        invoice1.setPartNum(newPartNum);
        
        System.out.print("Enter Description: ");    //prompt
        String newDescr = scnr.nextLine();
        invoice1.setDescription(newDescr);

        System.out.print("Enter new Quantity: ");   //prompt
        int newQuantity = scnr.nextInt();
        invoice1.setQuantity(newQuantity);

        System.out.print("Enter new Price: ");   //prompt
        double newPrice = scnr.nextDouble();
        invoice1.setPrice(newPrice);

        //display changed invoice
        System.out.println("\nNew Part Number: " + invoice1.getPartNum());
        System.out.println("New Description: " + invoice1.getDescription());
        System.out.println("New Quantity: " + invoice1.getQuantity());
        System.out.printf("New Price: $%.2f%n", invoice1.getPrice());
        System.out.printf("New Invoice Amount: $%.2f%n", invoice1.getInvoiceAmount());
    }//end main
}//end invoicetest class