package String;

public class strClass {
	
	static String s="samrat";
	static String s3="samrat";
	static char [] c= {'s','a','m','r','a','t'};
	
	// what is difference between .equals and ==
//	.equals   content
//	==        refernece 
	
	
	public static void main(String args[]) {
//		System.out.println(s);
		String s1= new String (c);
//		System.out.println(c);
//		 String s4=s3.concat("singh");
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s == s3); // true 
//		System.out.println(s .equals(s3));// true
//		System.out.println(s == s1); // false 
//		System.out.println(s .equals(s1));// true		
//		System.out.println(s .startsWith("s"));// true		
//		
		
		 // String Builder and String Buffer....
		
		//String Buffer Synchronized
		//String Builder  Not Synchronized
		
		StringBuffer sb= new StringBuffer("Samrat");
		sb.append("singh");
		System.out.println(sb);
	}

}
