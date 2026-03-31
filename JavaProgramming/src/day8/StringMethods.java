package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = ("Welcome");
		//String s = new String ("Altamash");
		//System.out.println(s);
		
		// length () --> return length of a string (Number of characters)
		
		String Name = ("Altamash");
		Name.length();
		//int l =Name.length();
		//System.out.println("Number of Characters: "+l);
		System.out.println("Number of Characters: " + Name.length()); 
		
		System.out.println("Aameer".length());
		
		//concat () --> joining string
		String s1 = "Altamash";
		String s2 = " to Ansar ";
		String s3 = "Engineering";
		System.out.println(s1+s2);
		String join =s1.concat(s2);
		System.out.println(join);
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		// trim () --> remove space right and left side 
		String abc = "   Welcome   ";
		System.out.println(abc); 	//print String along with space
		System.out.println("Befot triming :"+abc.length());
		
		System.out.println(abc.trim());
		System.out.println("After timing :"+abc.trim().length());
		
		//charAt () --> return a character from a string based on index 
		String ab = "Altamash";
		System.out.println(ab.charAt(4));
		
		// contains() ---> return true / false
		System.out.println(ab.contains("Alt"));	// true
		System.out.println(ab.contains("mash"));	 // true
		System.out.println(ab.contains("alt"));		// false
		
		// equals()  , equalsIgnorecase() , compare String
		String na1 = "Ali";
		String na2 = "Ali";
		System.out.println("value case me : "+na1==na2);// true
		
		System.out.println("value case me : "+na1.equals(na2)); // true
		
		String a1 = new String ("Altamas") ;
		String a2 = new String ("Altamas") ;
		
		System.out.println("raferences object new case me : " + a1==a2);
		System.out.println("raferences object new case me : " + a1.equals(a2));
		System.out.println(a1.equals("Altamas"));
		
		//replace() --> replace single / multiple (sequances) of character in string
		String intro = "My name is Altamash Ansar";
		System.out.println(intro.replace("Altamash Ansar", "Imran"));
		
		// SubString () --> Extract substring from the main string 
		// starting index 0
		// ending index 5
		String ss = "Altamash";
		System.out.println(ss.substring(0, 5));
		
		// toUpperCase() 	toLowerCase()
		String naam = "altamsh";
		String naam1 = "ALTAMASH";
		System.out.println(naam.toUpperCase());
		System.out.println(naam1.toLowerCase());
		
		//split --> split the string into multiple part base on the delimeter
		
		String email = "alt@gmail.com";
		String e[] = email.split("@");
		System.out.println(Arrays.toString(e));
		System.out.println(e[0]);
		System.out.println(e[1]);
		
		//ex1
		String amount = "$15,16,89";
		System.out.println(amount.replace("$",""));
		System.out.println(amount.replace("$","").replace(",", " "));
		
		//ex2
		String now = "abc,123@gmail.com";
		String arr [] =now.split(",");
		System.out.println(Arrays.toString(arr));	//[abc, 123@gmail.com]
		String arr1[] =arr[1].split("@");
		System.out.println(Arrays.toString(arr1));		//[123, gmail.com]
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

		//ex3
		String ne = "Alt mash";
		String alt[] =ne.split(" ");
		System.out.println(Arrays.toString(alt));
		
		//ex4
		String name1 ="John Kenedy";
		System.out.println(name1.contains("john"));
		System.out.println(name1.replace("J", "j").contains("john"));
		System.out.println(name1.toLowerCase().contains("john"));
		

		
	}

}
