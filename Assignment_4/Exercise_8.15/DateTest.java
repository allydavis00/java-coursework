//Allyson Davis
//Exercise 8.15
//DateTest.java

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(12, 23, 2019);
        Date d2 = new Date("February", 12, 2003);
        Date d3 = new Date(120, 2009);

        System.out.println("Date 1: ");
        System.out.printf("%s%n%s%n%s%n", d1.writeSlashDate(), d1.writeLongDate(), d1.writeDayOfYear());

        System.out.println("\nDate 2: ");
        System.out.printf("%s%n%s%n%s%n", d2.writeSlashDate(), d2.writeLongDate(), d2.writeDayOfYear());

        System.out.println("\nDate 3: ");
        System.out.printf("%s%n%s%n%s%n", d3.writeSlashDate(), d3.writeLongDate(), d3.writeDayOfYear());
    }//end main
}