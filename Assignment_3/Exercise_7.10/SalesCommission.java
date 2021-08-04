//Allyson Davis
//salesCommission.java
//Exercise 7.10

import java.util.Scanner;

public class SalesCommission {
    public static void main (String[] args) {
        double[] salary = new double[10];
        int salesArray [] = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;

        for(int j = 0; j < salary.length;j ++) {
            salary[j] = 200.0 + (salesArray[j] * 0.09);

            if(salary[j] >= 200 && salary[j] <= 299) 
                a++;
            else if (salary[j] >= 300 && salary[j] <= 399)
                b++;
            else if (salary[j] >= 400 && salary[j] <= 499)
                c++;
            else if (salary[j] >= 500 && salary[j] <= 599)
                d++;
            else if (salary[j] >= 600 && salary[j] <= 699)
                e++;
            else if (salary[j] >= 700 && salary[j] <= 799)
                f++;
            else if (salary[j] >= 800 && salary[j] <= 899)
                g++;
            else if (salary[j] >= 900 && salary[j] <= 999)
                h++;
            else if (salary[j] >= 1000)
                i++;
        }//end for loop
        System.out.println("   Range\t   Number of Salespeople");
        System.out.printf("a) $200-299: %8d%n", a);
        System.out.printf("b) $300-399: %8d%n", b);
        System.out.printf("c) $400-499: %8d%n", c);
        System.out.printf("d) $500-599: %8d%n", d);
        System.out.printf("e) $600-699: %8d%n", e);
        System.out.printf("f) $700-799: %8d%n", f);
        System.out.printf("g) $800-899: %8d%n", g);
        System.out.printf("h) $900-999: %8d%n", h);
        System.out.printf("i) $1000 and over:  %d%n", i);

    } //end main
}