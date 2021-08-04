//Allyson Davis
//DateTest.java
//Exercise 8.8

public class DateTest {
    public static void main (String[] args) {
        Date d1 = new Date(11, 12, 2019);
        Date d2 = new Date(4, 30, 2004);
        Date d3 = new Date(12, 31, 2012);

        System.out.println("d1 Start Date: " + d1.toString());
        System.out.println("d2 Start Date: " + d2.toString());
        System.out.println("d3 Start Date: " + d3.toString());

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Increasing dates by one day...");

            d1.nextDay();
            System.out.println("new d1: " + d1.toString());

            d2.nextDay();
            System.out.println("new d2: " + d2.toString());

            d3.nextDay();
            System.out.println("new d3: " + d3.toString());
        }


    }//end main
}