//Allyson Davis
//Exercise 9.14
//BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  //base salary per week

    //six-argument constructor
    public BasePlusCommissionEmployee(String firstname, String lastname, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstname, lastname, ssn, grossSales, commissionRate);

        //if baseSalary is invalid throw exception
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }//end constructor

    //set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }//end set base salary

    //return base salary
    public double getBaseSalary() {return baseSalary;}

    //calculate earnings
    @Override
    public double earnings() {return getBaseSalary() + super.earnings();}

    //return string representation of BaseCommissionEmployee
    @Override 
    public String toString() {
        return String.format("%s: %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}//end class