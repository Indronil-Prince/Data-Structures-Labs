public class Employee {
    private int employee_no;
    private String name;
    
    public Employee(int empNo, String empName) {
        this.employee_no = empNo;
        this.name = empName;
    }
     public int getEmployeeNo()
     {
        return employee_no;
     }
     public String getName()
     {
        return name;
     }
}