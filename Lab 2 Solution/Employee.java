public class Employee implements Cloneable{
    private String name;
    private int id;
    private int age;
    private String state;
    private int zipCode;
    private String advisor;
	
	//No argument constructor (Will set instance variables to zero or null to the new employee)
    public Employee() {
        name = null;
        id = 0;
        age = 0; 
        state = null;
        zipCode = 0;
        advisor = null;
    }
	
	//Copy constructor (Will copy the instance variables from obj to the new employee)
    public Employee(Object obj) {
        if (obj == null || !(obj instanceof Employee)) {
            throw new IllegalArgumentException("Invalid argument");
        }
        Employee emp = (Employee) obj;
        name = emp.name;
        id = emp.id;
        age = emp.age;
        state = new String(emp.state);
        zipCode = emp.zipCode;
        advisor = new String(emp.advisor);
    }
	
	//clone method (Will clone the current employee data to new employee)
    public Employee clone() {
        try{
            Employee clonedEmp = (Employee) super.clone();
		    clonedEmp.name = new String(name);
            clonedEmp.id = id;
            clonedEmp.age = age;
		    clonedEmp.state = new String(state);
		    clonedEmp.zipCode = zipCode;
            clonedEmp.advisor = new String(advisor);
            return clonedEmp;
        }
        catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("This class does not implement Cloneable.");
		}
    }
	
	//Getter and setters (Will get and set values to the instance variables)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public String getAdvisor() {
        return advisor;
    }
    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }
	
	//toString method (Will return all the information of an employee as a string)
    public String toString() {
        return "Employee Name: " + name + ", Employee ID: " + id + ", Age: " + age + ", State: " + state + ", Zip Code: " + zipCode + ", Advisor: " + advisor;
    }
	
	//equals method (Will check whether the ids of two objects are equal)
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Employee)) {
            throw new IllegalArgumentException("Invalid argument");
        }
        Employee emp = (Employee) obj;
        return id == emp.id;
    }
}