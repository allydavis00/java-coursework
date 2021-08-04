//Allyson Davis
//Exercise 9.15
//HourlyEmployee.java

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstname, String lastname, String ssn, double wage, double hours) {
        super(firstname, lastname, ssn);

        //if hours is invalid throw exception
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }

        //if wage is invalid throw exception
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        this.hours = hours;
        this.wage = wage;
    }//end constructor

    //set methods
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }

        this.hours = hours;
    }//end setHours

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        this.wage = wage;
    }//end setWage

    //get methods
    public double getHours() {return hours;}

    public double getWage() {return wage;}

    public double earnings() {
        return getHours() * getWage();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f", "hourly employee", super.toString(), "hours", getHours(), "wage", getWage());
    }

}//end class