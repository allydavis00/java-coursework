//Allyson Davis
//Exercise 8.15
//Date.java

public class Date {
    private int month;
    private int day;
    private int year;
    private final int MAXVALUE = 2020;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

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
    }//end constructor with 3 ints parameter

    public Date (String month, int day, int year) {
        if (findMonth(month) == 0) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }
        else {
            this.month = findMonth(month);
        }
        //check is day is in range
        if (day <= 0 || (day > daysPerMonth[this.month] && !(this.month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        //check for leap year if month is 2 and day is 29
        if (this.month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        //check if year is in range
        if (year < 0 || year > MAXVALUE) {
            throw new IllegalArgumentException("year (" + year + ") out-of-range");
        }

        this.day = day;
        this.year = year;
    }//end constructor with string parameter

    public Date (int day, int year) {
        dayOfMonth(day);

        //check if year is in range
        if (year < 0 || year > MAXVALUE) {
            throw new IllegalArgumentException("year (" + year + ") out-of-range");
        }
        this.year = year;
    }//end constructor with 2 int parameter

    public boolean isLeapYear() {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
            return true;
        else 
            return false;
    }//end isLeapYear

    //given day of month, find day of year
    public int dayOfYear() {
        int sum = 0;

        for (int i = 0; i < this.month; i++) {
            if (isLeapYear() && i == 2)
                sum += 29;
            else    
                sum += daysPerMonth[i];

            sum += this.day;
        }//end for
        return sum;
    }//end dayOfYear

    //given day of year, find day of month and month
    public void dayOfMonth(int d) {
        if(d > 0) {
            this.month = 1;
            while (d > daysPerMonth[month]) {
                if (isLeapYear() && this.month == 2)
                    d -= 29;
                else
                    d -= daysPerMonth[this.month];
                
                this.month++;
            }//end while

            this.day = d;
        }//end if
        else {
            this. day = 1;
            this.month = 1;
        }//end else
    }//end dayOfMonth

    //getter methods
    public int getMonth() {return month;}

    public int getDay() {return day;}
    
    public int getYear() {return year;}

    private int findMonth (String m) {
        int i = 0;
        for (i = 0; i < monthsArray.length; i++) {
            if(monthsArray[i].equals(m)) {
                break;
            }//end if
        }//end for

        return (i + 1);
    }//end findMonth

    private String findMonthString (int m) {
        return monthsArray[month - 1];
    }//end findMonthString

    //output methods
    public String writeSlashDate() {
        return (this.month + "/" + this.day + "/" + this.year);
    }//end writeSlashDate

    public String writeLongDate() {
        return (findMonthString(this.month) + " " + this.day + ", " + this.year);
    }//end writeLongDate

    public String writeDayOfYear() {
        return (dayOfYear() + " " + this.year);
    }//end writeDayOfYear

}//end class