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
        emp1 = new EmployeeDetails("Mitha Antony", 8647765, "IT", "Sr Analyst");
        emp2 = new EmployeeDetails("Slashy Mishra", 5424130);
        emp3 = new EmployeeDetails();

        EmployeeDetails emp[] = { emp1, emp2, emp3 };
        for (int i = 0; i < emp.length; i++) {
            System.out.println("\nEmployee Name : " + emp[i].getName());
            System.out.println("Employee idNumber : " + emp[i].getIdNumber());
            System.out.println("Employee department : " + emp[i].getDepartment());
            System.out.println("Employee position : " + emp[i].getPosition());
        }

    }
}
