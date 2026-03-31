package day9;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {

		
		// mutable - we can change
		int a [] = {20, 30,10,60, 50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// immutable --> we can not change
		String s = new String("Welcome");
		System.out.println(s);
		s = s.concat("To Mkn");
		System.out.println(s);

	}

}
