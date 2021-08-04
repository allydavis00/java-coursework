//Allyson Davis
//Exercise 8.8
//Date.java

public class Date {
    private int month;  //1-12
    private int day;    //1-31 based on month
    private int year;   //any year
    private final int MAXVALUE = 2020;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //constructor: confirm proper value for month and day given the year
    public Date (int month, int day, int year) {
        //check if month is in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        //check is day is in range
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        //check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        //check if year is in range
        if (year < 0 || year > MAXVALUE) {
            throw new IllegalArgumentException("year (" + year + ") out-of-range");
        }

        this.month = month;
        this.day = day;
        this.year = year;
        System.out.printf("Date object constructor for data %s%n", this);
    }//end constructor

    //return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public void nextDay() {
        if (day == 28 && month == 2 && year % 400 == 0) {
            day += 1;
        } else if (day >= daysPerMonth[month]) {
            nextMonth();
        } else
            day += 1;
    }

    private void nextMonth() {
        if (month == 12) {
            nextYear();
        } else {
            month = month+1;;
            day = 1;
        }
    }
        
    private void nextYear() {
        year = year+1;
        month = 1;
        day = 1;
    }
}//end Date class