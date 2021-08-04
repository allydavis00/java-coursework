//Allyson Davis
//Exercise 10.13
//HourlyEmployee.java
//Based on Fig 10.6 in book

public class HourlyEmployee extends Employee {
    private double wage; //wage per hour
    private double hours;   //hours worked for week

    //constructor
    public HourlyEmployee(String firstname, String lastname, String ssn, Date birthDate, double wage, double hours) {
        super(firstname, lastname, ssn, birthDate);

        //if wage is invalid throw exception
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        //if hours is invalid throw exception
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }

        this.hours = hours;
        this.wage = wage;
    }//end constructor

    //set wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        this.wage = wage;
    }//end setWage

    //return wage
    public double getWage() {return wage;}

    //set hours worked
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }

        this.hours = hours;
    }//end setHours

    //get hours worked
    public double getHours() {return hours;}

    //calculate earnings: override abstract method earnings in Employee
    @Override
    public double earnings() {
        if(getHours() <= 40) {
            return getWage() * getHours();
        }
        else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }//end earnings 

    //return String representation of HourlyEmployee
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }


}//end class