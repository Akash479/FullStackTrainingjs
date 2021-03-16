package multiInher;

public class Class3  extends ClassB {
	
	
void m5() {
		
		System.out.println("class3 m5 ");
	}
	
	 public void m2(int s)
	    {
	    System.out.println("Int method called");
	    }
	    public void m2(long o)
	    {
	        System.out.println("LOng  method called");
	    }
	    public void m2(String  o)
	    {
	        System.out.println("String   method called");
	    }
	

	
	void m1() {
		int a=10;
		int b=15;
		System.out.println(a+b);
	}
	void m1(int a,int b) {
		System.out.println(a*b);
	}
	
	void m1(String a,String  b) {
		System.out.println(a+b);
	}
	
	void m1(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main (String args[]) {
		
//		Class3 cla= new Class3();
//		cla.m1();
//		
		Class3 cla= new Class3();
//		cla.m1();
//		cla.m1(10,20);
//		cla.m1(10, 20, 30);
//		cla.m2(5);
//		cla.m2("ashok");
		cla.m5();
		

		
	}

}
