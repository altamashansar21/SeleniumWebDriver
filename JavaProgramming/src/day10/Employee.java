package day10;

public class Employee {
	
	//Variable
	int id ;
	String name ;
	String job;
	int Salary ;
	
	// Methods 
	void display(){
		System.out.println(id);
		System.out.println(name.trim());
		System.out.println(job.toUpperCase());
		System.out.println(Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 

		// Object
		Employee emp1 = new Employee();
		emp1.id=2300;
		emp1.job="Manager";
		emp1.name ="    altamash   ";
		emp1.Salary=40000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.id=11100;
		emp2.job="owner";
		emp2.name ="   Aafee   ";
		emp2.Salary=60000;
		emp2.display();
		
		
		
		

	}

}
