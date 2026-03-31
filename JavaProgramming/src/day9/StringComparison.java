package day9;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Case1
		System.out.println("Case1 :");
			String b1 = "Ansar";
		String b2 = "Ansar";
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println();
		
		// Case2
		System.out.println("Case2 :");
		String s1 = new String("Imran");
		String s2 = new String("Imran");
		System.out.println(s1==s2); // false 	// to compare the object
		System.out.println(s1.equals(s2)); // true 	// to compare the value of object
		System.out.println();
		
		//Case3
		System.out.println("Case3 :");
		String a1 = "abc";
		String a2 = new String("abc");
		System.out.println(a1==a2);	// false 
		System.out.println(a1.equals(a2)); // true 
		System.out.println();
		
		// Case4
		System.out.println("Case4 :");
		
		String c1 = "abc";
		String c2= new String("abc");
		String c3 = c2;
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c3==c2);
		System.out.println(c1.equals(c3));
		System.out.println();
	}

}
