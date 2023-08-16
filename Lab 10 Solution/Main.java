public class Main {
    public static void main(String[] args) {
		System.out.println("----------------Testing MinHeap----------------");
		MinHeap minHeap = new MinHeap();
		System.out.println("Adding 1:");
		minHeap.add(1);
		minHeap.print();
		
		System.out.println("Adding 2:");
		minHeap.add(2);
		minHeap.print();
		
		System.out.println("Adding 4:");
		minHeap.add(4);
		minHeap.print();
		
		System.out.println("Adding 6:");
		minHeap.add(6);
		minHeap.print();
		
		System.out.println("Adding 8:");
		minHeap.add(8);
		minHeap.print();
		
		System.out.println("Adding 3:");
		minHeap.add(3);
		minHeap.print();
		
		System.out.println("Adding 7:");
		minHeap.add(7);
		minHeap.print();
		
		System.out.println("Adding 5:");
		minHeap.add(5);
		minHeap.print();
		
		System.out.println("Removing top:");
		minHeap.remove();
		minHeap.print();
		
		System.out.println("Removing top:");
		minHeap.remove();
		minHeap.print();
		
		System.out.println("Top of the heap is: " + minHeap.top());
		System.out.println("Find the 4th smallest: " + minHeap.findKthSmallest(4));

        System.out.println();
        System.out.println("----------------Testing EmployeeTable----------------");
        EmployeeTable employeeTable = new EmployeeTable(5);
        
        System.out.println("Adding 5 Employees to Employee Table:");
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Mary");
        Employee e3 = new Employee(3, "Bob");
        Employee e4 = new Employee(4, "Alice");
        Employee e5 = new Employee(5, "Tom");
        
        employeeTable.put(e1);
        employeeTable.put(e2);
        employeeTable.put(e3);
        employeeTable.put(e4);
        employeeTable.put(e5);
        
        System.out.println(employeeTable.toString(employeeTable.getEmployees()));
        
        System.out.println("Removing Employee 3:");
        boolean removed = employeeTable.remove(3);
        System.out.println(removed);
        System.out.println(employeeTable.toString(employeeTable.getEmployees()));
        
        System.out.println("Searching Employee 2:");
        int index = employeeTable.search(2);
        System.out.println(index);
        System.out.println("Searching Employee 3:");
        index = employeeTable.search(3);
        System.out.println(index);

        System.out.println();
        System.out.println("----------------Testing Dictionary----------------");
        Dictionary dictionary = new Dictionary();
        dictionary.buildDictionary("example_words.txt");
        dictionary.search("Azure");
        dictionary.search("Able");
	}
}