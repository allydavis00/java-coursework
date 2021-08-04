//Allyson Davis
//Exercise 9.15
//HourlyEmployeeTest.java

public class HourlyEmployeeTest {
    public static void main (String[] args) {
        HourlyEmployee employee = new HourlyEmployee("Sue", "Jones", "222-22-2222", 9.50, 56);

        //get hourly employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSSN());
        System.out.printf("%s %.2f%n", "Hours is", employee.getHours());
        System.out.printf("%s %.2f%n", "Wage is", employee.getWage());

        employee.setHours(74);
        employee.setWage(10.05);

        System.out.printf("%n%s:%n%n%s%n", "updated employee information obtained by toString", employee);
    }//end main
}//end class