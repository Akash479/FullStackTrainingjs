package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Hashset {
	
	public static void main(String args[]) {
		
		HashSet<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(13);
		hs.add(15);
		hs.add(12);
		hs.add(15);
		System.out.println(hs);
		
		LinkedHashSet<Integer> ll= new LinkedHashSet<>();
		ll.add(51);
		ll.add(15);
		ll.add(15);
		ll.add(95);
		ll.add(65);
		System.out.println(ll);
		
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(51);
		ts.add(15);
		ts.add(15);
		ts.add(95);
		ts.add(65);
		System.out.println(ts);
		
	}

}
