package day13;

public class StaticDemeo {
	
	static int a = 100; 	// static variable
	int b = 200;
	
	static void m1 () // static method
	{
		System.out.println("This is m1 static method....");
	}
	void m2()
	{
		System.out.println("This is m2 non-static method....");
	}
	
	void m ()
	{
		System.out.println(a);
		m1();
		System.out.println(b);
		m2();
	}
	
	//public static void main(String[] args) {
		
	// 1. static method can access static stuff directly (without object).	
		//System.out.println(a);
		//m1();
	
	//System.out.println(b);			// cannot access , b is non-static 
		//m2();							// cannot access , me is non-static method
		
	// 2. static method can access non-static stuff though object.
		/*StaticDemeo s = new StaticDemeo();
		System.out.println(s.b);
		s.m2();*/
		
		// 3. non-static method can access everything directly.
//		StaticDemeo ss = new StaticDemeo();
//		ss.m();
//	
//	
//	}

}
