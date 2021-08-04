//Allyson Davis
//Exercise 8.12
//DateAndTime.java

public class DateAndTime {
    private int month;  //1-12
    private int day;    //1-31 based on month
    private int year;   //any year
    private final int MAXVALUE = 2020;

    private int hour;   // 0-23
    private int minute; // 0-59
    private int second; // 0-59

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateAndTime (int month, int day, int year, int hour, int minute, int second) {
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

        //check time
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 ||second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }//end constructor

        //Set Methods
    //Set a new time value using universal time:
    //Validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 ||second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }//end setTime

    //validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }//end setHour

    //validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;
    }//end setMinute

    //validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.second = second;
    }//end setSecond

    //Get Methods
    //get hour value
    public int getHour() {return hour;}

    //get minute value
    public int getMinute() {return minute;}

    //get second value
    public int getSecond() {return second;}

    //get month
    public int getMonth() {return month;}

    //get day
    private int getDay() {return day;}

    //get year
    private int getYear() {return year;}

    public String toUniversalString() {
        return String.format("%d/%d/%d  %02d:%02d:%02d", getMonth(), getDay(), getYear(), getHour(), getMinute(), getSecond());
    }

    //convert string in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d/%d/%d  %d:%02d:%02d %s", getMonth(), getDay(), getYear(), ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    //Incrementing Methods
    //increment by one second
    public void tick() {
        if (this.second < 59) 
            this.second++;
        else if (this.minute < 59) {
            this.second = 0;
            this.minute++;
        } else if (this.hour < 23) {
            this.second = 0;
            this.minute = 0;
            this.hour++;
        } else {
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }
    }//end tick

    //increment by one minute
    public void incrementMinute() {
        if (this.minute < 59) {
            this.minute++;
        } else if (this.hour < 23) {
            this.minute = 0;
            this.hour++;
        } else {
            this.minute = 0;
            this.hour = 0;
        }
    }//end incrementMinute

    //increment by one hour
    public void incrementHour() {
        if (this.hour < 23)
            this.hour++;
        else   
            this.hour = 0;
            nextDay();
    }//end incrementHour

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
}