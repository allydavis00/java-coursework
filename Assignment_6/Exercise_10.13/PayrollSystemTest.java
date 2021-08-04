//Allyson Davis
//Exercise 10.13
//PayrollSystemTest.java
//Based on Fig 10.9 in book

public class PayrollSystemTest {
    public static void main(String[] args) {
        //create current date
        Date currentDate = new Date(10, 10, 2020);
        System.out.printf("Current Date: %s%n%n", currentDate.toString());

        //create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(10,24,1972), 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(3,16,2000), 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(4,10,1983), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(10,12,1998), 5000, .04, 300);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        //create four-element Employee array
        Employee[] employees = new Employee[4];

        //initialize array with employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        //generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            //determine whether element is a BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionEmployee) {
                //downcast Employee reference to BasePlusCommissionEmployeee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increse is: $%,.2f%n", employee.getBaseSalary());
            }
            if(currentDate.getMonth()==currentEmployee.getBirthdate().getMonth()) {
                System.out.printf("earned $%,.2f %s\n\n", currentEmployee.earnings() + 100.00, "*Note: + $100 bonus to payroll amount for birthday!*");
            } else {
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
            }
        }//end for

        //get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }//end main
}//end class