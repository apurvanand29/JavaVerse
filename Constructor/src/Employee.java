/**
 * This Employee class will help you access employee records using
 * different constructors
 */
public class Employee {
    public static void main(String[] args) throws Exception {

        // Object declaration
        EmployeeDetails emp1, emp2, emp3;

        /**
         * Object creation for employees: emp1,emp2,emp3
         */
        emp1 = new EmployeeDetails("Susan Meyers", 8647765, "IT", "Sr Programmer/Analyst");
        emp2 = new EmployeeDetails("Ahmad Karim", 5424130);
        emp3 = new EmployeeDetails();

    }
}
