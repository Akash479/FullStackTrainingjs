package packifel;

public class demo11 {
//	static int x=25;
	static int x=0;

	public static void main(String[] args) {
		
//		if(x<10) {
//			System.out.println("x is greater than 10");
//		} else if(x>20) {
//			System.out.println("x is greater than 20");
//		}
//		else if(x>30) {
//			System.out.println("x is greater than 30");
//		}
//		else {
//			System.out.println("x less than 10");
//		}
		
//		if(x>20) {
//			if(x>25) {
//				System.out.println(" x is greater than 25");
//			}else if(x==25) {
//				System.out.println(" x  value is 25");
//			}else {
//				System.out.println(" x  less than  25");
//			}
//		}
		
//		switch(x) {
//		case (25):System.out.println(" x  value is 25"); break;
//		default: System.out.println("x value is not 25");
//		}
		
		int arra[]= {5,6,7,8,9};
		for (int i=0;i<=arra.length-1;i++) {
			if(arra[i]==7) {
				System.out.println(" value 7 present in array");
			}
			
		}
/**	
	while(x<10) {
	System.out.println(x);
		x++;
	}
*/
		
		do {
			System.out.println(x);
			x++;
		}
		while(x<10);
	}
		
	}


