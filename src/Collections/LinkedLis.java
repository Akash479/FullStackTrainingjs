package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLis {
	
	
	public static void main (String args[]) {
		
		List< Integer> al = new LinkedList();
		 al.add(1);
		 al.add(2);
		 al.add(2);
		 al.add(0, 55);
		 al.add(88);
		 al.add(88);
		 System.out.println(al.contains(5));
		 System.out.println("Index::::    "+al.get(5));
		 System.out.println( "Size of Array :::  " +al.size());
		 al.remove(5);
		 System.out.println( "Size of Array :::  " +al.size());
		 System.out.println("Array Before SOrting ::"+ al);
		 Collections.sort(al);
		al.forEach(i->System.out.println(i));
		
	
	}
}
