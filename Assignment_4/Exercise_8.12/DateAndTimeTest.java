//Allyson Davis
//Exercise 8.12
//DateAndTimeTest.java

public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dt1 = new DateAndTime(12, 23, 2014, 12, 15, 43);
        DateAndTime dt2 = new DateAndTime(11, 12, 2003, 22, 58, 59);

        display("Starting Date/Time 1: ", dt1);
        dt1.tick();
        display("After incrementing one second:", dt1);
        dt1.incrementMinute();
        display("After incrementing one minute:", dt1);
        dt1.incrementHour();
        display("After incrementing one hour:", dt1);

        System.out.println();

        display("Starting Dat/Time 2: ", dt2);
        dt2.tick();
        display("After incrementing one second:", dt2);
        dt2.incrementMinute();
        display("After incrementing one minute:", dt2);
        dt2.incrementHour();
        display("After incrementing one hour:", dt2);

    }//end main

    private static void display(String header, DateAndTime d) {
        System.out.printf("%s%n   %s%n   %s%n", header, d.toUniversalString(), d.toString());
    }
}