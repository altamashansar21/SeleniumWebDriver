package day13;

public class TheKeywords {

		int x,y; // ---> class variables / instance variables 
		
		/*public TheKeywords(int x , int y) {
			this.x = x;
			this.y = y;
		}*/
		
		void setdata(int x, int y)
		{
			this.x = x;
			this.y = y;
			
		}
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
	public static void main(String[] args) {
		TheKeywords th = new TheKeywords();
		th.setdata(10, 22);
		th.display();
	}

}
