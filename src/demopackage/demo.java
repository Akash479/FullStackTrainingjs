package demopackage;

public class demo {
//	 static int i=36;
//	
//	void m1() {
//		 int i=25;
//		System.out.println(i);
//		
//	}
//	void m2() {
//		System.out.println(i);
//	}
	int rollNo;
	String name;
	 static String ClgName;
	 static {
		 ClgName="DBSIT";
	 }
	 
	 
//	 method                           constructor
//	 explicitly called                   Implicity called 
//	 has a return type                   it doesent has return type
//     it can or cannot be class name       It should be same as class name.
	 
	
	demo(int rollNoo, String namye){
		name= namye;
		rollNo=rollNoo;
		
	}
     
	static int i=-1;
	public static void main(String[] args) {
		
	
		System.out.println(~i);
		
//		int age=25;
//		if(age >25) {
//			System.out.println("Value Greater than  25");
//		}else {
//			System.out.println("Value less  than  25");
//		}
//		System.out.println( age>25 ? "Value Greater than  25" : "Value less  than  25" );
		
//		demo d= new demo();
//		d.m1();
//		d.m2();
//		System.out.println(i);
//		demo d= new demo(1,"ashok");
//		System.out.println(d.getRollNo());
//		System.out.println(d.getClgName());
//		System.out.println(d.getName());
//		
//		demo d1= new demo(2,"samrat");
//		System.out.println(d1.getRollNo());
//		System.out.println(d1.getClgName());
//		System.out.println(d1.getName());

	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getClgName() {
		return ClgName;
	}


	public void setClgName(String clgName) {
		ClgName = clgName;
	}

}
