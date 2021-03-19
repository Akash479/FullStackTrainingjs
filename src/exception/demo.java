package exception;

import java.io.File;

public class demo {
	
	static String  x= null;
	final static  String s="samart";

	
	
	public static  void main (String args[]) {

		System.out.println(10+10);
		System.out.println(10-10);
		try {
			
			System.out.println("Exception Not Raised");
			System.out.println(10/0);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arith");
		}catch (NullPointerException e){
			System.out.println("Exception Raised");
		
		}finally {
			System.out.println("Finally");
		}
		
	}

}
