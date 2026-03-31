package day11;

public class ConstructorDemo  {
	
	int x,y;
	ConstructorDemo() 		// default Constructor
	{
		x = 100;
		y = 200;
	}
	ConstructorDemo (int a, int b)			// Parameterized
	{
		x = a;
		y = b;
	}
	
	void sum(){
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ConstructorDemo cd = new ConstructorDemo(); 	// invoke default constructor 
		ConstructorDemo cd = new ConstructorDemo(10, 20); 	// invoke Parameterized constructor 
		cd.sum();
		
		

	}

}
