package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//Student std = new Student();
		// 1) using object reference variables
		/*std.sid=101;
		std.sname="Altamsh";
		std.grad='A';*/
		
		// 2) using method 
		//std.PrintStudentData(23005, "Imran", 'A');
		//std.PrindStudentData();
		
		// 3) using Constructor 
		
		Student std = new Student(1001, "AAFEE",'A');
		std.PrindStudentData();
		
	}

}
