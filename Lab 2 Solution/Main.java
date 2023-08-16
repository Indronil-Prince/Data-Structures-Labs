public class Main {
  public static void main(String[] args) {
	  
    //Test Employee class
    Employee emp1 = new Employee();
    emp1.setName("Indronil Bhattacharjee");
    emp1.setId(800778453);
    emp1.setAge(25);
    emp1.setState("New Mexico");
    emp1.setZipCode(88001);
    emp1.setAdvisor("Dr. Tuan Le");

    Employee emp2 = new Employee(emp1);
    Employee emp3 = emp1.clone();

    System.out.println("Employee1-> " + emp1.toString());
    System.out.println("Employee2-> " + emp2.toString());
    System.out.println("Employee3-> " + emp3.toString());
    System.out.println("Employee1 and Employee2 equal: " + emp1.equals(emp2));
    System.out.println("Employee1 and Employee3 equal: " + emp1.equals(emp3));
    emp1.setId(800777111);
    System.out.println("Employee1 and Employee3 equal: " + emp1.equals(emp3));

    //Test PseudoRandom class
    PseudoRandom pRandom = new PseudoRandom(1, 40, 3641, 729);
    System.out.println("First pseudorandom number: " + pRandom.getNextNumber());
    System.out.println("Second pseudorandom number: " + pRandom.getNextNumber());
    System.out.println("Third pseudorandom number: " + pRandom.getNextNumber());
    pRandom.setSeed(15);
    System.out.println("Next pseudorandom number: " + pRandom.getNextNumber());
    pRandom.setMultiplier(30);
    System.out.println("Next pseudorandom number: " + pRandom.getNextNumber());
    pRandom.setIncrement(500);
    System.out.println("Next pseudorandom number: " + pRandom.getNextNumber());
    pRandom.setModulus(400);
    System.out.println("Next pseudorandom number: " + pRandom.getNextNumber());
  }
}