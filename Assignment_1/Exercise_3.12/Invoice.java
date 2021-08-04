//Allyson Davis
//Invoice.java

import java.util.Scanner;

public class Invoice {
        private String partnum, description;
        private int quantity;
        private double price;
        
        public Invoice (String partnum, String description, int quantity, double price) {
            this.partnum = partnum;
            this.description = description;

            if (quantity < 0)
                this.quantity = 0;
            else
                this.quantity = quantity;

            if (price < 0.0)
                this.price = 0.0;
            else
            this.price = price;
        }//end constructor
        
        public void setPartNum(String partnum) {
            this.partnum = partnum;
        }
        public String getPartNum() {
            return partnum;
        }

        public void setDescription (String description) {
            this.description = description;
        }
        public String getDescription () {
            return description;
        }

        public void setQuantity (int quantity) {
            if (quantity < 0){
                this.quantity = 0;
            }
            else
                this.quantity = quantity;
        }
        public int getQuantity () {
            return quantity;
        }

        public void setPrice(double price) {
            if (price < 0.0){
                this.price = 0.0;
            }
            else
                this.price = price;
        }
        public double getPrice () {
            return price;
        }

        public double getInvoiceAmount() {
            return quantity * price;
        }
}//end Ivoice class
