package accessMo;

import java.util.Arrays;

public class AccessMod extends ClassDemo4 {
	
  	 void 	m2(){
			System.out.println("m2");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4}; // Array 
		//System.out.println(arr[4]);
	   for (int i:arr) {
		   System.out.println(i);
	   }
	   
	   for (int i=0;i<=arr.length-1;i++) {
		   System.out.println(arr[i]);
	   }


	}

}

//private 
//default
//protected
//public 