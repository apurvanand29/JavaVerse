/**
 * This class will help you access the data members using Accessors and Mutators
 * and understand how constructors can be overloaded
 */
public class EmployeeDetails {

    // Variable Declaration
    private String name, department, position;
    private int idNumber;

    /**
     * This is a 4 parameter constructor
     * 
     * @param empName
     * @param empId
     * @param empDept
     * @param empPosition
     */
    public EmployeeDetails(String empName, int empId, String empDept, String empPosition) {
        name = empName;
        idNumber = empId;
        department = empDept;
        position = empPosition;
    }

}
