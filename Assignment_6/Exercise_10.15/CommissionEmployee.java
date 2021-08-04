//Allyson Davis
//Exercise 10.15
//CommissionEmployee.java
//Based on Fig 10.7 in book

public class CommissionEmployee extends Employee {
    
    private double grossSales;  //gross weekly sales
    private double commissionRate;  //commission percentage

    //five-argument constructor
    public CommissionEmployee(String firstname, String lastname, String ssn, double grossSales, double commissionRate) {
        //implicit call to Object constructor occurs here
        super(firstname, lastname, ssn);

        //if grossSales is invalid throw exception
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        //if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }//end CommissionEmployee

    //set gross sales amount
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }//end setGrossSales

    //return gross sales amount
    public double getGrossSales() {return grossSales;}

    //set commison rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }//end setCommissionRate

    //return commission rate
    public double getCommissionRate() {return commissionRate;}

    //calculate earnings
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    //return String representation of CommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales", getGrossSales(), "commision rate", getCommissionRate());
    }
}//end class