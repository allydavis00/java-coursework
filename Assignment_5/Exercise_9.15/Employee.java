//Allyson Davis
//Exercise 9.15
//Employee.java

public class Employee {
    private final String firstname;
    private final String lastname;
    private final String ssn;

    public Employee(String firstname, String lastname, String ssn) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }//end constructor

    //get methods
    //return first name
    public String getFirstName() {return firstname;}

    //return last name
    public String getLastName() {return lastname;}

    //return ssn
    public String getSSN() {return ssn;}

    //return String representation of Employee object
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "employee", getFirstName(), getLastName(), "social security number", getSSN());
    }

}//end class