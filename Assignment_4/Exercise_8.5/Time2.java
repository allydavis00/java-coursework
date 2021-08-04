//Allyson Davis
//Exercise 8.5
//Time2.java

public class Time2 {
    private int hour;   // 0-23
    private int minute; // 0-59
    private int second; // 0-59

    //Time2 no-argument constructor:
    //initializes each instance var to zero
    public Time2() {
        this (0, 0, 0); //invoke constructor with three arguments
    }

    //Time2 constructor: hour supplied, minute and second default to 0
    public Time2(int hour) {
        this(hour, 0, 0);   //invoke constructor with threee arguments
    }

    //Time2 constructor: hour and minute supplied, second default to 0
    public Time2(int hour, int minute) {
        this(hour, minute, 0);  //invoke constructor with three arguments
    }

    //Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second) {
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
    }

    //Time2 constuctor: anotoherTime2 object supplied
    public Time2(Time2 time) {
        this(time.hour, time.minute, time.second);
    }

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

    public long getSecondsSinceMidnight()
	{
    return (hour*3600 + minute*60 + second);
	}

    //convert string in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    //convert string in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s (%d seconds since midnight)", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"), getSecondsSinceMidnight());
    }

}//end class