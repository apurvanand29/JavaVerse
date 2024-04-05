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

    /**
     * This is a 2 parameter constructor
     * 
     * @param empName
     * @param empId
     */
    public EmployeeDetails(String empName, int empId) {
        name = empName;
        idNumber = empId;
        department = "";
        position = "";
    }

    /**
     * This is a non-parameterized constructor
     */
    public EmployeeDetails() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    /**
     * These mutators will help set data for private members
     * 
     * @param name,idNumber,department,position
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * These accessors will get the private data value
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

}
