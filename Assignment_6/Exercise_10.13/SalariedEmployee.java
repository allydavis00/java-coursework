//Allyson Davis
//Exercise 10.13
//SalariedEmployee.java
//Based on Fig 10.5 in book

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    //constructor
    public SalariedEmployee(String firstname, String lastname, String ssn, Date birthDate, double weeklySalary) {
        super(firstname, lastname, ssn, birthDate);

        if(weeklySalary < 0.0) {
            throw new IllegalArgumentException ("Weekly salary must be >= 0.0");
        }//end if
        this.weeklySalary = weeklySalary;
    }//end constructor

    //set salary
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }//end if

        this.weeklySalary = weeklySalary;
    }//end setWeeklySalary

    //return salary
    public double getWeeklySalary() {return weeklySalary;}

    //calculate earnings: override mathod earnings in Employee
    @Override
    public double earnings() {return getWeeklySalary();}

    //return string represtation of Salaried Employee object
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }//end toString
}//end class