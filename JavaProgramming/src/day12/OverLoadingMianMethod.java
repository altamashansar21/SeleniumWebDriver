package day12;

public class OverLoadingMianMethod {
	
	void main (int x)
	{
		System.out.println(x);
	}
	void main (String n)
	{
		System.out.println(n);
	}
	void main (String a1, String a2)
	{
		System.out.println(a1+a2);
	}

	public static void main(String[] args) {
	
		OverLoadingMianMethod o = new OverLoadingMianMethod();
		o.main(1000);
		o.main("Altamash");
		o.main("Altamash", " Ansar");

	}

}
