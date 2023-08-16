import java.util.Arrays;

public class EmployeeTable {
    private Employee[] employees;
    private int size;
    
    public EmployeeTable(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;
    }

	public Employee[] getEmployees() {
        return employees;
    }
    
    public void put(Employee e) {
        int index = findIndex(e.getEmployeeNo());
        if (index == -1) {
            throw new IllegalArgumentException("Employee with employee number already exists!");
        }
        employees[index] = e;
        size++;
    }

	public String toString(Employee[] e) {
        String result = "";
		for (Employee emp : e){
			if(emp!=null)
			result = result + "[employee_no=" + String.valueOf(emp.getEmployeeNo()) +", name="+ emp.getName() + "], ";
			else result = result+"null, ";
		}
		return result;
    }
    
    public boolean remove(int emp_no) {
        int index = findIndex(emp_no);
        if (index == -1) {
            return false;
        }
        employees[index] = null;
        size--;
        return true;
    }
    
    public int search(int emp_no) {
        int index = findIndex(emp_no);
        if (employees[index] == null) {
            return -1;
        }
        return index;
    }
    
    private int findIndex(int emp_no) {
        int hash = hashFunction(emp_no);
        for (int i = 0; i < employees.length; i++) {
            int index = (hash + i) % employees.length;
            if (employees[index] == null || employees[index].getEmployeeNo() == emp_no) {
                return index;
            }
        }
        return -1;
    }
    
    private int hashFunction(int emp_no) {
        Integer empNoInteger = Integer.valueOf(emp_no);
    	return Math.abs(empNoInteger.hashCode()) % employees.length;
    }	
}
