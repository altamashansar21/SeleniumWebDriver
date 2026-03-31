package day11;

public class Student {
	// variables
	int sid;
	String sname ;
	char grad ;
	
	//1) Method
	void PrindStudentData() {
	System.out.println(sid +"   "+ sname +"   "+grad);
	}
	// 2) Method
	
	void PrintStudentData(int id, String name, char gr) 
	{	sid = id;
		sname = name;
		grad = gr;
		}
	
	
	// 3) For Constructor
			Student(int id, String name, char gr)
			{	sid = id;
				sname = name;
				grad = gr;
				
	}

}
