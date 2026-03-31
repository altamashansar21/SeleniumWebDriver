package day9;

public class ReverseAString {

	public static void main(String[] args) {
	/*
		//Approch1 length() , charAT()
		String s = "Welcome";
		String r ="";
		for (int i = s.length()-1 ; i>=0; i--) {
			r = r+s.charAt(i);
			
		}
		System.out.println(r);	*/
		
		//Approch2 --> Without using String methods 
		String s = "Welcome";
		String r ="";
		char a[] = s.toCharArray();
		for (int i =a.length-1; i>=0; i--) {
			r = r+a[i];
			
		}
	System.out.println(r);
	
	// Approch3 
	// StringBuffer
	StringBuffer ss = new StringBuffer("Altamash Ansar");
	System.out.println(ss.reverse());
	
	// Approch4
	// StringBuilder
	StringBuilder sss= new StringBuilder("Altamash Ansar");
	System.out.println(sss.reverse());
	}
	
}
