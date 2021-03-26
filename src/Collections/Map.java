package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import javax.naming.LimitExceededException;

public class Map {
	
	
	public static void main(String args[]) {
		
//		HashMap<Integer, String> hm = new HashMap<>();
//		hm.put(1, "a");
//		hm.put(2, "a");
//		hm.put(98, "a");
//		hm.put(88, "a");
//		hm.put(78, "a");
//		hm.put(68, "a");
//		hm.put(38, "a");
//		System.out.println(hm.containsKey(98));
//		 System.out.println(hm.get(88));
//	hm.forEach((i,j)->{
//		System.out.println(i +   "   "+j);
//	});
	

//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
//		hm.put(1, "a");
//		hm.put(2, "a");
//		hm.put(98, "a");
//		hm.put(88, "a");
//		hm.put(78, "a");
//		hm.put(68, "a");
//		hm.put(2, "a");
//		System.out.println(hm.containsKey(98));
//		 System.out.println(hm.get(88));
//	hm.forEach((i,j)->{
//		System.out.println(i +   "   "+j);
//	});
		
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(1, "a");
		hm.put(2, "a");
		hm.put(98, "a");
		hm.put(88, "a");
		hm.put(78, "a");
		hm.put(68, "a");
		hm.put(2, "a");
		System.out.println(hm.containsKey(98));
		 System.out.println(hm.get(88));
	hm.forEach((i,j)->{
		System.out.println(i +   "   "+j);
	});
	}
		
		
		
	
	

}
