package day9;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String --> immutable
		String a = "Altamash";
		System.out.println(a);
		a.concat(" Ansar ");
		System.out.println(a);
		
		// StringBuffer --> mutable
		StringBuffer s = new StringBuffer("Altamash ");
		System.out.println(s);
		s.append("Ansar");
		System.out.println(s);

	}

}
