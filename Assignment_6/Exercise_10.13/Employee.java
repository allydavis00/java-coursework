//Allyson Davis
//Exercise 10.13
//Employee.java
//Based on Fig 10.4 in book

public abstract class Employee {
    private final String firstname;
    private final String lastname;
    private final String ssn;
    private Date birthDate;

    //constructor
    public Employee(String firstname, String lastname, String ssn, Date birthDate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthDate = birthDate;
    }//end constructor

    //get methods
    //return first name
    public String getFirstName() {return firstname;}

    //return last name
    public String getLastName() {return lastname;}

    //return ssn
    public String getSSN() {return ssn;}

    public void setBirthday(Date birthDate)
   {
       this.birthDate = birthDate;
   }
   public Date getBirthdate()
   {
       return birthDate;
   }

    //return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSSN());
    }//end toString

    //abstract method must be overridden by concrete subclasses
    public abstract double earnings();  //np implementation here
}