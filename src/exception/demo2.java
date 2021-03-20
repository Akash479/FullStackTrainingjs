package exception;

import java.io.IOException;
import java.sql.SQLException;

//class InvalidAge extends Exception{
//	InvalidAge(String s){
//		super(s);
//	}

class parent {
	void m1() throws IOException
	{
		System.out.println("In m1 A");
	}
//	void m2() throws Exception {
//		
//	}
}
class B extends parent
{
	void m1() 
	{
		System.out.println("In m1 B");
	}
}

public class demo2  {
//	void m2() throws  Throwable  {
//		
//	}
	
	
	public static void main(String args[]) {
		parent a=new B();
		try {
			a.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

//	void validate( int year) {
//		if(year ==2020) {
//			System.out.println("Current Year");
//		}
//		else {
//		throw	new  ArithmeticException("Not Current Year");
//		}
//	}
//	
//	public static void main(String args[]) {
//		
//		demo2 d2= new demo2();
//		d2.validate(2021);
//	}

	
//	
//	void m() throws ArithmeticException  {
//		int data=50/0;
//	}
//	void m2() {
//		m();
//	}
//	
//	void m3() {
//		m2();
//	}
//	
//	
//	public static void main(String args[]) {
//		
//		demo2 d2= new demo2();
//		d2.m();
////	}
//		void 	validateAge(int age) throws InvalidAge {
//			if(age <18) {
//				throw new InvalidAge("you Are Not Allowed");
//			}else {
//				System.out.println("You Can Login");
//			}
//		}
//		
//		public static void main(String args[]) throws InvalidAge {
//			
//			demo2 d2= new demo2();
//			d2.validateAge(18);
//		}
//	
	

