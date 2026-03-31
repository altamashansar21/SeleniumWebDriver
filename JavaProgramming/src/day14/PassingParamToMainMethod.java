package day14;

public class PassingParamToMainMethod {

	public static void main(String args[]) {
		
		System.out.println(args[0]);
		System.out.println(args.length);
		
		for(String value : args)
		{
			System.out.println(value);
		}
		
		

	}

}
