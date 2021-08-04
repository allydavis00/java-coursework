//Allyson Davis
//Exercise 8.7
//Time2Test.java - From book

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(22, 58, 59);
        Time2 t2 = new Time2(4, 23, 59);

        displayTime("Starting Time of t1:", t1);
        t1.tick();
        displayTime("t1 after incrementing second:", t1);
        t1.incrementMinute();
        displayTime("t1 after incrementing minute:", t1);
        t1.incrementHour();
        displayTime("t1 after incrementing hour:", t1);

        System.out.println();

        displayTime("Starting Time of t2:", t2);
        t2.tick();
        displayTime("t2 after incrementing second:", t2);
        t2.incrementMinute();
        displayTime("t2 after incrementing minute:", t2);
        t1.incrementHour();
        displayTime("t2 after incrementing hour:", t2);
    }//end main

    //displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }//end displayTime
}//end Time2Test class